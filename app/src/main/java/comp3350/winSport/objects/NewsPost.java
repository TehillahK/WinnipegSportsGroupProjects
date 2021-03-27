package comp3350.winSport.objects;

public class NewsPost {

    private static int postCount=0;

    private int postID;
    private String title;
    private String datePosted;
    private String caption;
    private int numLikes;
    private int image;
    private int likes;
    private int dislikes;
    private boolean isLiked;
    private boolean isDisliked;
    public NewsPost()
    {
        title="The Title";
        datePosted="12/03/19";
        caption="Lorem ipsum dolor sit amet, consectetuer adipiscing elit.";
        numLikes=0;
        image = 0;
        postID = postCount;
        likes=0;
        dislikes=0;
        postCount++;
        isLiked=false;
        isDisliked=false;
    }

    public NewsPost(String title,String datePosted ,String caption, int likes,int dislikes,int image)
    {
        this.title=title;
        this.datePosted=datePosted;
        this.caption=caption;
        this.likes=likes;
        this.dislikes=dislikes;
        this.image=image;
        postID = postCount;
        postCount++;
    }
    public boolean isLiked()
    {

        return isLiked;
    }
    public void likePost(boolean likeButtonPressed)
    {
        if(!isLiked && !isDisliked && likeButtonPressed )
        {
            isLiked=true;

            setLikes(getLikes()+1);
        }
        else if(isLiked && !isDisliked && likeButtonPressed){
            isLiked=false;
            setLikes(getLikes()-1);
        }
        else if(!isLiked && isDisliked && likeButtonPressed)
        {
            isDisliked=false;
            isLiked=true;
            setLikes(getLikes()+1);
            setDislikes(getDislikes()-1);
        }

        else if(!isLiked && isDisliked && !likeButtonPressed){
            isDisliked=false;
            setDislikes(getDislikes()-1);
        }
        else if(!isLiked && !isDisliked && !likeButtonPressed)
        {
            isDisliked=true;
            setDislikes(getDislikes()+1);
        }
      else if(isLiked && !isDisliked && !likeButtonPressed){
          isDisliked=true;
          isLiked=false;
          setLikes(getLikes()-1);
          setDislikes(getDislikes()+1);
        }




    }

    public static int getPostCount() {
        return postCount;
    }
    public void setDislikes(int dislikes)
    {

        this.dislikes=dislikes;
    }

    public int getImage()
    {
        return image;
    }

    public int getPostID() {
        return postID;
    }

    public String getTitle() {
        return title;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public String getCaption() {
        return caption;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isDisliked()
    {
        return isDisliked;
    }
    public void viewNewsPostObject(){
        System.out.print("\nNewsPost OBJECT");
        System.out.print("\npost ID: " + getPostID());
        System.out.print("\nLeague Name: " + getTitle());
        System.out.print("\npost ID: " + getDatePosted());
        System.out.print("\nLeague Name: " + getCaption());
        System.out.print("\npost ID: " + getNumLikes());
        System.out.print("\nLeague Name: " + getImage());


    }
}