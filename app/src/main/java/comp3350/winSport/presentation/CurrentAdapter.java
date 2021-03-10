package comp3350.winSport.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.Game;

public class CurrentAdapter extends RecyclerView.Adapter<CurrentAdapter.GameViewHolder> {

    List<Game> games; // declare games List

    CurrentAdapter(List<Game> games) { // constructor initalizing games list.
        this.games = games;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.current_card, parent, false);
        return new GameViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        holder.gameLeague.setText(games.get(position).getGameLeague());
        holder.gameTeam.setText(games.get(position).getTeam1() + " Vs.\n" +
                games.get(position).getTeam2());
        holder.gameScore.setText(games.get(position).getGameScore());
        holder.gameStart.setText(games.get(position).getGameDate());
        holder.gameLeaguePhoto.setImageResource(games.get(position).getLeaguePic());
        holder.gameTeamPhoto.setImageResource(games.get(position).getGamePicID());
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



    public static class GameViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView gameLeague;
        TextView gameTeam;
        TextView gameScore;
        TextView gameStart;
        ImageView gameLeaguePhoto;
        ImageView gameTeamPhoto;

         GameViewHolder(@NonNull View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.current_playing_card);
            gameLeague = itemView.findViewById(R.id.league_name);
            gameTeam = itemView.findViewById(R.id.team_name);
            gameScore = itemView.findViewById(R.id.game_score);
            gameStart = itemView.findViewById(R.id.game_time);
            gameLeaguePhoto = itemView.findViewById(R.id.league_logo);
            gameTeamPhoto = itemView.findViewById(R.id.team_picture);
        }
    }

}
