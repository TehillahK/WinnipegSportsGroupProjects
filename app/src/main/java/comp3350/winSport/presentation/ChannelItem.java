package comp3350.winSport.presentation;

public class ChannelItem {

    private int name;
    private int pic;

    public ChannelItem(int name, int pic) {
        this.name = name;
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

}
