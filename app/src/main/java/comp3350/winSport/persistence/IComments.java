package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.Comment;

public interface IComments {
    void addComments(int postID,String postTitle,String comment);
    List<Comment> getComments(int postID);

}
