package comp3350.winSport.persistence.hsqldb;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.IPlayer;

public class PlayerDataHSQLDB implements IPlayer {

    private final String dbPath;
    List<String> validNames;


    public PlayerDataHSQLDB(final String dbPath) {
        this.dbPath = dbPath;
        this.validNames = constructNamesList();

    }

    private List<String> constructNamesList() {
        List<String> validNames = new ArrayList<>();

        validNames.add("calgary flames");
        validNames.add("winnipeg jets");
        validNames.add("montreal canadiens");
        validNames.add("ottowa senators");
        validNames.add("toronto maple leafs");
        validNames.add("edmonton oilers");

        return  validNames;
    }

    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    private Player fromResultSet(final ResultSet rs) throws SQLException {

        final int playerID = rs.getInt("playerID");
        final String name = rs.getString("Player");
        final int number = rs.getInt("Number");
        final String position = rs.getString("Position");
        final String shot = rs.getString("Shot");
        final String teamName = rs.getString("teamName");
        final int teamID = checkValid(teamName);

        return new Player(name,number,position,shot,teamName, R.drawable.headshot,playerID);
    }

    private int checkValid(String teamName) {
        // check name to see if we have pic for team,
        // otherwise will return generic pic id.
        for (String curr : validNames){
            if (curr.equals(teamName.toLowerCase())) {
                if (curr.contains("flames"))
                    return R.drawable.flames;
                else if (curr.contains("jets"))
                    return R.drawable.jets;
                else if (curr.contains("montreal"))
                    return R.drawable.montreal;
                else if (curr.contains("ottowa"))
                    return R.drawable.ottawa;
                else if (curr.contains("leafs"))
                    return R.drawable.leafs;
                else if (curr.contains("oilers"))
                    return R.drawable.oilers;
            }
        }
        return R.drawable.nhl;
    }

    public List<Player> getPlayers(String teamName) {
        final List<Player> players = new ArrayList<>();

        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("SELECT * FROM PLAYERS WHERE teamName=?");
            st.setString(1,teamName);

            final ResultSet rs = st.executeQuery();
            while (rs.next()) {
                final Player player = fromResultSet(rs);
                players.add(player);
            }

            rs.close();
            st.close();
        }
        catch (final SQLException e) {
            throw new PersistenceException(e);
        }

        return players;
    }

    @Override
    public Player insertPlayer(Player p) {
        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("INSERT INTO PLAYERS VALUES(?, ?, ?, ?, ?, ?)");
            st.setInt(1,p.getPlayerID());
            st.setString(2,p.getName());
            st.setInt(3,p.getNumber());
            st.setString(4,p.getPosition());
            st.setString(5,p.getShot());
            st.setString(6,p.getTeam());

            st.executeUpdate();

            return p;
        } catch (final SQLException e) {
            throw new PersistenceException(e);
        }
    }

    @Override
    public void insertAllPlayers(List<Player> p) {
        try {
            try (final Connection c = connection()) {

                String query = "INSERT INTO PLAYERS VALUES";
                for (int i= 0; i < p.size(); i++) {
                    Player player = p.get(i);
                    String playerName = player.getName().replaceAll("[']","");
                    String singleValue = String.format("(%s, '%s', %s, '%s', '%s', '%s')", player.getPlayerID(),playerName,
                            player.getNumber(),player.getPosition(),player.getShot(),player.getTeam());
                    if (i != p.size()-1)
                        singleValue+=",";
                    query+=singleValue;
                }

                final PreparedStatement st = c.prepareStatement(query);
                st.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Player updatePlayer(Player p) {

        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("UPDATE PLAYERS SET Position=? WHERE Player=?");
            st.setString(1,p.getPosition());
            st.setString(2,p.getName());
            st.executeUpdate();

            return p;
        } catch (final SQLException e) {
            throw new PersistenceException(e);
        }
    }


}
