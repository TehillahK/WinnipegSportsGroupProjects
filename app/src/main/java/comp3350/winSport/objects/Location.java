package comp3350.winSport.objects;

public class Location {


    private String name;
    private String description;
    private String address;
    private double lat;
    private double lng;
    private boolean bar;

    public Location(String name, String description, String address, double lat, double lng, boolean bar) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.bar = bar;
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

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public boolean isBar() {
        return bar;
    }





}
