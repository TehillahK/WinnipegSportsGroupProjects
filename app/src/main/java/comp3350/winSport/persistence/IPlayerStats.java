package comp3350.winSport.persistence;


import comp3350.winSport.objects.PlayerStatistic;

public interface IPlayerStats {
    PlayerStatistic getPlayerByName(String name);
    PlayerStatistic insertPlayerStat(PlayerStatistic ps);
    PlayerStatistic updatePS(PlayerStatistic ps);
    void deletePlayerStat(PlayerStatistic ps);
}