package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Currently Playing");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        accessGames = new AccessGames();

        games = accessGames.getGames();

        RecyclerView rv = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        rv.setLayoutManager(llm);
        CurrentAdapter adapter = new CurrentAdapter(games);
        rv.setAdapter(adapter);

    }
}