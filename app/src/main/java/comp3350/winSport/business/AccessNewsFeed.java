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

    public void updateLike(NewsPost post, int val) {
        if (post.getLikes() > 0 || val != -1)
            iNewsFeed.updateLike(post.getPostID(),post.getLikes() + val);
    }

    public void updateDislike(NewsPost post, int val) {
        if(post.getDislikes() > 0 || val != -1)
            iNewsFeed.updateDislike(post.getPostID(),post.getDislikes() + val);
    }


}
