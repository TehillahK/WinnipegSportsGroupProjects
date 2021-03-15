package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import comp3350.winSport.R;
import comp3350.winSport.application.Main;
import comp3350.winSport.business.AccessPlayers;
import comp3350.winSport.business.AccessTeams;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;

import android.content.Context;

import android.content.res.AssetManager;
import android.util.Log;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SplashScreenActivity extends AppCompatActivity {

    private AccessTeams accessTeams;
    private AccessPlayers accessPlayers;
    private List<String> teamNames = new ArrayList<>();
    private RequestQueue mRequestQueue;

    final String PREFS_NAME = "MyPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        copyDatabaseToDevice();

        accessTeams = new AccessTeams();
        accessPlayers = new AccessPlayers();

        Handler handler=new Handler();

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if (settings.getBoolean("my_first_time", true)) {
            //the app is being launched for first time, do something
            Log.d("Comments", "First time");

            // first time task
            mRequestQueue = Volley.newRequestQueue(this);
            getTeams();

            // record the fact that the app has been started at least once
            settings.edit().putBoolean("my_first_time", false).commit();
        }



        handler.postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(SplashScreenActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                },2000);




    }

    private void getTeams() {

        String url = "https://statsapi.web.nhl.com/api/v1/teams?expand=team.roster";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray jsonArray = response.getJSONArray("teams");

                            List<Team> teams = new ArrayList<>();
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject team = jsonArray.getJSONObject(i);
                                JSONObject roster = team.getJSONObject("roster");
                                JSONArray roster_player = roster.getJSONArray("roster");
                                String name = team.getString("name");
                                ArrayList<Player> plays = new ArrayList<>();

                                for (int j = 0; j < roster_player.length(); j++) {

                                    JSONObject player = roster_player.getJSONObject(j);
                                    JSONObject realPlayer = player.getJSONObject("person");
                                    JSONObject position = player.getJSONObject("position");

                                    String playerName = realPlayer.getString("fullName");
                                    String pos = position.getString("name");
                                    int id = realPlayer.getInt("id");
                                    int number = player.getInt("jerseyNumber");

                                    Player playa = new Player(playerName,number,pos,"L",name,R.drawable.headshot,id);
                                    if (!plays.contains(playa))
                                        plays.add(playa);
//                                    accessPlayers.setPlayer(playa);
                                }

                                int id = team.getInt("id");
                                teamNames.add(name);

                                Team t = new Team();
                                t.setName(name);
                                t.setTeamID(id);
                                t.setPlayers(plays);

                                teams.add(t);
                            }


                            List<Team> displayTeams = new ArrayList<>();
                            for (int i = 0; i < 10; i++) {
                                Team t = teams.get(i);
                                displayTeams.add(t);
                                accessPlayers.setAllPlayers(t.getPlayers());
                            }
                            accessTeams.setAllTeams(displayTeams);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        mRequestQueue.add(request);
    }

    private void getTeamStats(Team team) {

        List<Player> players = team.getPlayers();

        for (int i = 1; i < players.size(); i++) {

            getPlayerStats(players.get(i).getPlayerID());

        }

    }

    private void getPlayerStats(int playerID) {

        String url = "https://statsapi.web.nhl.com/api/v1/people/" + playerID + "/stats?stats=statsSingleSeason&season=20202021";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray jsonArray = response.getJSONArray("stats");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject lower = jsonArray.getJSONObject(i);
                                JSONArray splits  = lower.getJSONArray("splits");
                                for (int j = 0; j < splits.length(); j++) {
                                    JSONObject stat = splits.getJSONObject(i);
                                    JSONObject legit_stat = stat.getJSONObject("stat");

                                    Log.v("STAT","" + legit_stat.getInt("points"));

                                }

                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });
        mRequestQueue.add(request);
    }


    private void copyDatabaseToDevice() {
        final String DB_PATH = "db";

        String[] assetNames;
        Context context = getApplicationContext();
        File dataDirectory = context.getDir(DB_PATH, Context.MODE_PRIVATE);
        AssetManager assetManager = getAssets();

        try {

            assetNames = assetManager.list(DB_PATH);
            for (int i = 0; i < assetNames.length; i++) {
                assetNames[i] = DB_PATH + "/" + assetNames[i];
            }

            copyAssetsToDirectory(assetNames, dataDirectory);

            Main.setDBPathName(dataDirectory.toString() + "/" + Main.getDBPathName());

        } catch (final IOException ioe) {
            System.out.println("hello this isntt workibf");
        }
    }

    public void copyAssetsToDirectory(String[] assets, File directory) throws IOException {
        AssetManager assetManager = getAssets();

        for (String asset : assets) {
            String[] components = asset.split("/");
            String copyPath = directory.toString() + "/" + components[components.length - 1];

            char[] buffer = new char[1024];
            int count;

            File outFile = new File(copyPath);

            if (!outFile.exists()) {
                InputStreamReader in = new InputStreamReader(assetManager.open(asset));
                FileWriter out = new FileWriter(outFile);

                count = in.read(buffer);
                while (count != -1) {
                    out.write(buffer, 0, count);
                    count = in.read(buffer);
                }

                out.close();
                in.close();
            }
        }
    }
}