package comp3350.winSport.persistence.fakeDB;

import java.util.List;

import comp3350.winSport.objects.Location;
import comp3350.winSport.persistence.ILocation;

public class LocationData implements ILocation {
    @Override
    public List<Location> getSportVenues() {
        return null;
    }

    @Override
    public List<Location> getNearestBars() {
        return null;
    }

    @Override
    public Location getLocationByName(String name) {
        return null;
    }
}
