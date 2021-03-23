package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.exceptions.InvalidNameException;

public interface IPlayer {
    List<Player> getPlayers(String teamName) throws InvalidNameException;
    List<Player> getAllPlayers();
}
