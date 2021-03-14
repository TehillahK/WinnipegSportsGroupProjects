package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessTeams;
import comp3350.winSport.objects.Team;

public class ScheduleActivity extends AppCompatActivity {

    AccessTeams accessTeams = new AccessTeams();
    List<Team> teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        teams = accessTeams.getTeams();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Schedule");

        ArrayAdapter adapter = new ArrayAdapter<>(this,R.layout.team_item,teams);

        ListView listView = findViewById(R.id.team_items_schedule);

        listView.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Team o = (Team)listView.getItemAtPosition(position);
                String val = o.getName();
                Intent myIntent = new Intent(ScheduleActivity.this,RosterActivity.class);
                myIntent.putExtra("TeamName", o.getName()); //Optional parameters
                ScheduleActivity.this.startActivity(myIntent);
            }
        }));
        listView.setAdapter(adapter);

    }

}