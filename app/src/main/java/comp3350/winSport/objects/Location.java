package comp3350.winSport.objects;

import java.math.BigDecimal;

public class Location {


    private String name;
    private String description;
    private String address;
    private Double lat;
    private Double lng;
    private boolean bar;

    private double sortDist;

    public Location(String name, String description, String address, Double lat, Double lng, boolean bar) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.bar = bar;
        sortDist = 0;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public boolean isBar() {
        return bar;
    }

    public double getSortDist() { return sortDist;}

    public void setSortDist(Double d) { this.sortDist = d;}

    public int compareTo(Location l) {
        double val = this.sortDist - l.getSortDist();
        if (val > 0)
            return 1;
        else if (val == 0)
            return 0;
        else
            return -1;
    }





}
