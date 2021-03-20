package comp3350.winSport.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.NewsPost;

public class NewsFeedActivity extends AppCompatActivity {
    private NewsFeedAdapter.RecyclerViewEventListener listener;
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
        ArrayList<NewsPost> posts;
        posts=new ArrayList<NewsPost>();
        for (int i = 0; i < 6; i++) {
            posts.add(new NewsPost());
        }
        RecyclerView rv = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        rv.setLayoutManager(llm);
        setOnClickListner();
        NewsFeedAdapter adapter = new NewsFeedAdapter(posts,listener);
        rv.setAdapter(adapter);

    }


    private void setOnClickListner() {
        listener = new NewsFeedAdapter.RecyclerViewEventListener() {
            @Override
            public void onClick(View view, int pos) {
                Intent intent =new Intent(getApplicationContext(),PlayerStatsActivity.class);
                intent.putExtra("postID",newsPosts.get(pos).getPostID());
                startActivity(intent);

            }
        };
    }
}