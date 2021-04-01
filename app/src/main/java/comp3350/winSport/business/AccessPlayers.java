package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Player;
import comp3350.winSport.exceptions.InvalidNameException;
import comp3350.winSport.persistence.IPlayer;

public class AccessPlayers {

    /*
        Abstracts player data access using interfaces.
        UI methods to get data
    */

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

    public List<Player> getAllPlayers() {
        players = iplayer.getAllPlayers();
        return players;
    }

    public List<Player> getPlayersByTeam(String teamName) throws InvalidNameException {
        players = iplayer.getPlayers(teamName);
        return players;
    }

}
