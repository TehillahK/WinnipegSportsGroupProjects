package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.NewsPost;
import comp3350.winSport.persistence.INewsFeed;

public class AccessNewsFeed {
    private INewsFeed iNewsFeed;
    private List<NewsPost> newsPosts;
    public AccessNewsFeed()
    {
        iNewsFeed= Services.getNewsFeedPersistance();
        newsPosts=null;
    }
    public AccessNewsFeed(INewsFeed iNewsFeed)
    {

        this.iNewsFeed=iNewsFeed;
    }

    public List<NewsPost> getNewsPosts ()   {
        newsPosts=iNewsFeed.getNewsPosts();
        return newsPosts;
    }

    public void likePost()
    {

    }
}
