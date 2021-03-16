package comp3350.winSport.persistence.fakeDB;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Period;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.IGame;

public class GameData implements IGame {

    List<Game> games;

    private Game g1;
    private Game g2;
    private Game g3;
    private Game g4;

    public GameData() {

        games  = new ArrayList<>();
        initData();

    }

    public void initData() {

        String league1 = "NHL";
        String league2 = "NHL";

        g1 = new Game(1, "Stanley Cup Playoffs", league1, "Winnipeg Jets", "Toronto Maple Leafs", "Feb 26, 2021", "Rogers Place", "4 - 3");
        g2 = new Game(2, "Stanley Cup Playoffs", league2, "Ottawa Senators", "Edmonton Oilers", "Feb 26, 2021", "Scotiabank Arena", "6 - 5");
        g3 = new Game(3, "Stanley Cup Playoffs", league1, "Calgary Flames", "Montreal Canadiens", "Feb 27, 2021", "Rogers Place", "7 - 3");
        g4 = new Game(4, "Stanley Cup Playoffs", league2, "Winnipeg Jets", "Montreal Canadiens", "Feb 27, 2021", "Scotiabank Arena", "9 - 5");

        games.add(g1);
        games.add(g2);
        games.add(g3);
        games.add(g4);

    }

    @Override
    public List<Game> getGamesSequential() {

        List<Game> games = new ArrayList<>();
        games.add(g1);
        games.add(g2);
        games.add(g3);
        games.add(g4);

        return games;
    }

    @Override
    public Game getSingleGame() {
        return this.g1;
    }

}
