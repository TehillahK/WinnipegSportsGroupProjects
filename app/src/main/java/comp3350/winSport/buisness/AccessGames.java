package comp3350.winSport.buisness;

import java.util.Collections;
import java.util.List;

import comp3350.winSport.objects.Game;
import comp3350.winSport.persistence.IGameData;
import comp3350.winSport.persistence.IGame;

public class AccessGames {

    private IGame IGame;
    private List<Game> games;
    private Game game;
    private int currentGame;

    public AccessGames() {

        IGame = new IGameData();
        games = null;
        game = null;
        currentGame = 0;
    }

    public List<Game> getGames() {
        games = IGame.getGamesSequential();
        return Collections.unmodifiableList(games);
    }

    public Game getSingleGame() {
        game = IGame.getSingleGame();
        return game;
    }



}
