package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.business.AccessNewsFeed;
import comp3350.winSport.objects.NewsPost;

public class NewsFeedActivity extends AppCompatActivity {
    private AccessNewsFeed accessNewsFeed;
    private List<NewsPost> newsPosts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);

        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("News Feed");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        AccessNewsFeed accessNewsFeed = new AccessNewsFeed();
        newsPosts=new ArrayList<>();
        newsPosts.addAll( accessNewsFeed.getNewsPosts());
    //    ArrayList<NewsPost> posts;
       // posts=new ArrayList<NewsPost>();
      //  for (int i = 0; i < 6; i++) {
       //     posts.add(new NewsPost());
     //   }
        RecyclerView rv = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        rv.setLayoutManager(llm);
        NewsFeedAdapter adapter = new NewsFeedAdapter(newsPosts);
        rv.setAdapter(adapter);

    }


}