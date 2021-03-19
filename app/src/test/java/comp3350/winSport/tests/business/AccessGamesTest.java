package comp3350.winSport.tests.business;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import comp3350.winSport.business.AccessGames;
import comp3350.winSport.objects.Game;
import comp3350.winSport.persistence.IGame;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AccessGamesTest {

    private AccessGames accessGames;
    private IGame iGame;

    @Before
    public void setUp(){
        iGame = mock(IGame.class);
        accessGames = new AccessGames(iGame);
    }

    @Test
    public void singleGame(){

        final Game game;
        final Game sampleGame;

        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 1: Single Game");
        System.out.print("\n---------------------------------------");
        System.out.print("\nGetting a single game...");

        sampleGame = new Game();

        when(iGame.getSingleGame()).thenReturn(sampleGame);

        game = accessGames.getSingleGame();
        assertNotNull("Should not be null", game);

        verify(iGame).getSingleGame();

        System.out.print("\nFinished test.");

    }

    @Test
    public void listGames(){

        System.out.print("\n------------------AccessGames Test---------------------");
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 2: List of Games");
        System.out.print("\n---------------------------------------");

        final List<Game> games = accessGames.getGames();
        assertNotNull(games);

        verify(iGame).getGamesSequential();

        System.out.print("\nFinished test.");

    }

}
