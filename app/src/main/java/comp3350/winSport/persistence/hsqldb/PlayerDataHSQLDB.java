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

        final int playerID = rs.getInt("PlayerID");
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

}
