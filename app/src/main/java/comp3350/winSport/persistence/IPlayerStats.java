package comp3350.winSport.persistence;


import comp3350.winSport.objects.PlayerStatistic;
import comp3350.winSport.objects.exceptions.InvalidNameException;

public interface IPlayerStats {
    PlayerStatistic getPlayerByName(String name) throws InvalidNameException;
}