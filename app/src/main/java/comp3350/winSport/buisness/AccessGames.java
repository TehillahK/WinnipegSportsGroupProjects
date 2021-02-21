package comp3350.winSport.buisness;

import java.util.Collections;
import java.util.List;

import comp3350.winSport.objects.Game;
import comp3350.winSport.persistence.GameData;
import comp3350.winSport.persistence.GamePersistance;

public class AccessGames {

    private GamePersistance gamePersistance;
    private List<Game> games;
    private Game game;
    private int currentGame;

    public AccessGames() {

        gamePersistance  = new GameData();
        games = null;
        game = null;
        currentGame = 0;
    }

    public List<Game> getGames() {
        games = gamePersistance.getGamesSequential();
        return Collections.unmodifiableList(games);
    }

    public Game getSingleGame() {
        game = gamePersistance.getSingleGame();
        return game;
    }


}
