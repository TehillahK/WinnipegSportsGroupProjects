//package comp3350.winSport.presentation;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
//import androidx.recyclerview.widget.RecyclerView;
//
//import org.w3c.dom.Text;
//
//import java.util.List;
//
//import comp3350.winSport.R;
//import comp3350.winSport.objects.Game;
//import comp3350.winSport.objects.Team;
//
//public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {
//
//    List<Team> teams; // declare games List
//
//    TeamAdapter(List<Team> teams) { // constructor initalizing games list.
//        this.teams = teams;
//    }
//
//    @NonNull
//    @Override
//    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.current_card, parent, false);
//        return new TeamViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
//        holder.player_name.setText(teams.get(position).getGameLeague().getName());
//        holder.playerNum.setText(teams.get(position).getTeam1().getName() + " Vs.\n" + games.get(position).getTeam2().getName());
//        holder.position.setText(teams.get(position).getGameScore());
//        holder.shot.setText(teams.get(position).getGameDate());
//        holder.player_pic.setImageResource(teams.get(position).getGamePicID());
//    }
//
//    @Override
//    public int getItemCount() {
//        return teams.size();
//    }
//
//    @Override
//    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
//        super.onAttachedToRecyclerView(recyclerView);
//    }
//
//    public static class TeamViewHolder extends RecyclerView.ViewHolder {
//
//        CardView cv;
//        TextView player_name;
//        TextView playerNum;
//        TextView position;
//        TextView shot;
//        ImageView player_pic;
//
//        TeamViewHolder(@NonNull View itemView) {
//            super(itemView);
//            cv = itemView.findViewById(R.id.current_playing_card);
//            player_name = itemView.findViewById(R.id.player_name);
//            playerNum = itemView.findViewById(R.id.playerNum);
//            position = itemView.findViewById(R.id.position);
//            shot = itemView.findViewById(R.id.shot);
//            player_pic = itemView.findViewById(R.id.player_pic);
//        }
//    }
//
//}
