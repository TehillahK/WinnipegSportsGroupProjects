package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessLocations;
import comp3350.winSport.objects.Location;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.presentation.Adapters.NearestBarAdapter;

public class NearestBarActivity extends AppCompatActivity {
    CardView cardView;
    NearestBarAdapter adapter;
    NearestBarAdapter.RecyclerViewEventListener listener;
    private List<Location> venues;
    private List<Location> bars;
    private AccessLocations accessLocations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_bar);

        initValues();

        venues = accessLocations.getVenues();

        try {
            bars = accessLocations.getBars(venues.get(0).getName());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }

        RecyclerView rv = findViewById(R.id.venuesRV);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        adapter = new NearestBarAdapter(venues, listener);

        listener = new NearestBarAdapter.RecyclerViewEventListener() {
            @Override
            public void onClick(View view, int pos) {
                Intent intent =new Intent(getApplicationContext(),BarsActivity.class);
                intent.putExtra("venueName",venues.get(pos).getName());
                startActivity(intent);
            }
        };

        rv.setAdapter(adapter);

        Log.v("NearestBarA","Content");
    }

    void initValues() {

        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Nearest Bar");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        venues = new ArrayList<>();
        bars = new ArrayList<>();

        accessLocations = new AccessLocations();
    }

}