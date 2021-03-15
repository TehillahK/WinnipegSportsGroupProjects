package comp3350.winSport.business;

import java.util.Collections;
import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Player;
import comp3350.winSport.persistence.IPlayer;

public class AccessPlayers {

    private IPlayer iplayer;
    private List<Player> players;

    public AccessPlayers() {
        iplayer = Services.getPlayerPersistance();
        players = null;
    }

    public AccessPlayers(IPlayer playa) {
        this();
        iplayer = playa;
    }

    public List<Player> getPlayers(String teamName) {
        players = iplayer.getPlayers(teamName);
        return players;
    }

    public void setPlayer(Player p) {
        iplayer.insertPlayer(p);
    }

    public void setAllPlayers(List<Player> p) {
        iplayer.insertAllPlayers(p);
    }



}