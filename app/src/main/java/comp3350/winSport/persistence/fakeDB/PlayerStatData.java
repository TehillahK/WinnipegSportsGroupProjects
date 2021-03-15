package comp3350.winSport.persistence.fakeDB;

import comp3350.winSport.objects.PlayerStatistic;
import comp3350.winSport.persistence.IPlayerStats;

public class PlayerStatData implements IPlayerStats {



    @Override
    public PlayerStatistic getPlayerByName(String name) {
        return null;
    }

    @Override
    public PlayerStatistic insertPlayerStat(PlayerStatistic ps) {
        return null;
    }

    @Override
    public PlayerStatistic updatePS(PlayerStatistic ps) {
        return null;
    }

    @Override
    public void deletePlayerStat(PlayerStatistic ps) {

    }
}
