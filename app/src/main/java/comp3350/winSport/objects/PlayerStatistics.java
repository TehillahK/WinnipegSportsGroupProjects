package comp3350.winSport.objects;

public class PlayerStatistics {

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
    private int plusOrMinus;
    private int pim; //variable name not clear
    private int evGoals;
    private int ppGoals;
    private int shGoals;
    private int gwGoals;
    private int shots;
    private float sPercent; //variable name is not clear
    private int toi; //variable name is not clear
    private float goalsPerGame;
    private float assistsPerGame;
    private float shotsPerGame;
    private float ops; //variable name is not clear
    private float dps; //variable name is not clear
    private float pointShares;

    public PlayerStatistics(){

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
        plusOrMinus = 0;
        pim = 0; //variable name not clear
        evGoals = 0;
        ppGoals = 0;
        shGoals = 0;
        gwGoals = 0;
        shots = 0;
        sPercent = 0; //variable name is not clear
        toi = 0; //variable name is not clear
        goalsPerGame = 0;
        assistsPerGame = 0;
        shotsPerGame = 0;
        ops = 0; //variable name is not clear
        dps = 0; //variable name is not clear
        pointShares = 0;

    }

    public PlayerStatistics(String psName, int psGamesPlayed, String psTeam, String psLeague, String psPosition, String psSeason, int psAge,
                            int psGoals, int psAssists, int psPoints, int psPlusOrMinus, int psPim, int psEvGoals, int psPpGoals, int psShGoals,
                            int psGwGoals, int psShots, int psSPercent, int psToi, float psGoalsPerGame, float psAssistsPerGame, float psShotsPerGame,
                            float psOps, float psDps, float psPointShares){
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
        plusOrMinus = psPlusOrMinus;
        pim = psPim;
        evGoals = psEvGoals;
        ppGoals = psPpGoals;
        shGoals = psShGoals;
        gwGoals = psGwGoals;
        shots = psShots;
        sPercent = psSPercent;
        toi = psToi;
        goalsPerGame = psGoalsPerGame;
        assistsPerGame = psAssistsPerGame;
        shotsPerGame = psShotsPerGame;
        ops = psOps;
        dps = psDps;
        pointShares = psPointShares;
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

    public int getPlusOrMinus(){return plusOrMinus;}

    public int getPim(){return pim;} //variable name not clear

    public int getEvGoals(){return evGoals;}

    public int getPpGoals(){return ppGoals;}

    public int geSshGoals(){return shGoals;}

    public int getGwGoals(){return gwGoals;}

    public int getShots(){return shots;}

    public float getSPercent(){return sPercent;} //variable name is not clear

    public float getToi(){return toi;} //variable name is not clear

    public float getGoalsPerGame(){return goalsPerGame;}

    public float getAssistsPerGame(){return assistsPerGame;}

    public float getShotsPerGame(){return shotsPerGame;}

    public float getOps(){return ops;} //variable name is not clear

    public float getDps(){return dps;} //variable name is not clear

    public float getPointShares(){return pointShares;}
}
