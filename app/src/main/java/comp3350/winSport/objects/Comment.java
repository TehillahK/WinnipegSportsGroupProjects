package comp3350.winSport.objects;

public class Comment {
    private int postID;
    private String postTitle;
    private String comment;
    private String userNickName;

    public Comment()
    {
        //phineas and ferb reference
        userNickName="Cheeky Monkey";
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }


}
