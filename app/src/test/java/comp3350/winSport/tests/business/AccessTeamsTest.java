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
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 3: Get Team By Name");
        System.out.print("\n---------------------------------------");
        assertTrue("Winnipeg Jets".equals(accessTeams.getTeamByName("Winnipeg Jets").getName()));
        assertTrue("Toronto Maple Leafs".equals(accessTeams.getTeamByName("Toronto Maple Leafs").getName()));

        //If these have assert errors, it means that AccessTeams is returning something
        //when it shouldn't.
        //Original value of a team is null, so if the passed string is not on the list,
        //it should stay null.
        assertNull(accessTeams.getTeamByName("Blue Bombers"));
        assertNull(accessTeams.getTeamByName("Toronto Leafs"));
        assertNull(accessTeams.getTeamByName("293802948039"));
        assertNull(accessTeams.getTeamByName(""));
    }

}
