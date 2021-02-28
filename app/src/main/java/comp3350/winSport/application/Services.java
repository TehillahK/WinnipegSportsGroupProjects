package comp3350.winSport.application;

import comp3350.winSport.persistence.IGame;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.hsqldb.TeamDataHSQLDB;

public class Services {

    private static ITeam teamPersistance = null;
    private static IGame gamePersistance = null;

    public static synchronized ITeam getTeamPersistance() {
        if (teamPersistance == null) {
            teamPersistance = new TeamDataHSQLDB(Main.getDBPathName());
        }
        return teamPersistance;
    }

}
