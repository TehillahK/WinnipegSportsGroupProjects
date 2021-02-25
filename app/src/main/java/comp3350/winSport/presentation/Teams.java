package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.buisness.AccessTeams;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.TeamPersistance;

public class Teams extends AppCompatActivity {

    AccessTeams accessTeams = new AccessTeams();
    List<Team> teams = accessTeams.getTeams();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Teams");

        ArrayAdapter adapter = new ArrayAdapter<Team>(this,R.layout.team_item,teams);

        ListView listView = findViewById(R.id.list_view);

        listView.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Team o = (Team)listView.getItemAtPosition(position);
                String val = o.getName();
                Intent myIntent = new Intent(Teams.this,RosterActivity.class);
                myIntent.putExtra("TeamName", o.getName()); //Optional parameters
                Teams.this.startActivity(myIntent);
            }
        }));
        listView.setAdapter(adapter);

    }


}