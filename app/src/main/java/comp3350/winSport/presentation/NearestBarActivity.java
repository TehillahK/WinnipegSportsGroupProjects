package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessLocations;
import comp3350.winSport.objects.Location;

public class NearestBarActivity extends AppCompatActivity {
    CardView cardView;
    NearestBarAdapter adapter;
    NearestBarAdapter.RecyclerViewEventListener listener;
    private List<Location> venues;
    private AccessLocations accessLocations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_bar);
        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Nearest Bar");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        venues = accessLocations.getVenues();

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


    }


}