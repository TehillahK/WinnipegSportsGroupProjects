package comp3350.winSport.objects;

import java.util.*;

public class Schedule {

    private boolean gameFinished;
    private String gameOverScore;
    private Date gameDate;

    public Schedule(){

        gameFinished = false;
        gameOverScore = "unknown";
        gameDate = new Date();

    }

    public Schedule(boolean sGameFinished, String sGameOverScore, Date sGameDate){

        gameFinished = sGameFinished;
        gameOverScore = sGameOverScore;
        gameDate = sGameDate;

    }

    public Schedule(boolean sGameFinished, Date sGameDate){

        gameFinished = sGameFinished;
        gameDate = sGameDate;

    }
}
