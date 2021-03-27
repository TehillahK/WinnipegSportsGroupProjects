package comp3350.winSport.presentation;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.NewsPost;
import comp3350.winSport.presentation.interfaces.RecyclerViewEventListener;

public class NewsFeedAdapter extends RecyclerView.Adapter <NewsFeedAdapter.NewsFeedHolder> {

    List<NewsPost> newsPosts;
    final String PEOPLE_LIKE_THIS=" people like this";
    final String PEOPLE_DISLIKE_LIKE_THIS=" people dislike this";
    private RecyclerViewEventListener listener;
    public NewsFeedAdapter(List<NewsPost> newsPosts, RecyclerViewEventListener listener)
    {
        this.newsPosts=newsPosts;
        this.listener=listener;
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
        holder.likeCounter.setText(Integer.toString(newsPosts.get(position).getLikes())+ PEOPLE_LIKE_THIS);
        holder.dislikeCounter.setText(Integer.toString(newsPosts.get(position).getDislikes())+PEOPLE_DISLIKE_LIKE_THIS);
    }



    @Override
    public int getItemCount() {
        return newsPosts.size();
    }


    public class NewsFeedHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView photo;
        TextView postTitle;
        TextView caption;
        TextView datePosted;
        Button likeButton;
        Button dislikeButton;
        TextView likeCounter;
        TextView dislikeCounter;
        Button shareButton;
        public  NewsFeedHolder(@NonNull View itemView) {
            super(itemView);
            photo=itemView.findViewById(R.id.post_image);
            postTitle=itemView.findViewById(R.id.post_title);
            caption=itemView.findViewById(R.id.caption);
            datePosted=itemView.findViewById(R.id.date_posted);
            likeButton=itemView.findViewById(R.id.like_button);
            dislikeButton=itemView.findViewById(R.id.dislike_button);
            likeCounter=itemView.findViewById(R.id.numLikes);
            dislikeCounter=itemView.findViewById(R.id.numDislikes);
          //  shareButton=itemView.findViewById(R.id.share_button);
            itemView.setOnClickListener(this);

            likeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    NewsPost post;
                    int currLikes;
                    System.out.println("clicked like button");

                    post= newsPosts.get(getAdapterPosition());
                 //   currLikes=post.getLikes()+1;
                //    post.setLikes(currLikes);

                    post.likePost(true);
                    if(!post.isDisliked())
                    {
                        dislikeCounter.setText(Integer.toString(post.getDislikes())+PEOPLE_DISLIKE_LIKE_THIS);
                    }
                //    likeCounter.setText(Integer.toString(currLikes)+PEOPLE_LIKE_THIS);
                    likeCounter.setText(Integer.toString(post.getLikes())+PEOPLE_LIKE_THIS);
                    if(likeButton.getText().equals("Like") && !post.isDisliked()) {
                        likeButton.setText("Liked");
                        dislikeButton.setText("dislike");
                    }
                    else if(likeButton.getText().equals("Liked") && !post.isDisliked()) {
                        likeButton.setText("Like");
                     //   dislikeButton.setText("")
                    }
                    else if(likeButton.getText().equals("Like") && post.isDisliked()) {
                        likeButton.setText("Liked");
                    //    dislikeButton.setText("disliked");
                    }
                    else if(likeButton.getText().equals("Liked") && post.isDisliked()) {
                        likeButton.setText("Like");
                        dislikeButton.setText("dislike");
                    }

             //       dislikeButton.setEnabled(false);

                }
            });
            dislikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    NewsPost post;
                    int currLikes;
                    System.out.println("clicked dislike button");
                    post= newsPosts.get(getAdapterPosition());
                    post.likePost(false);
                  //  currLikes=post.getLikes()+1;
                //    post.setLikes(currLikes);
                    if(!post.isLiked())
                    {
                        likeCounter.setText(Integer.toString(post.getLikes())+PEOPLE_LIKE_THIS);
                    }
                    dislikeCounter.setText(Integer.toString(post.getDislikes())+PEOPLE_DISLIKE_LIKE_THIS);

                  //  likeButton.setEnabled(false);
                    System.out.println(dislikeButton.getText());
                    if(dislikeButton.getText().equals("dislike"))
                        dislikeButton.setText("disliked");
                    else
                        dislikeButton.setText("dislike");
                }
            });
        }


        @Override
        public void onClick(View v) {
            listener.onClick(v,getAdapterPosition());
        }
    }

}
