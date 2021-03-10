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
        this.name = "Unknown";
        this.number = 0;
        this.position = "Unknown";
        this.shot = "L";
        this.playerPic = R.drawable.headshot;
        this.teamName = "LFKAJDFLKJ";
        this.teamPic = 0;
    }

    public Player(String name, int num, String pos,String shot, String teamName,int picID) {
        this.name = name;
        this.number = num;
        this.position = pos;
        this.shot = shot;
        this.playerPic = R.drawable.headshot;
        this.teamName = teamName;
        this.teamPic = picID;
    }

    public Player(String name, int num, String pos, String teamName,int picID) {
        this.name = name;
        this.number = num;
        this.position = pos;
        this.shot = "L";
        this.playerPic = R.drawable.headshot;
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

    public void viewPlayerObject(){
        System.out.print("\nPLAYER OBJECT");
        System.out.print("\nName: " + getName());
        System.out.print("\nNumber: " + getNumber());
        System.out.print("\nPosition: " + getPosition());
        System.out.print("\nTeam: " + getTeam());
        System.out.print("\nPic ID: " + getTeamPic());
    }
}
