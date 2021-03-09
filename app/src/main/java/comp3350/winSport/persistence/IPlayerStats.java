package comp3350.winSport.persistence;

import java.util.List;


import comp3350.winSport.objects.Player;

public interface IPlayerStats {
    List<Player> getPlayersSequential();
    Player getSinglePlayer();

}