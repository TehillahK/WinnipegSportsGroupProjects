package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import comp3350.winSport.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Winnipeg Sports");

        Button button1 = findViewById(R.id.currentlyPlayingMenu);
        Button button2 = findViewById(R.id.teamRostersMenu);
        Button button3 = findViewById(R.id.player_stat_layout);
        Button button4 = findViewById(R.id.schedule_layout);
        Button button5 = findViewById(R.id.channel_layout);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.currentlyPlayingMenu:
                // activate currently playing menu
                Intent intent1 = new Intent(MainActivity.this,CurrentlyPlayingActivity.class);
                MainActivity.this.startActivity(intent1);
                break;
            case R.id.teamRostersMenu:
                // games menu
                Intent intent2 = new Intent(MainActivity.this, TeamsActivity.class);
                MainActivity.this.startActivity(intent2);
                break;
            case R.id.player_stat_layout:
                // Player Stats
                Intent intent3 = new Intent(MainActivity.this, PlayersActivity.class);
                MainActivity.this.startActivity(intent3);
                break;
            case R.id.schedule_layout:
                // Player Stats
                Intent intent4 = new Intent(MainActivity.this, ScheduleActivity.class);
                MainActivity.this.startActivity(intent4);
                break;
            case R.id.channel_layout:
                // Player Stats
                Intent channelIntent = new Intent(MainActivity.this, ChannelActivity.class);
                MainActivity.this.startActivity(channelIntent);
                break;

            default:
                break;
        }
    }
}