package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessGames;
import comp3350.winSport.objects.Game;

public class TeamScheduleActivity extends AppCompatActivity {

    private List<Game> games;
    private AccessGames accessGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_schedule);

        accessGames = new AccessGames();
        Intent intent = getIntent();
        String value = (intent).getStringExtra("TeamName");
        games = accessGames.getGamesTeam(value);

        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(value);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}