package comp3350.winSport.tests.business;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ListIterator;

import comp3350.winSport.buisness.AccessTeams;
import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Team;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AccessTeamsTest {

    private AccessTeams accessTeams;

    @Before
    public void setUp(){
        accessTeams = new AccessTeams();
    }

    @Test
    public void listTeams(){
        System.out.print("\n------------------Access Teams Test---------------------");
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 1: Listing Teams");
        System.out.print("\n---------------------------------------");
        ListIterator<Team> iterator = accessTeams.getTeams().listIterator();
        System.out.print("\nUsing iterator...\n");
        assertNotNull("First game should not be null.",iterator.hasNext());
        while (iterator.hasNext()){
            Team team = iterator.next();
            assertNotNull(team);
            System.out.print(team.getName() + "\n");

        }
    }

    @Test
    public void getTeam(){
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 2: View a Team");
        System.out.print("\n---------------------------------------");
        System.out.print("\n" + accessTeams.getSingleGame().getName());
        assertTrue("Winnipeg Jets".equals(accessTeams.getSingleGame().getName()));

    }

    @Test
    public void getTeamByName(){

        String input1 = "Winnipeg Jets";
        String input2 = "Toronto Maple Leafs";
        String input3 = "Blue Bombers";
        String input4 = "Toronto Leafs";
        String input5 = "293802948039";
        String input6 = "";

        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 3: Get Team By Name");
        System.out.print("\n---------------------------------------");
        System.out.print("\nIf assertion errors happen, this test has failed.");
        System.out.print("\nIf test print all output until 'END', and then all tests have passed.");
        System.out.print("\nChecking if " + input1 + " is in the team list. Expectation: true");
        assertTrue(input1.equals(accessTeams.getTeamByName(input1).getName()));
        System.out.print("\nPass");
        System.out.print("\nChecking if " + input2 + " is in the team list. Expectation: true");
        assertTrue(input2.equals(accessTeams.getTeamByName(input2).getName()));
        System.out.print("\nPass");

        //If these have assert errors, it means that AccessTeams is returning something
        //when it shouldn't.
        //Original value of a team is null, so if the passed string is not on the list,
        //it should stay null.
        System.out.print("\nNow checking for miscellaneous inputs.");
        System.out.print("\nNone of the following is in the list. List should not return anything.");
        System.out.print("\nIf an assertion error occurs, then the list has returned something it shouldn't have.");
        System.out.print("\nSearching for " + input3 +  "...");
        assertNull(accessTeams.getTeamByName(input3));
        System.out.print("\nPass");
        System.out.print("\nSearching for " + input4 + "...");
        assertNull(accessTeams.getTeamByName(input4));
        System.out.print("\nPass");
        System.out.print("\nSearching for " + input5 + "...");
        assertNull(accessTeams.getTeamByName(input5));
        System.out.print("\nPass");
        System.out.print("\nSearching for " + input6 + "...");
        assertNull(accessTeams.getTeamByName(""));
        System.out.print("\nPass");
    }

}
