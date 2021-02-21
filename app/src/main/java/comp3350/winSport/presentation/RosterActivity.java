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

public class RosterActivity extends AppCompatActivity {

    private AccessGames accessGames;
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_list);

        // ENABLE ACTION BAR
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // RECYCLER VIEW DATA
        accessGames = new AccessGames();
        game = accessGames.getSingleGame();

        // Initialize Recycler view and Linear layout Manager
        RecyclerView rv = findViewById(R.id.player_rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        // Activate Layout manager and RecyclerView
        rv.setLayoutManager(llm);
        PlayerAdapter adapter = new PlayerAdapter(game.getTeam1().getPlayers());
        rv.setAdapter(adapter);

    }
}