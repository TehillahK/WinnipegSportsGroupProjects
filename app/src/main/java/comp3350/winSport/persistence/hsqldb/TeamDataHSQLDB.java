package comp3350.winSport.persistence.hsqldb;
import android.util.Log;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessPlayers;
import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.persistence.ITeam;

public class TeamDataHSQLDB implements ITeam {

    private final String dbPath;
    private final AccessPlayers accessPlayers;

    public TeamDataHSQLDB(final String dbPath) {
        this.dbPath = dbPath;
        this.accessPlayers = new AccessPlayers();
    }

    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    private Team fromResultSet(final ResultSet rs) throws SQLException {
        final String teamName = rs.getString("NAME");
        List<Player> players;
        final int teamID;

        try {
            players = this.accessPlayers.getPlayers(teamName);
            teamID = rs.getInt("teamID");
            int pic;
            if (players.size() != 0)
                pic = players.get(0).getTeamPic();
            else
                pic = R.drawable.nhl;
            return new Team(teamName, players, pic,teamID);
        }
        catch (InvalidNameException e){
            System.out.print("Team is not on the list.");
        }
        return null;
    }

    @Override
    public List<Team> getTeams() {

        final List<Team> teams = new ArrayList<>();
        try (final Connection c = connection()) {
            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("SELECT DISTINCT * FROM TEAMS");

            while (rs.next()) {
                final Team team = fromResultSet(rs);
                teams.add(team);
            }

            rs.close();
            st.close();
        }
        catch (final SQLException e) {
            throw new PersistenceException(e);
        }

        return teams;
    }

    @Override
    public Team getSingleTeam() {
        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("SELECT TOP 1 * FROM PUBLIC.TEAMS");
            final ResultSet rs = st.executeQuery();
            final Team team;
            if (rs.next())
                team = fromResultSet(rs);
            else
                team = new Team();

            rs.close();
            st.close();

            return team;
        }
        catch (final SQLException e)
        {
            throw new PersistenceException(e);
        }
    }

    @Override
    public Team getTeamByName(String name) throws InvalidNameException {

        if (name.matches("^[a-zA-zé]+([\\s][a-zA-Zé]+)*$")) {

            final List<Team> teams = new ArrayList<>();
            try (final Connection c = connection()) {
                final Statement st = c.createStatement();
                final ResultSet rs = st.executeQuery("SELECT * FROM TEAMS WHERE NAME='" + name+"'");

                while (rs.next()) {
                    final Team team = fromResultSet(rs);
                    teams.add(team);
                }
                rs.close();
                st.close();
            }
            catch (final SQLException e) {
                throw new PersistenceException(e);
            }

            for (Team curr : teams) {
                if (curr.getName().equals(name))
                    return curr;
            }
        }
        else {
            throw new InvalidNameException("please pass a team name with letters only");
        }

        return null;
    }

}
