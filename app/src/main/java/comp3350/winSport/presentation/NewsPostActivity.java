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
import android.os.Bundle;
import android.widget.TextView;

public class NewsPostActivity extends AppCompatActivity {
    private TextView title;
    private TextView article;
    private List<NewsPost> posts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_post);
        title=findViewById(R.id.post_title);
        try {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Article");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        Bundle extras=getIntent().getExtras();
        int postID;
        if(extras!=null)
        {
            postID= Integer.parseInt(extras.getString("postID"));
            title.setText(postID);
        }

    }
}