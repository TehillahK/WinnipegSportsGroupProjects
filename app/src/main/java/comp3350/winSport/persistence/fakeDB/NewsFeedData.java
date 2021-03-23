package comp3350.winSport.persistence.fakeDB;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.NewsPost;
import comp3350.winSport.persistence.INewsFeed;

public class NewsFeedData implements INewsFeed {
    private List<NewsPost> newsPosts;
    public NewsFeedData()
    {
        newsPosts=new ArrayList<>();
        initData();
    }
    public  void  initData()
    {
        NewsPost post1= new NewsPost("Jets Trade deadline","22/03/21",
                "Is cheveldayoff willing to spend on big target",0,0,0);
        NewsPost post2= new NewsPost("Jets top guns fire blanks","20/03/21",
                "Jets lose to Edmonton Oliers",0,0,0);
        NewsPost post3= new NewsPost("Its awards season for Cole Caufield","21/03/21",
                "Caufied become the first unanimous winner of big the ten player of the year's award"
                ,0,0,0);
        newsPosts.add(post2);
        newsPosts.add(post3);
        newsPosts.add(post1);

    }


    @Override
    public List<NewsPost> getNewsPosts() {
        return newsPosts;
    }
}
