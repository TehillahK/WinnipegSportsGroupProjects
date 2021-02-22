package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.buisness.AccessGames;
import comp3350.winSport.buisness.AccessTeams;
import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Team;

public class RosterActivity extends AppCompatActivity {

    private AccessTeams accessTeams;
    private Team team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_list);

        Intent intent = getIntent();
        String value = ((Intent) intent).getStringExtra("TeamName");



        // ENABLE ACTION BAR
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Roster");

        // RECYCLER VIEW DATA
        accessTeams = new AccessTeams();
        team = accessTeams.getTeamByName(value);

        // Initialize Recycler view and Linear layout Manager
        RecyclerView rv = findViewById(R.id.player_rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        // Activate Layout manager and RecyclerView
        rv.setLayoutManager(llm);
        PlayerAdapter adapter = new PlayerAdapter(team.getPlayers());
        rv.setAdapter(adapter);

    }
}