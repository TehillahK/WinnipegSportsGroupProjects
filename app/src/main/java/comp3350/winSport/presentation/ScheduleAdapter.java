package comp3350.winSport.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.Game;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>{

    List<Game> games; // declare games List

    ScheduleAdapter(List<Game> g) { this.games = g;}

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_item, parent, false);
        return new ScheduleAdapter.ScheduleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {
        holder.gameDate.setText(games.get(position).getGameDate());
        holder.gameOpponent.setText(games.get(position).getTeam2());
        holder.gameScore.setText(games.get(position).getGameScore());

    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public static class ScheduleViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView gameDate;
        TextView gameOpponent;
        TextView gameScore;

        ScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.schedule_card);
            gameDate = itemView.findViewById(R.id.game_date);
            gameOpponent = itemView.findViewById(R.id.game_opponent);
            gameScore = itemView.findViewById(R.id.game_result);
        }


    }

}
