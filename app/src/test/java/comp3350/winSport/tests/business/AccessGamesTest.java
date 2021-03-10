package comp3350.winSport.tests.business;

import org.junit.Before;
import org.junit.Test;
import java.util.ListIterator;

import comp3350.winSport.business.AccessGames;
import comp3350.winSport.objects.Game;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class AccessGamesTest {

    private AccessGames accessGames;

    @Before
    public void setUp(){
        accessGames = new AccessGames();
    }

    @Test
    public void singleGame(){
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 1: Single Game");
        System.out.print("\n---------------------------------------");
        System.out.print("\nGetting a single game...");

        accessGames.getSingleGame().viewGame();

        assertNotNull(accessGames.getSingleGame());

        assertTrue("Winnipeg Jets".equals(accessGames.getSingleGame().getTeam1()));
        assertTrue("Ottowa Senators".equals(accessGames.getSingleGame().getTeam2()));
        assertTrue("NHL".equals(accessGames.getSingleGame().getGameLeague()));
        assertTrue("4 - 3".equals(accessGames.getSingleGame().getGameScore()));
        assertTrue("Stanley Cup Playoffs".equals(accessGames.getSingleGame().getGameName()));
        assertTrue("Feb 26, 2021".equals(accessGames.getSingleGame().getGameDate()));

        assertNotNull(accessGames.getSingleGame().getGameName());
        assertNotNull(accessGames.getSingleGame().getGameID());
        assertNotNull(accessGames.getSingleGame().getGameDate());
        assertNotNull(accessGames.getSingleGame().getGameLocation());
        assertNotNull(accessGames.getSingleGame().getTeam1());
        assertNotNull(accessGames.getSingleGame().getTeam2());
        assertNotNull(accessGames.getSingleGame().getGameScore());

    }

    @Test
    public void listGames(){
        System.out.print("\n------------------AccessGames Test---------------------");
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 2: List of Games");
        System.out.print("\n---------------------------------------");
        ListIterator<Game> iterator = accessGames.getGames().listIterator();
        System.out.print("\nUsing iterator...");
        assertNotNull("First game should not be null.",iterator.hasNext());
        while (iterator.hasNext()){

            Game game = iterator.next();
            game.viewGame();

            assertNotNull(game.getGameID());
            assertNotNull(game.getGameDate());
            assertNotNull(game.getTeam1());
            assertNotNull(game.getTeam2());
            assertNotNull(game.getGameLeague());
            assertNotNull(game.getGameLocation());
            assertNotNull(game.getGameName());
            assertNotNull(game.getGameScore());
            assertTrue("NHL".equals(accessGames.getSingleGame().getGameLeague()));

        }
    }

}
