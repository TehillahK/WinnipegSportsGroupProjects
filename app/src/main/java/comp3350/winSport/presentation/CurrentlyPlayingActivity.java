package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessGames;
import comp3350.winSport.objects.Game;
import comp3350.winSport.presentation.Adapters.CurrentAdapter;

public class CurrentlyPlayingActivity extends AppCompatActivity {

    private AccessGames accessGames;
    private List<Game> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Currently Playing");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
//        accessGames = new AccessGames();
//        games = accessGames.getGames();

        initGames();

        RecyclerView rv = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        rv.setLayoutManager(llm);
        CurrentAdapter adapter = new CurrentAdapter(games,this);
        rv.setAdapter(adapter);

    }

    void initGames() {
        games = new ArrayList<>();

        games.add(new Game("Calgary Flames"       ,"0 - 0" , R.drawable.flames));
        games.add(new Game("Edmonton Oilers"      ,"0 - 0" , R.drawable.oilers));
        games.add(new Game("Montréal Canadiens"   ,"0 - 0" , R.drawable.montreal));
        games.add(new Game("Ottawa Senators"      ,"0 - 0" , R.drawable.ottawa));
        games.add(new Game("Toronto Maple Leafs"  ,"0 - 0" , R.drawable.leafs));
        games.add(new Game("Vancouver Canucks"    ,"0 - 0" , R.drawable.vancouver));
    }

}