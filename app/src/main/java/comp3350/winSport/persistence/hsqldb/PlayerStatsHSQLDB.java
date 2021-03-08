package comp3350.winSport.persistence.hsqldb;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Player;
import comp3350.winSport.persistence.IPlayerStats;

public class PlayerStatsHSQLDB implements IPlayerStats {

    private final String dbUrl;

    public PlayerStatsHSQLDB(final String dbUrl)
    {
        this.dbUrl=dbUrl;
    }

    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file"+dbUrl+";shutdown=true","SA","");
    }

    private Player fromResultSet(final ResultSet rs) throws SQLException {

        return null;
    }
        @Override
    public List<Player> getPlayersSequential() {
            final List<Player> players = new ArrayList<>();

            try (final Connection c = connection()) {
                final Statement st = c.createStatement();
                final ResultSet rs = st.executeQuery("SELECT * FROM PLAYER_STATS");

                while (rs.next()) {
                    final Player player = fromResultSet(rs);
                    players.add(player);
                }

                rs.close();
                st.close();
            }

            catch (final SQLException e) {
                Log.e("SQLException: GameData",e.toString());
            }

            return players;
    }

    @Override
    public Player getSinglePlayer() {

        final List<Player> players = new ArrayList<>();

        try (final Connection c = connection()) {
            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("SELECT * FROM PLAYER_STATS");

            while (rs.next()) {
                final Player player = fromResultSet(rs);
                players.add(player);
            }

            rs.close();
            st.close();
        }
        catch (final SQLException e) {
            Log.e("SQLException: GameData",e.toString());
        }

        return players.get(1);
    }

}
