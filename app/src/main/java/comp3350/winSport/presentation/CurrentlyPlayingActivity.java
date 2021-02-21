package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.buisness.AccessGames;
import comp3350.winSport.objects.Game;

public class CurrentlyPlayingActivity extends AppCompatActivity {

    private AccessGames accessGames;
    private List<Game> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        accessGames = new AccessGames();
        games = accessGames.getGames();
        // need to pass a List<Game> object to my RVAdapter.
//        initData(); // initialize games list.
        RecyclerView rv = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        rv.setLayoutManager(llm);
        RVAdapter adapter = new RVAdapter(games);
        rv.setAdapter(adapter);

    }

    /*
        initData.

        Purpose : initialize some fake data for our list view.
     */
//    private void initData() {
//        games = new ArrayList<>();
//        games.add(new Game("NHL","WINNIPEG JETS","2 - 0","35 min ago",R.drawable.nhl,R.drawable.jets));
//        games.add(new Game("NHL","SAMPLE TEST","0 - 0","1 days from now",R.drawable.nhl,R.drawable.jets));
//        games.add(new Game("NHL","WINNIPEG JETS","0 - 0","11 days from now",R.drawable.nhl,R.drawable.jets));
//        games.add(new Game("NHL","DIFFERENT TEXT","0 - 0","111 days from now",R.drawable.nhl,R.drawable.jets));
//        games.add(new Game("NHL","WINNIPEG JETS","2 - 0","35 min ago",R.drawable.nhl,R.drawable.jets));
//        games.add(new Game("NHL","SAMPLE TEST","0 - 0","1 days from now",R.drawable.nhl,R.drawable.jets));
//        games.add(new Game("NHL","WINNIPEG JETS","0 - 0","11 days from now",R.drawable.nhl,R.drawable.jets));
//        games.add(new Game("NHL","DIFFERENT TEXT","0 - 0","111 days from now",R.drawable.nhl,R.drawable.jets));
//    }
}

/*
    comp3350.winSport.objects.Game class.

    Purpose: holds the data required for each game/card in the currently playing screen.
 */
//class Game {
//
//    String leagueName;
//    String teamName;
//    String gameScore;
//    String startGame;
//    int leagueID;
//    int gameID;
//
//    public Game(String leagueName, String teamName, String gameScore, String startGame, int logoID, int gamePic) {
//        this.leagueName = leagueName;
//        this.teamName = teamName;
//        this.gameScore = gameScore;
//        this.startGame = startGame;
//        this.leagueID = logoID;
//        this.gameID = gamePic;
//    }
//}