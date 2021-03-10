package comp3350.winSport.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.Player;

public class PlayersAdapter  extends RecyclerView.Adapter<PlayersAdapter.PlayerViewHolder> {

    private List<Player> players;

    public PlayersAdapter(List<Player> players) {
        this.players=players;
    }


    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.players_menu_card, parent, false);
        return new PlayersAdapter.PlayerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player currentItem = players.get(position);
        holder.player_pic.setImageResource(currentItem.getPic());
        holder.player_name.setText(currentItem.getName());
        holder.player_team.setText(currentItem.getTeam());
    }



    @Override
    public int getItemCount() {
        return players.size();
    }

    public void filterList(List<Player> searchResults) {
        players=searchResults;
        notifyDataSetChanged();
    }

    public static class PlayerViewHolder extends RecyclerView.ViewHolder {
       ImageView player_pic;
       TextView player_name;
       TextView player_team;




        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            player_pic=itemView.findViewById(R.id.playerProfile);
            player_name=itemView.findViewById(R.id.playerName);
            player_team=itemView.findViewById(R.id.playerTeam);
        }
    }
}
