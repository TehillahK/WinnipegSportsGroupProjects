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
import comp3350.winSport.objects.League;
import comp3350.winSport.objects.Period;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;

import comp3350.winSport.persistence.IGame;

public class GameDataHSQLDB implements IGame {
    private final String dbUrl;

    public GameDataHSQLDB(final String dbUrl)
    {
        this.dbUrl=dbUrl;
    }
    private Connection connection() throws  SQLException{
        return DriverManager.getConnection("jdbc:hsqldb:file"+dbUrl+";shutdown=true","SA","");
    }
    
    @Override
    public List<Game> getGamesSequential() {




        return null;
    }

    @Override
    public Game getSingleGame() {
        return null;
    }
}
