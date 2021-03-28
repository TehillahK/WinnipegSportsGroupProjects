package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessLocations;

import android.os.Bundle;

public class BarsActivity extends AppCompatActivity {
    AccessLocations bars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);
        String venueName="";
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            venueName=extras.getString("venueName");
        }
        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("bars near"+venueName);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}