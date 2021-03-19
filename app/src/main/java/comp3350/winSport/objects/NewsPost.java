package comp3350.winSport.objects;

public class NewsPost {
    private String title;
    private String datePosted;
    private String caption;
    private int numLikes;
    public NewsPost()
    {
        title="The Title";
        datePosted="12/03/19";
        caption="Lorem ipsum dolor sit amet, consectetuer adipiscing elit.";
        numLikes=0;
    }
    public NewsPost(String title,String datePosted ,String caption, int numLikes)
    {
        this.title=title;
        this.datePosted=datePosted;
        this.caption=caption;
        this.numLikes=numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
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

    public int getNumLikes() {
        return numLikes;
    }

}
