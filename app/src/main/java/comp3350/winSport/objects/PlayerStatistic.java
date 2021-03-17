package comp3350.winSport.objects;

public class PlayerStatistic {

    private String name;
    private int gamesPlayed;
    private String team;
    private String league;
    private String position;
    private String season;
    private int age;
    private int goals;
    private int assists;
    private int points;
    private double goalsPerGame;
    private double assistsPerGame;
    private double shotsPerGame;

    public PlayerStatistic(){

        name = "unknown";
        gamesPlayed = 0;
        team = "unknown";
        league = "unknown";
        position = "unknown";
        season = "unknown";
        age = 0;
        goals = 0;
        assists = 0;
        points = 0;
        goalsPerGame = 0;
        assistsPerGame = 0;
        shotsPerGame = 0;
    }

    public PlayerStatistic(String psName, int psGamesPlayed, String psTeam, String psLeague, String psPosition, String psSeason, int psAge,
                           int psGoals, int psAssists, int psPoints, double psGoalsPerGame, double psAssistsPerGame, double psShotsPerGame){
        name = psName;
        gamesPlayed = psGamesPlayed;
        team = psTeam;
        league = psLeague;
        position = psPosition;
        season = psSeason;
        age = psAge;
        goals = psGoals;
        assists = psAssists;
        points = psPoints;
        goalsPerGame = psGoalsPerGame;
        assistsPerGame = psAssistsPerGame;
        shotsPerGame = psShotsPerGame;

    }

    public String getName(){return name;}

    public int getGamesPlayed(){return gamesPlayed;}

    public String getTeam(){return team;}

    public String getLeague(){return league;}

    public String getPosition(){return position;}

    public String getSeason(){return season;}

    public int getAge(){return age;}

    public int getGoals(){return goals;}

    public int getAssists(){return assists;}

    public int getPoints(){return points;}

    public double getGoalsPerGame(){return goalsPerGame;}

    public double getAssistsPerGame(){return assistsPerGame;}

    public double getShotsPerGame(){return shotsPerGame;}
}
