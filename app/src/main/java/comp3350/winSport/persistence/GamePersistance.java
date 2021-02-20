package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.Game;

public interface GamePersistance {
    List<Game> getGamesSequential();
}
