package comp3350.winSport.persistence.fakeDB;

import java.util.List;

import comp3350.winSport.objects.Player;
import comp3350.winSport.persistence.IPlayer;

public class PlayerData implements IPlayer {
    @Override
    public List<Player> getPlayers(String teamName) {
        return null;
    }

    @Override
    public Player insertPlayer(Player p) {
        return null;
    }

    @Override
    public void insertAllPlayers(List<Player> p) {

    }

    @Override
    public Player updatePlayer(Player p) {
        return null;
    }
}
