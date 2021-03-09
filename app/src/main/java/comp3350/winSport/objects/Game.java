package comp3350.winSport.objects;

import java.util.ArrayList;

import comp3350.winSport.R;

public class Game {

    private int gameID;
    private String gameName;
    private String gameLeague;
    private String team1;
    private String team2;
    private String gameDate;
    private String gameLocation;
    private ArrayList<Period> periods;
    private String gameScore;

    private int leagueID;
    private int gamePicID;

    public Game() {
        gameID = 0;
        gameName = "Unknown";
        gameLeague = "Unknown";
        team1 = "team1 Name";
        team2 = "team2 Name";
        gameDate = "Unknown";
        gameLocation = "Unknown";
        periods = new ArrayList<>(3);
        gameScore = "Unknown";
        leagueID = 0;
        gamePicID = 0;
    }


    public Game(int gID, String gName, String gL, String t1, String t2, String gDate, String gLocation, ArrayList<Period> prds, String gScore) {
        gameID = gID;
        gameName = gName;
        gameLeague = gL;
        team1 = t1;
        team2 = t2;
        gameDate = gDate;
        gameLocation = gLocation;
        periods = prds;
        gameScore = gScore;
        leagueID = R.drawable.nhl;
        gamePicID = R.drawable.jets;
    }

    public Game(int gID, String gName, String t1, String t2, String date, String location, String score) {
        gameID = gID;
        gameName = gName;
        team1 =t1;
        team2 = t2;
        gameDate = date;
        gameLocation = location;
        gameLeague = "unknown";
        periods = new ArrayList<>(3);
        gameScore = score;
        leagueID = R.drawable.nhl;
        gamePicID = R.drawable.jets;
    }


    public int getLeagueID() {
        return leagueID;
    }

    public int getGamePicID() {
        return gamePicID;
    }

    public int getGameID() {
        return gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGameLeague() {
        return gameLeague;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getGameDate() {
        return gameDate;
    }

    public String getGameLocation() {
        return gameLocation;
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

    public ArrayList<Period> getPeriods() {
        return periods;
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

    public void setLeague(String name) {
        gameLeague = name;
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
        String res = "\n------------------------------------\ncomp3350.winSport.objects.Game #" + gameID + " " + gameName + "\n" + gameLeague.toString() + "\n"
                + "comp3350.winSport.objects.Game date: " + gameDate + "\n"
                + "comp3350.winSport.objects.Game location: " + gameLocation + "\ncomp3350.winSport.objects.Game score: " + gameScore + "\n------------------------------------\n"
                + "comp3350.winSport.objects.Team 1: " + team1.toString() + "\ncomp3350.winSport.objects.Team 2: " + team2.toString() + "\n------------------------------------\n"
                + per + "\n------------------------------------\n";
        return res;
    }

    //-------------------------------
    // viewGame()
    //
    // PURPOSE : For testing data. Command-line friendly version
    //           that prints out a single game information.
    //           Information printed is relevant to the user. A way to check if
    //           functions in AccessGames is actually outputting something meaningful.
    // PARAMETERS:
    //     None.
    //
    // Returns: None.
    //
    // ------------------------------
    public void viewGame(){
        System.out.print("\n\nGAME INFORMATION");
        System.out.print("\nGame ID: " + this.getGameID());
        System.out.print("\nGame Name: " + this.getGameName());
        System.out.print("\nLeague: "+ this.getGameLeague());
        System.out.print("\nGame Date: " + this.getGameDate());
        System.out.print("\nTeam 1: " + this.getTeam1());
        System.out.print("\nTeam 2: " + this.getTeam2());
        System.out.print("\nLocation: "+ this.getGameLocation());
        System.out.print("\nScore: " + this.getGameScore());
    }

    //-------------------------------
    // viewGame()
    //
    // PURPOSE : For testing data. Command-line friendly version
    //           that prints out the variables found in the constructor.
    // PARAMETERS:
    //     None.
    //
    // Returns: None.
    //
    // ------------------------------
    public void viewGameObject(){
        System.out.print("\n\nGAME OBJECT");
        System.out.print("\nGame ID: " + this.getGameID());
        System.out.print("\nGame Name: " + this.getGameName());
        System.out.print("\nLeague: "+ this.getGameLeague());
        System.out.print("\nGame Date: " + this.getGameDate());
        System.out.print("\nTeam 1: " + this.getTeam1());
        System.out.print("\nTeam 2: " + this.getTeam2());
        System.out.print("\nLocation: "+ this.getGameLocation());
        System.out.print("\nScore: " + this.getGameScore());
        System.out.print("\nPeriods: " + this.getGamePeriods().get(0).toString());
    }
}