package comp3350.winSport.persistence.hsqldb;

import java.util.List;

import comp3350.winSport.objects.Comment;
import comp3350.winSport.persistence.IComments;

public class CommentsHSQLDB implements IComments {
    @Override
    public void addComments(int postID, String postTitle, String comment) {

    }

    @Override
    public List<Comment> getComments(int postID) {
        return null;
    }
}
