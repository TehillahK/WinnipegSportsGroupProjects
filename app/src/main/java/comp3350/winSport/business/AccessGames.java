package comp3350.winSport.business;

import java.util.Collections;
import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Game;
import comp3350.winSport.persistence.IGame;
import comp3350.winSport.persistence.fakeDB.GameData;

public class AccessGames {

    private IGame gData;

    private List<Game> games;
    private Game game;
    private int currentGame;

    public AccessGames() {

        gData = Services.getGamePersistance();
        games = null;
        game = null;
        currentGame = 0;
    }

    public List<Game> getGames() {
        games = gData.getGamesSequential();
        return Collections.unmodifiableList(games);
    }

    public Game getSingleGame() {
        game = gData.getSingleGame();
        return game;
    }

}
