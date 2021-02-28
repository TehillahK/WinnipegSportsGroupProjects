package comp3350.winSport.objects;

import java.util.ArrayList;

import comp3350.winSport.objects.Player;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int teamID;

    public Team() {
        name = "Unknown";
        players = new ArrayList<>();
    }

    public Team(String n, ArrayList<Player> pl, int teamID) {
        name = n;
        players = pl;
        this.teamID = teamID;
    }

    public int getTeamID() {
        return teamID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void setName(String s) {
        name = s;
    }

    public void setPlayers(ArrayList<Player> lst) {
        players = lst;
    }

    public String toString() {
       return this.name + " " + this.teamID;
    }

    public void viewTeamObject(){
        System.out.print("\nTEAM OBJECT");
        System.out.print("\nName: " + getName());
        System.out.print("\nPlayers: " + getPlayers());
        System.out.print("\nTeam ID: " + getTeamID());

    }

}
