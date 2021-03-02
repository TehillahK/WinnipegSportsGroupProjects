package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.buisness.AccessTeams;
import comp3350.winSport.buisness.team_test;
import comp3350.winSport.objects.Team;

public class test_activity extends AppCompatActivity {

    team_test accessTeams;
    private ArrayAdapter <Team> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_activity);

        accessTeams = new team_test();
        List<Team> teams = accessTeams.getTeams();


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tests Activity");

        adapter = new ArrayAdapter<>(this,R.layout.team_item,teams);
        ListView listView = findViewById(R.id.db_list_view);
        listView.setAdapter(adapter);

    }




}