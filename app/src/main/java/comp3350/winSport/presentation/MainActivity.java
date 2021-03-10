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

        Button button1 = (Button)findViewById(R.id.currentlyPlayingMenu);
        Button button2 = (Button)findViewById(R.id.teamRostersMenu);
        Button button3 = (Button)findViewById(R.id.soonMenu);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.currentlyPlayingMenu:
                // activate currently playing menu
                Intent myIntent = new Intent(MainActivity.this,CurrentlyPlayingActivity.class);
                MainActivity.this.startActivity(myIntent);
                break;
            case R.id.teamRostersMenu:
                // games menu
                Intent myOtherIntent = new Intent(MainActivity.this,Teams.class);
                MainActivity.this.startActivity(myOtherIntent);
                break;
            case R.id.soonMenu:
                // comming soon
//                Intent testIntent = new Intent(MainActivity.this, test_activity.class);
//                MainActivity.this.startActivity(testIntent);
                break;
            default:
                break;
        }
    }
}