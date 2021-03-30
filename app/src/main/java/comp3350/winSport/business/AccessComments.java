package comp3350.winSport.business;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Comment;
import comp3350.winSport.persistence.IComments;

public class AccessComments {
    private IComments iComments;
    private List<Comment> comments;
    public AccessComments()
    {
        iComments= Services.getCommentsPersistance();
        comments=null;

    }
    public AccessComments(IComments iComments)
    {
        this.iComments=iComments;
    }

    public void addComment(int postID,String comment)
    {
        iComments.addComments(postID,"",comment);
    }

    public List<Comment> getComments(int postID,String title)
    {
        comments=iComments.getComments(postID);
        return comments;

    }

}
