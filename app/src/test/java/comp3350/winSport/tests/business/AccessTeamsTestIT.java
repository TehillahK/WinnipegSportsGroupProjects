package comp3350.winSport.tests.business;

import org.junit.Before;

import java.io.File;
import java.io.IOException;

import comp3350.winSport.business.AccessTeams;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.hsqldb.TeamDataHSQLDB;
import comp3350.winSport.tests.utils.TestUtils;

public class AccessTeamsTestIT {
    //WIP

    private AccessTeams accessTeams;
    private File tempDB;

    @Before
    public void setUp() throws IOException {
        this.tempDB = TestUtils.copyDB();
        final ITeam team = new TeamDataHSQLDB(this.tempDB.getAbsolutePath().replace(".script",""));
        accessTeams = new AccessTeams(team);
    }

}
