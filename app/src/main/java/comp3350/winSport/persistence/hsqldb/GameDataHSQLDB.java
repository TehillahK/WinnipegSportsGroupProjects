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

import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.League;
import comp3350.winSport.objects.Period;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.PlayerStatistic;
import comp3350.winSport.objects.Team;

import comp3350.winSport.persistence.IGame;

public class GameDataHSQLDB implements IGame {

    private final String dbPath;

    public GameDataHSQLDB(final String dbPath) {
        this.dbPath = dbPath;
    }

    private Connection connection() throws  SQLException{
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    private Game fromResultSet(final ResultSet rs) throws SQLException {
        final int gameID = rs.getInt("GAMEID");
        final String gameName = rs.getString("GAMENAME");
        final String gameLeague = rs.getString("LEAGUENAME");
        final String t1Name = rs.getString("TEAM1ID");
        final String t2Name = rs.getString("TEAM2ID");
        final String gameDate = rs.getString("DATE");
        final String gameLocation = rs.getString("LOCATION");
        final String gameScore = rs.getString("SCORE");

        return new Game(gameID,gameName,gameLeague,t1Name,t2Name,gameDate,gameLocation,gameScore);
    }
    
    @Override
    public List<Game> getGamesSequential() {

        final List<Game> games = new ArrayList<>();

        try (final Connection c = connection()) {
            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("SELECT * FROM GAMES");

            while (rs.next()) {
                final Game game = fromResultSet(rs);
                games.add(game);
            }

            rs.close();
            st.close();
        }
        catch (final SQLException e) {
            Log.e("SQLException: GameData",e.toString());
        }

        return games;

    }

    @Override
    public Game getSingleGame() {

        try (final Connection c = connection()) {

            // might need to either add error handling, or be Real sure that we pass a name that
            // exists.

            final PreparedStatement st = c.prepareStatement("SELECT * FROM GAMES WHERE Name=?");
            //st.setString(1,name);

            final ResultSet rs = st.executeQuery();
            Game game = fromResultSet(rs);

            rs.close();
            st.close();

            return game;
        }
        catch (final SQLException e)
        {
            throw new PersistenceException(e);
        }

    }

    @Override
    public Game insertGame(Game g) {

        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("INSERT INTO GAMES VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setInt(1,g.getGameID());
            st.setString(2,g.getGameName());
            st.setString(3,g.getGameLeague());
            st.setString(4,g.getTeam1());
            st.setString(5,g.getTeam2());
            st.setString(6,g.getGameDate());
            st.setString(7,g.getGameLocation());
            st.setString(8,g.getGameScore());
            st.setInt(9,g.getLeagueID());
            st.setInt(10,g.getGamePicID());
            st.executeUpdate();

            return g;
        } catch (final SQLException e) {
            throw new PersistenceException(e);
        }

    }

    @Override
    public Game updateGame(Game g) {

        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("UPDATE GAMES SET GameScore=?,GameDate=?");
            st.setString(1,g.getGameScore());
            st.setString(2, g.getGameDate());
            st.executeUpdate();

            return g;
        } catch (final SQLException e) {
            throw new PersistenceException(e);
        }

    }

    @Override
    public void deleteGame(Game g) {

        try (final Connection c = connection()) {
            final PreparedStatement st = c.prepareStatement("DELETE FROM GAMES WHERE Name = ?");
            st.setString(1, g.getGameName());
            st.executeUpdate();
        } catch (final SQLException e) {
            throw new PersistenceException(e);
        }

    }


}
