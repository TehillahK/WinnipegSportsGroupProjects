package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import comp3350.winSport.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private HashMap<Integer,Class<?>> ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Winnipeg Sports");

        initIDs();

        // Create a button for each of our ID's and set an onClickListener.
        for (Integer i : ids.keySet()) {
            Button button = findViewById(i);
            button.setOnClickListener(this);
        }
    }

    // Initialize our hashmap with ID value Class value.
    // Will allow for clean onclick method below.
    private void initIDs() {
        ids = new HashMap<>();
        ids.put(R.id.currentlyPlayingMenu,CurrentlyPlayingActivity.class);
        ids.put(R.id.teamRostersMenu,TeamsActivity.class);
        ids.put(R.id.player_stat_layout,PlayersActivity.class);
        ids.put(R.id.schedule_layout,ScheduleActivity.class);
        ids.put(R.id.channel_layout,ChannelActivity.class);
        ids.put(R.id.newsFeedMenu,NewsFeedActivity.class);
        ids.put(R.id.buy_tickets_menu,TicketsActivity.class);
        ids.put(R.id.standings_menu,StandingsActivity.class);
        ids.put(R.id.nearby_bars,NearestBarActivity.class);
    }

    // Can simply get matching key of the on clicked id.
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,ids.get(v.getId()));
        MainActivity.this.startActivity(intent);
    }

}