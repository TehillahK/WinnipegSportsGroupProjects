package comp3350.winSport.tests.business;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.business.AccessGames;
import comp3350.winSport.business.AccessPlayers;
import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.persistence.IGame;
import comp3350.winSport.persistence.IPlayer;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AccessPlayersTest {

    private IPlayer iPlayer;
    private AccessPlayers accessPlayers;
    private AccessPlayers accessPlayersNoMock;

    @Before
    public void setUp(){
        iPlayer = mock(IPlayer.class);
        accessPlayers = new AccessPlayers(iPlayer);
        accessPlayersNoMock = new AccessPlayers();
    }

    @Test
    public void testGetPlayers() throws InvalidNameException {

        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 1: Get Players - Behaviour");
        System.out.print("\n---------------------------------------");
        System.out.print("\nGetting a single game...");

        final List<Player> dummyList;
        final List<Player> samplePlayers = new ArrayList<>();

        when(iPlayer.getPlayers("Winnipeg Jets")).thenReturn(samplePlayers);

        dummyList = accessPlayers.getPlayers("Winnipeg Jets");
        assertNotNull(dummyList);

        verify(iPlayer).getPlayers("Winnipeg Jets");

        System.out.print("\nFinished test.");

    }

    @Test
    public void testGetPlayers2(){
        System.out.print("\n------------------AccessPlayers Test---------------------");
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 2: Get Players - Errors");
        System.out.print("\n---------------------------------------");

        String input1 = "39803498034";
        String input2 = "Winnipeg Jets 25";
        String input3 = "";
        String input4 = "            ";
        String input5 = "Winnipeg              Jets";
        String input6 = " Winnipeg Jets    ";

        int counter = 0;

        try{
            System.out.print("\nInput: " + input1);
            accessPlayersNoMock.getPlayers(input1);
            fail("\nMethod did not throw an exception.\n");
        }
        catch (Exception e){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: " + input2);
            accessPlayersNoMock.getPlayers(input2);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception e){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: (empty)");
            accessPlayersNoMock.getPlayers(input3);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception e){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: (whitespace)");
            accessPlayersNoMock.getPlayers(input4);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception e){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: " + input5);
            accessPlayersNoMock.getPlayers(input5);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception e){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        try{
            System.out.print("\nInput: " + input6);
            accessPlayersNoMock.getPlayers(input6);
            fail("\nMethod did not throw an exception\n");
        }
        catch (Exception e){
            System.out.print("\nMethod threw an exception.\n");
            counter++;
        }

        System.out.print("\n---------------------------------------");
        System.out.print("\nExpected: 6");
        System.out.print("\nExceptions thrown: " + counter);
        System.out.print("\n---------------------------------------");

    }
}
