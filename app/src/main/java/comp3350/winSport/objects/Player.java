package comp3350.winSport.objects;

import comp3350.winSport.R;

public class Player {

    private String name;
    private int number;
    private String position;
    private String shot;
    private int playerPic;
    private String teamName;
    private int teamPic;

    public Player() {
        name = "Unknown";
        number = 0;
        position = "Unknown";
        shot = "L";
        playerPic = R.drawable.headshot;
        this.teamName = "LFKAJDFLKJ";
        this.teamPic = 0;
    }

    public Player(String nme, int num, String pos,String teamName,int picID) {
        name = nme;
        number = num;
        position = pos;
        shot = "L";
        playerPic = R.drawable.headshot;
        this.teamName = teamName;
        this.teamPic = picID;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String nme) {
        name = nme;
    }

    public String getShot() {return this.shot;}

    public int getPic() {return this.playerPic;}

    public String getTeam() {return this.teamName;}

    public int getTeamPic() {return this.teamPic;}

    public void setNumber(int num) {
        number = num;
    }

    public void setPosition(String pos) {
        position = pos;
    }

    public String toString() {
        return "comp3350.winSport.objects.Player: [" + number + "] " + name + ", " + position;
    }
}
