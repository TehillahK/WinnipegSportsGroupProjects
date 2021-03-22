package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.objects.NewsPost;
import comp3350.winSport.persistence.INewsFeed;

public class AccessNewsPost {
    private INewsFeed iNewsFeed;
    private List<NewsPost> newsPosts;
    public AccessNewsPost()
    {
        newsPosts=null;
    }
    public AccessNewsPost(INewsFeed iNewsFeed)
    {
        this.iNewsFeed=iNewsFeed;
    }

    public List<NewsPost> getNewsPosts()
    {
        return newsPosts;
    }
}
