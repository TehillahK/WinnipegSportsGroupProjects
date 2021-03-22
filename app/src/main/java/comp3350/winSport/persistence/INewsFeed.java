package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.NewsPost;
import comp3350.winSport.objects.exceptions.InvalidNameException;

public interface INewsFeed {
    List<NewsPost> getNewsPosts();
}
