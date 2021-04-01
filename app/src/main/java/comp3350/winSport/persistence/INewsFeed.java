package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.NewsPost;

public interface INewsFeed {
    List<NewsPost> getNewsPosts();
}
