package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Standing;
import comp3350.winSport.persistence.IStanding;

public class AccessStanding {

    private IStanding iStanding;
    private List<Standing> standingList;

    public AccessStanding() {
        this.iStanding = Services.getStandingPersistance();
        this.standingList = null;
    }

    public AccessStanding(final IStanding standingInterface) {
        this.iStanding = standingInterface;
        this.standingList = null;
    }

    public List<Standing> getStandingInOrder() {
        standingList = iStanding.getStandingsInOrder();
        return standingList;
    }

}
