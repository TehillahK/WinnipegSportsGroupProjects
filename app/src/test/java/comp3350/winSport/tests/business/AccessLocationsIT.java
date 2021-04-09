package comp3350.winSport.tests.business;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import comp3350.winSport.business.AccessLocations;
import comp3350.winSport.business.AccessTeams;
import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Location;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.ILocation;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.hsqldb.LocationDataHSQLDB;
import comp3350.winSport.persistence.hsqldb.TeamDataHSQLDB;
import comp3350.winSport.tests.utils.TestUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AccessLocationsIT {
    private AccessLocations accessLocations;
    private File tempDB;

    @Before
    public void setUp() throws IOException{
        this.tempDB = TestUtils.copyDB();
        final ILocation iLocation = new LocationDataHSQLDB(this.tempDB.getAbsolutePath().replace(".script",""));
        this.accessLocations = new AccessLocations(iLocation);
    }

    @Test
    public void testGetVenues(){
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 1: Get Venues");
        System.out.print("\n---------------------------------------");
        final List<Location> venues = accessLocations.getVenues();
        assertEquals(4,venues.size());
    }

    @After
    public void tearDown(){
        this.tempDB.delete();
    }
}
