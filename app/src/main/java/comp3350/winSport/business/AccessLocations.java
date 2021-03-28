package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.objects.Location;
import comp3350.winSport.persistence.ILocation;

public class AccessLocations {

    public final static double AVERAGE_RADIUS_OF_EARTH_M = 6371000;

    private ILocation location;
    private List<Location> venues;
    private List<Location> bars;

    public AccessLocations() {
        // NEED TO ADD SERVICES CLASS.
//        location = new ILocation();
        venues = null;
        bars = null;
    }

    public List<Location> getVenues() {

        return null;
    }

    public List<Location> getBars() {

        return null;
    }

    private double calculateDistanceInmeter(double userLat, double userLng,
                                            double venueLat, double venueLng) {

        double latDistance = Math.toRadians(userLat - venueLat);
        double lngDistance = Math.toRadians(userLng - venueLng);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(userLat)) * Math.cos(Math.toRadians(venueLat))
                * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return (double) (Math.round(AVERAGE_RADIUS_OF_EARTH_M * c));
    }

}
