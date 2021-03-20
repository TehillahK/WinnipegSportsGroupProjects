package comp3350.winSport.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.NewsPost;
public class NewsFeedAdapter extends RecyclerView.Adapter <NewsFeedAdapter.NewsFeedHolder> {

    List<NewsPost> newsPosts;
    public NewsFeedAdapter(List<NewsPost> newsPosts)
    {
        this.newsPosts=newsPosts;
    }
    @NonNull
    @Override
    public NewsFeedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_feed_card, parent, false);
        return new NewsFeedHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsFeedHolder holder, int position) {
        holder.photo.setImageResource(newsPosts.get(position).getImage());
        holder.postTitle.setText(newsPosts.get(position).getTitle());
        holder.caption.setText(newsPosts.get(position).getCaption());
        holder.datePosted.setText(newsPosts.get(position).getDatePosted());
    }



    @Override
    public int getItemCount() {
        return newsPosts.size();
    }


    public static class NewsFeedHolder extends RecyclerView.ViewHolder  {
        ImageView photo;
        TextView postTitle;
        TextView caption;
        TextView datePosted;

        public  NewsFeedHolder(@NonNull View itemView) {
            super(itemView);
            photo=itemView.findViewById(R.id.post_image);
            postTitle=itemView.findViewById(R.id.post_title);
            caption=itemView.findViewById(R.id.caption);
            datePosted=itemView.findViewById(R.id.date_posted);
        }


    }

}