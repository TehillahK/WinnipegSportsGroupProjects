package comp3350.winSport.persistence.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.Game;
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

    private Location fromResultSet(final ResultSet rs) throws SQLException {

        final String name = rs.getString("locationName");
        final String description = rs.getString("locationDescription");
        final String address = rs.getString("locationAddress");
        final double lat = rs.getDouble("locationLat");
        final double lng = rs.getDouble("locationLong");
        final int bit = rs.getInt("locationBar");
        final boolean val;

        val = bit == 1;

        return new Location(name,description,address,lat,lng,val);
    }

    @Override
    public List<Location> getSportVenues() {

        final List<Location> locations = new ArrayList<>();

        try (final Connection c = connection()) {
            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("SELECT * FROM LOCATIONS WHERE locationBar = 1");

            while (rs.next()) {
                final Location location = fromResultSet(rs);
                locations.add(location);
            }

            rs.close();
            st.close();
        }
        catch (final SQLException e) {
            throw new PersistenceException(e);
        }

        return locations;
    }

    @Override
    public List<Location> getNearestBars() {

        final List<Location> locations = new ArrayList<>();

        try (final Connection c = connection()) {
            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("SELECT * FROM LOCATIONS WHERE locationBar = 0");

            while (rs.next()) {
                final Location location = fromResultSet(rs);
                locations.add(location);
            }

            rs.close();
            st.close();
        }
        catch (final SQLException e) {
            throw new PersistenceException(e);
        }

        return locations;
    }

    @Override
    public Location getLocationByName(String name) {
        return null;
    }
}
