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

        Button button1 = findViewById(R.id.currentlyPlayingMenu);
        Button button2 = findViewById(R.id.teamRostersMenu);
        Button button3 = findViewById(R.id.player_stat_layout);
        Button button4 = findViewById(R.id.schedule_layout);
        Button button5 = findViewById(R.id.channel_layout);
        Button button6 = findViewById(R.id.newsFeedMenu);
        Button button7 = findViewById(R.id.buy_tickets_menu);
        Button button8 = findViewById(R.id.standings_menu);
        Button button9 = findViewById(R.id.nearby_bars);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
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