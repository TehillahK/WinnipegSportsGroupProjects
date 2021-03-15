package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessTeams;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;
public class PlayerStatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);
        TextView playerNameTxt=findViewById(R.id.player_name_textView);
        String playerName="";
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            playerName=extras.getString("playerName");
        }
        playerNameTxt.setText(playerName);
    }
}