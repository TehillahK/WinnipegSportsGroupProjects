package comp3350.winSport.business;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.PlayerStatistic;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.persistence.IPlayerStats;

public class AccessPlayerStats {

    /*
        Abstracts where the data is coming from using interfaces.
        What UI methods call to get data
    */

    private IPlayerStats playerStats;
    private PlayerStatistic oneStat;

    public AccessPlayerStats() {
        playerStats = Services.getPlayerStatsPersistance();
        oneStat = null;
    }

    public AccessPlayerStats(IPlayerStats ps) {
        this.playerStats = ps;
    }

    public PlayerStatistic getPlayerStatsByName(String playerName) throws InvalidNameException {
        oneStat = playerStats.getPlayerByName(playerName);
        return oneStat;
    }

}
