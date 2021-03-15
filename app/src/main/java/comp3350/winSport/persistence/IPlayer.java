package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.Player;

public interface IPlayer {
    List<Player> getPlayers(String teamName);
    Player insertPlayer(Player p);
    void insertAllPlayers(List<Player> p);
    Player updatePlayer(Player p);
}
