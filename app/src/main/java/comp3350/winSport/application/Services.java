package comp3350.winSport.application;

import comp3350.winSport.persistence.IGame;
import comp3350.winSport.persistence.IPlayer;
import comp3350.winSport.persistence.IPlayerStats;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.hsqldb.GameDataHSQLDB;
import comp3350.winSport.persistence.hsqldb.PlayerDataHSQLDB;
import comp3350.winSport.persistence.hsqldb.PlayerStatsHSQLDB;
import comp3350.winSport.persistence.hsqldb.TeamDataHSQLDB;

public class Services {

    private static ITeam teamPersistance = null;
    private static IGame gamePersistance = null;
    private static IPlayer playerPersistance = null;
    private static IPlayerStats playerStatsPersistance = null;

    public static synchronized ITeam getTeamPersistance() {
        if (teamPersistance == null) {
            teamPersistance = new TeamDataHSQLDB(Main.getDBPathName());
        }
        return teamPersistance;
    }

    public static synchronized IGame getGamePersistance() {
        if (gamePersistance == null) {
            gamePersistance = new GameDataHSQLDB(Main.getDBPathName());
        }
        return gamePersistance;
    }

    public static synchronized IPlayer getPlayerPersistance() {
        if(playerPersistance == null) {
            playerPersistance = new PlayerDataHSQLDB(Main.getDBPathName());
        }
        return playerPersistance;
    }

    public static synchronized IPlayerStats getPlayerStatsPersistance() {
        if(playerStatsPersistance == null) {
            playerStatsPersistance = new PlayerStatsHSQLDB(Main.getDBPathName());
        }
        return playerStatsPersistance;
    }



}
