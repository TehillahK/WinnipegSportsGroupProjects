package comp3350.winSport.objects;

import java.util.ArrayList;
import java.util.List;

public class Team {

    /*
        Team DSO specifically used for our Roster and Player Stats features.
    */

    private String name;
    private List<Player> players;
    private int teamPic;
    private int teamID;

    public Team() {
        name = "Unknown";
        players = new ArrayList<>();
        this.teamPic = 0;
        this.teamID = 0;
    }

    // constructor used when populating slower..
    public Team(String n, int teamPic, int teamID) {
        this.name = n;
        this.teamPic = teamPic;
        this.teamID = teamID;
        players = null;
    }

    public Team(String n, List<Player> pl, int teamPic,int teamID) {
        name = n;
        players = pl;
        this.teamPic = teamPic;
        this.teamID = teamID;
    }

    public int getTeamPic() {
        return teamPic;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers(){
        return players;
    }

    public void setName(String s) {
        name = s;
    }

    public void setPlayers(ArrayList<Player> lst) {
        players = lst;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String toString() {
        return this.name ;
    }

    public void viewTeamObject(){
        System.out.print("\nTEAM OBJECT");
        System.out.print("\nName: " + getName());
        System.out.print("\nPlayers: " + getPlayers());
        System.out.print("\nTeam ID: " + getTeamPic());

    }

}
