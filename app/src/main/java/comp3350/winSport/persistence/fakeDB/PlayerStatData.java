package comp3350.winSport.persistence.fakeDB;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.PlayerStatistic;
import comp3350.winSport.persistence.IPlayerStats;

public class PlayerStatData implements IPlayerStats {

    List<PlayerStatistic> playerStats;

    public PlayerStatData() {
        playerStats = new ArrayList<>();
        initData();
    }

    void initData() {



    }

    @Override
    public PlayerStatistic getPlayerByName(String name) {
        return null;
    }

}
