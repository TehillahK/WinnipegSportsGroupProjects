package comp3350.winSport.persistence.fakeDB;

import java.util.List;

import comp3350.winSport.objects.Standing;
import comp3350.winSport.persistence.IStanding;

public class StandingData implements IStanding {

    private List<Standing> standings;

    @Override
    public List<Standing> getStandingsInOrder() {
        return null;
    }
}
