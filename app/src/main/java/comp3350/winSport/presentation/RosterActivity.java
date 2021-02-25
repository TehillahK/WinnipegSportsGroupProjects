package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import comp3350.winSport.R;
import comp3350.winSport.buisness.AccessTeams;
import comp3350.winSport.objects.Team;
import comp3350.winSport.objects.InvalidNameException;

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

        try {
            team = accessTeams.getTeamByName(value);
        } catch (InvalidNameException e) {
            team = null;
            // should prob log error
            // should prob figure out how to log
        }
        // Initialize Recycler view and Linear layout Manager
        RecyclerView rv = findViewById(R.id.player_rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        // A Dev task for the future should be to develop a screen to display if teams is null.
        if (team != null) {
            // Activate Layout manager and RecyclerView
            rv.setLayoutManager(llm);
            PlayerAdapter adapter = new PlayerAdapter(team.getPlayers());
            rv.setAdapter(adapter);
        }
    }
}