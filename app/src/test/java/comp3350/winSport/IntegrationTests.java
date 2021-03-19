package comp3350.winSport;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comp3350.winSport.business.AccessPlayers;
import comp3350.winSport.tests.business.AccessGamesIT;
import comp3350.winSport.tests.business.AccessPlayerStatsIT;
import comp3350.winSport.tests.business.AccessPlayersIT;
import comp3350.winSport.tests.business.AccessTeamsIT;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AccessGamesIT.class,
        AccessPlayersIT.class,
        AccessPlayerStatsIT.class
})

public class IntegrationTests {
}
