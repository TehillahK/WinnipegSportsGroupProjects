package comp3350.winSport;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import comp3350.winSport.tests.business.AccessGamesTest;
import comp3350.winSport.tests.business.AccessPlayerStatsTest;
import comp3350.winSport.tests.business.AccessPlayersTest;
import comp3350.winSport.tests.business.AccessTeamsTest;
import comp3350.winSport.tests.objects.GameTest;
import comp3350.winSport.tests.objects.LeagueTest;
import comp3350.winSport.tests.objects.PeriodTest;
import comp3350.winSport.tests.objects.PlayerStatisticTest;
import comp3350.winSport.tests.objects.PlayerTest;
import comp3350.winSport.tests.objects.TeamTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AccessTeamsTest.class,
        AccessGamesTest.class,
        GameTest.class,
        LeagueTest.class,
        PeriodTest.class,
        PlayerTest.class,
        TeamTest.class,
        AccessPlayerStatsTest.class,
        AccessPlayersTest.class,
        PlayerStatisticTest.class
})

public class AllTests {
}
