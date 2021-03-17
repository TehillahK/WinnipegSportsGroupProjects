package comp3350.winSport.persistence.fakeDB;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.Player;
import comp3350.winSport.persistence.IPlayer;

public class PlayerData implements IPlayer {

    List<Player> players;

    public PlayerData() {
        players = new ArrayList<>();
        initData();
    }

    public void initData() {



    }

    @Override
    public List<Player> getPlayers(String teamName) {
        return null;
    }
}
