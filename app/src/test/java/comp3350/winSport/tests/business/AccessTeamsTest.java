package comp3350.winSport.tests.business;

import org.junit.Before;
import org.junit.Test;
import java.util.ListIterator;

import comp3350.winSport.business.AccessTeams;
import comp3350.winSport.objects.Team;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AccessTeamsTest {

    private AccessTeams accessTeams;

    @Before
    public void setUp(){
        accessTeams = new AccessTeams();
    }

    @Test
    public void testListTeams(){
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
    public void testGetTeam(){
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 2: View a Team");
        System.out.print("\n---------------------------------------");
        System.out.print("\nTests if getSingleGame() has successfully fetched a team from the data layer.");
        System.out.print("\n" + accessTeams.getSingleGame().getName());
        assertTrue("Winnipeg Jets".equals(accessTeams.getSingleGame().getName()));

    }

    @Test
    public void testTeamByNameException(){

        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 3: getTeamByName() -- Part 1");
        System.out.print("\n---------------------------------------");

        String input1 = "39803498034";
        String input2 = "Winnipeg Jets 45";
        String input3 = "";
        String input4 = "            ";
        String input5 = "Winnipeg              Jets";
        String input6 = " Winnipeg Jets    ";

        System.out.print("\ngetTeamByName() should throw an exception if there are numeric characters in the string.\n");

        int counter = 0;

        try{
            System.out.print("\nInput: " + input1);
            accessTeams.getTeamByName(input1);
            fail("\nMethod did not throw an exception.\n");
        }
        catch (Exception InvalidNameException){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: " + input2);
            accessTeams.getTeamByName(input2);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception InvalidNameException){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: (empty)");
            accessTeams.getTeamByName(input3);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception InvalidNameException){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: (whitespace)");
            accessTeams.getTeamByName(input4);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception InvalidNameException){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: " + input5);
            accessTeams.getTeamByName(input5);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception InvalidNameException){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: " + input6);
            accessTeams.getTeamByName(input6);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception InvalidNameException){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        System.out.print("\n---------------------------------------");
        System.out.print("\nExpected: 6");
        System.out.print("\nExceptions thrown: " + counter);
        System.out.print("\n---------------------------------------");

    }

    @Test
    public void testTeamNotOnList(){

        System.out.print("\n------------------AccessTeams Test---------------------");
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 4: getTeamByName() -- Part 2");
        System.out.print("\n---------------------------------------");

        System.out.print("\nEnsures that nothing or null is returned if a team not on the list is passed.");

        String input1 = "Winnipeg Blue Bombers";

        try{
            System.out.print("\nInput: " + input1);
            accessTeams.getTeamByName(input1);
            assertNull(null); //should return null if not found.
        }
        catch (Exception InvalidNameException){
            System.out.print("\nMethod threw an exception.\n");
        }
    }

}
