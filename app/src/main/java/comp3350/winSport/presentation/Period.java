import java.util.ArrayList;

public class Period {
    private int ID;
    private int score;
    private ArrayList<Player> playerGoals;
    private ArrayList<String> timeGoals;

    public Period() {
        ID = 0;
        score = 0;
        playerGoals = new ArrayList<Player>();
        timeGoals = new ArrayList<String>();
    }

    public Period(int n, int sc) {
        ID = n;
        score = sc;
        playerGoals = new ArrayList<Player>();
        timeGoals = new ArrayList<String>();
    }

    public void addGoal(Player p, String time) {
        playerGoals.add(p);
        timeGoals.add(time);
    }

    public ArrayList<Player> getPlayerGoals() {
        return playerGoals;
    }

    public ArrayList<String> getTimeGoals() {
        return timeGoals;
    }

    public int getID() {
        return ID;
    }

    public int getScore() {
        return score;
    }

    public void setID(int n) {
        ID = n;
    }

    public void setScore(int s) {
        score = s;
    }

    public void setPlayerGoals(ArrayList<Player> pl) {
        playerGoals = pl;
    }

    public void setTimeGoals(ArrayList<String> st) {
        timeGoals = st;
    }

    public String toString() {
        String players = "";
        String period = "";
        if (ID == 1)
            period = "1ST";
        if(ID == 2)
            period = "2ND";
        if(ID == 3)
            period = "3RD";
        if(playerGoals.size() > 0) {
            for(int i = 0; i < playerGoals.size(); i++)
                players = players + "   " + playerGoals.get(i).getName() + " (" + timeGoals.get(i) + " " + period + ")\n";
            return "Period #" + ID + "\nGoals:\n" + players + "Score: " + score + "\n";
        }
        else
            return "Period #" + ID + "\n" + "Score: " + score + "\n";
    }

}
