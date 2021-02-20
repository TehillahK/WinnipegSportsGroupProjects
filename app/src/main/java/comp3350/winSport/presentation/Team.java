import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;

    public Team() {
        name = "Uknown";
        players = new ArrayList<Player>();
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
        String s1 = name + "\nPlayers: \n";
        String s2 = "";
        for(int i = 0; i < players.size(); i++)
            s2 = s2 + "  " + players.get(i).toString() + "\n";
        return s1 + s2;
    }
}
