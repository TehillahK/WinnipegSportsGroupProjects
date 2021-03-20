package comp3350.winSport.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import comp3350.winSport.R;
import comp3350.winSport.objects.NewsPost;
public class NewsFeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public  class NewsFeedHolder extends RecyclerView.ViewHolder  {
        ImageView photo;
        TextView postTitle;
        TextView caption;
        TextView datePosted;

        public  NewsFeedHolder(@NonNull View itemView) {
            super(itemView);

        }


    }

}
