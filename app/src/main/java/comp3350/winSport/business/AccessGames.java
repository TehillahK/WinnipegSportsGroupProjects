package comp3350.winSport.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Game;
import comp3350.winSport.persistence.IGame;
import comp3350.winSport.persistence.fakeDB.GameData;

public class AccessGames {

    /*
        Abstracts where the data is comming from using interfaces.
        What UI methods call to get data
    */

    private IGame gData;
    private List<Game> games;
    private Game game;

    public AccessGames() {
        gData = Services.getGamePersistance();
        games = null;
        game = null;
    }

    public AccessGames(IGame accessingGames) {
        this();
        this.gData = accessingGames;
    }

    public List<Game> getGames() {
        games = gData.getGamesSequential();
        return Collections.unmodifiableList(games);
    }

    public Game getSingleGame() {
        game = gData.getSingleGame();
        return game;
    }

    public List<Game> getGamesTeam(String teamName) {
        games = gData.getGamesSequential();
        List<Game> teamGames = new ArrayList<>();

        for (Game curr : games)
            if (curr.getTeam2().equals(teamName) || curr.getTeam1().equals(teamName))
                teamGames.add(curr);

        return teamGames;
    }

}
