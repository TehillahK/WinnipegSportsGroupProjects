package comp3350.winSport;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comp3350.winSport.tests.business.AccessGamesTest;
import comp3350.winSport.tests.business.AccessTeamsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AccessTeamsTest.class,
        AccessGamesTest.class
})

public class AllTests {
}
