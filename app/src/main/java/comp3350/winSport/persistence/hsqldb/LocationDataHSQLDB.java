package comp3350.winSport.persistence.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import comp3350.winSport.objects.Location;
import comp3350.winSport.persistence.ILocation;

public class LocationDataHSQLDB implements ILocation {

    private final String dbPath;

    public LocationDataHSQLDB(final String dbPath) {
        this.dbPath = dbPath;
    }

    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    @Override
    public List<Location> getSportVenues() {



        return null;
    }

    @Override
    public List<Location> getNearestBars() {



        return null;
    }
}
