package comp3350.winSport.persistence.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import comp3350.winSport.objects.Standing;
import comp3350.winSport.persistence.IStanding;

public class StandingHSQLDB implements IStanding {

    private final String dbPath;

    public StandingHSQLDB(final String dbPath) {
        this.dbPath = dbPath;
    }

    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    @Override
    public List<Standing> getStandingsInOrder() {
        return null;
    }
}
