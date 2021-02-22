package comp3350.winSport.objects;

import java.util.ArrayList;

import comp3350.winSport.objects.Player;

public class Team {

    private String name;
    private ArrayList<Player> players;

    public Team() {
        name = "Uknown";
        players = new ArrayList<>();
    }

    public Team(String n, ArrayList<Player> pl) {
        name = n;
        players = pl;
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
       return this.name;
    }
}
