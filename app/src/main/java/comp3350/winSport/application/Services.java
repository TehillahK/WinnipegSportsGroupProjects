package comp3350.winSport.application;

import comp3350.winSport.persistence.IGame;
import comp3350.winSport.persistence.IPlayer;
import comp3350.winSport.persistence.IPlayerStats;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.fakeDB.GameData;
import comp3350.winSport.persistence.fakeDB.PlayerData;
import comp3350.winSport.persistence.fakeDB.PlayerStatData;
import comp3350.winSport.persistence.fakeDB.TeamData;
import comp3350.winSport.persistence.hsqldb.GameDataHSQLDB;
import comp3350.winSport.persistence.hsqldb.PlayerDataHSQLDB;
import comp3350.winSport.persistence.hsqldb.PlayerStatsHSQLDB;
import comp3350.winSport.persistence.hsqldb.TeamDataHSQLDB;

public class Services {

    // ONE LINE DB SWITCH BOOLEAN.
    // Set to false to use our Fake DB.
    private static boolean useHSQLDB = true;

    private static ITeam teamPersistance = null;
    private static IGame gamePersistance = null;
    private static IPlayer playerPersistance = null;
    private static IPlayerStats playerStatsPersistance = null;

    public static synchronized ITeam getTeamPersistance() {
        if (teamPersistance == null) {
            if (useHSQLDB)
                teamPersistance = new TeamDataHSQLDB(Main.getDBPathName());
            else
                teamPersistance = new TeamData();
        }
        return teamPersistance;
    }

    public static synchronized IGame getGamePersistance() {
        if (gamePersistance == null) {
            if (useHSQLDB)
                gamePersistance = new GameDataHSQLDB(Main.getDBPathName());
            else
                gamePersistance = new GameData();
        }
        return gamePersistance;
    }

    public static synchronized IPlayer getPlayerPersistance() {
        if(playerPersistance == null) {
            if (useHSQLDB)
                playerPersistance = new PlayerDataHSQLDB(Main.getDBPathName());
            else
                playerPersistance = new PlayerData();
        }
        return playerPersistance;
    }

    public static synchronized IPlayerStats getPlayerStatsPersistance() {
        if(playerStatsPersistance == null) {
            if (useHSQLDB)
                playerStatsPersistance = new PlayerStatsHSQLDB(Main.getDBPathName());
            else
                playerStatsPersistance = new PlayerStatData();
        }
        return playerStatsPersistance;
    }

}
