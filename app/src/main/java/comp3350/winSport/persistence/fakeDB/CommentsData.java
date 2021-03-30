package comp3350.winSport.persistence.fakeDB;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.Comment;
import comp3350.winSport.persistence.IComments;

public class CommentsData implements IComments {
    List<Comment> comments;
    public CommentsData()
    {
        comments=new ArrayList<>();
    }
    @Override
    public void addComments(int postID,String postTitle,String comment) {
        Comment newComment= new Comment(postID,postTitle,comment);
        comments.add(newComment);
    }

    @Override
    public List<Comment> getComments(int postID) {
        List<Comment> result;
        result=new ArrayList<>();
        for (int i = 0; i <comments.size(); i++) {
            if(comments.get(i).getPostID()==postID)
            {
                result.add(comments.get(i));
            }

        }
        return result;
    }
}
