import java.util.ArrayList;

public class Game {

    private int gameID;
    private String gameName;
    private League gameLeague;
    private Team team1;
    private Team team2;
    private String gameDate;
    private String gameLocation;
    private ArrayList<Period> periods;
    private String gameScore;

    public Game() {
        gameID = 0;
        gameName = "Unknown";
        gameLeague = new League();
        team1 = new Team();
        team2 = new Team();
        gameDate = "Unknown";
        gameLocation = "Unknown";
        periods = new ArrayList<Period>(3);
        gameScore = "Unknown";
    }

    public Game(int gID, String gName, League gL, Team t1, Team t2, String gDate, String gLocation, ArrayList<Period> prds, String gScore) {
        gameID = gID;
        gameName = gName;
        gameLeague = gL;
        team1 = t1;
        team2 = t2;
        gameDate = gDate;
        gameLocation = gLocation;
        periods = prds;
        gameScore = gScore;
    }

    public int getGameID() {
        return gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public League getGameLeague() {
        return gameLeague;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getGameDate() {
        return gameDate;
    }

    public String getGameLocation() {
        return getGameLocation();
    }

    public ArrayList<Period> getGamePeriods() {
        return periods;
    }

    public Period getOnePeriod(int ind) {
        Period p = null;
        for(int i = 0; i < 3; i++) {
            if(periods.get(i).getID() == ind)
                p = periods.get(i);
        }
        return p;
    }

    public String getGameScore() {
        return gameScore;
    }

    public void setGameID(int n) {
        gameID = n;
    }

    public void setGameName(String s) {
        gameName = s;
    }

    public void setLeague(int ID, String name) {
        League lg = new League(ID, name);
        gameLeague = lg;
    }

    public void setTeam1(String name, ArrayList<Player> players) {
        Team t = new Team(name, players);
        team1 = t;
    }

    public void setTeam2(String name, ArrayList<Player> players) {
        Team t = new Team(name, players);
        team2 = t;
    }

    public void setGameDate(String date) {
        gameDate = date;
    }

    public void setGameLocation(String location) {
        gameLocation = location;
    }

    public void setGamePeriods(ArrayList<Period> p) {
        periods = p;
    }

    public void setOnePeriod(Period pr) {
        if(periods.size() < 3)
            periods.add(pr);
        else
            System.out.println("3 periods are already added");
    }

    public void setGameScore(String sc) {
        gameScore = sc;
    }

    public String toString() {
        String per = "";
        for(int i = 0; i < 2; i++)
            per = per + periods.get(i).toString() + "\n";
        per += periods.get(2).toString();
        String res = "------------------------------------\nGame #" + gameID + " " + gameName + "\n" + gameLeague.toString() + "\n"
                + "Game date: " + gameDate + "\n"
                + "Game location: " + gameLocation + "\nGame score: " + gameScore + "\n------------------------------------\n"
                + "Team 1: " + team1.toString() + "\nTeam 2: " + team2.toString() + "------------------------------------\n"
                + per + "------------------------------------";
        return res;
    }
}