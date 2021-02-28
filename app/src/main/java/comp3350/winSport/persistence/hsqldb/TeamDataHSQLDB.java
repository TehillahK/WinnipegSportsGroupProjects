package comp3350.winSport.persistence.hsqldb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.ITeam;


public class TeamDataHSQLDB implements ITeam {

    private final String dbPath;

    public TeamDataHSQLDB(final String dbPath) {
        this.dbPath = dbPath;
    }

    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    private Team fromResultSet(final ResultSet rs) throws SQLException {
        final int teamID = Integer.parseInt(rs.getString("TEAMID"));
        final String teamName = rs.getString("name");
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player());
        players.add(new Player());
        return new Team(teamName, players, teamID);
    }

    @Override
    public List<Team> getTeams() {

        final List<Team> teams = new ArrayList<>();

        try (final Connection c = connection()) {
            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("SELECT * FROM TEAMS");

            while (rs.next()) {
                final Team team = fromResultSet(rs);
                teams.add(team);
            }

            rs.close();
            st.close();
        }
        catch (final SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Team getSingleTeam() {
        return null;
    }

    @Override
    public Team getTeamByName(String name) {
        return null;
    }
}
