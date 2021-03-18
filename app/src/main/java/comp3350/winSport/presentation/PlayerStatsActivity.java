package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessPlayerStats;
import comp3350.winSport.business.AccessPlayers;
import comp3350.winSport.business.AccessTeams;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.PlayerStatistic;
import comp3350.winSport.objects.Team;
import comp3350.winSport.objects.exceptions.InvalidNameException;

public class PlayerStatsActivity extends AppCompatActivity {
    private AccessPlayerStats playerStats;
    private PlayerStatistic playerStatistic;
    private TextView playerNameTxt;
    private TextView playerGamesPlayedTxt;
    private TextView playerTeamNameTxt;
    private TextView playerLeagueTxt;
    private TextView playerPositionTxt;
    private TextView playerSeasonTxt;
    private TextView playerGoalsTxt;
    private TextView playerAssistsTxt;
    private TextView playerPointsTxt;
    private TextView playerGoalsPerGameTxt;
    private TextView playerAssistsPerGameTxt;
    private TextView playerShotsPerGameTxt;
    private  TextView playerAgeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);
        playerStats= new AccessPlayerStats();
        playerNameTxt=findViewById(R.id.player_name_textView);
        playerGamesPlayedTxt=findViewById(R.id.games_played_textView);
        playerTeamNameTxt=findViewById(R.id.team_name__textView);
        playerLeagueTxt=findViewById(R.id.player_league__textView);
        playerPositionTxt=findViewById(R.id.player_position__textView);
        playerSeasonTxt=findViewById(R.id.game_season__textView);
        playerGoalsTxt=findViewById(R.id.player_goals__textView);
        playerAssistsTxt=findViewById(R.id.player_assists__textView);
        playerPointsTxt=findViewById(R.id.points__textView);
        playerGoalsPerGameTxt=findViewById(R.id.goals_perGame__textView);
        playerAssistsPerGameTxt=findViewById(R.id.player_assists_pergame_textView);
        playerShotsPerGameTxt=findViewById(R.id.player_shots_PerGame_textView);
        playerAgeTxt=findViewById(R.id.player_age__textView);
        String playerName="";
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            playerName=extras.getString("playerName");
        }
        playerNameTxt.setText(playerName);

        try {
            playerStatistic=playerStats.getPlayerStatsByName(playerName);

            playerGamesPlayedTxt.setText(playerStatistic.getGamesPlayed()+"");
            playerTeamNameTxt.setText(playerStatistic.getTeam()+"");
            playerLeagueTxt.setText(playerStatistic.getLeague()+"");
            playerPositionTxt.setText(playerStatistic.getPosition()+"");
            playerSeasonTxt.setText(playerStatistic.getSeason()+"");
            playerGoalsTxt.setText(playerStatistic.getGoals()+"");
            playerAssistsTxt.setText(playerStatistic.getAssists()+"");
            playerPointsTxt.setText(playerStatistic.getPoints()+"");
            playerGoalsPerGameTxt.setText(playerStatistic.getAge()+"");
            playerAssistsPerGameTxt.setText(playerStatistic.getAssistsPerGame()+"");
            playerShotsPerGameTxt.setText(playerStatistic.getShotsPerGame()+"");
            playerAgeTxt.setText(playerStatistic.getAge()+"");




        } catch(NullPointerException | InvalidNameException e)
        {
            e.printStackTrace();
        }
    }
}