package comp3350.winSport.persistence.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.exceptions.PersistenceException;
import comp3350.winSport.objects.Standing;
import comp3350.winSport.persistence.IStanding;

public class StandingHSQLDB implements IStanding {

    private final String dbPath;
    List<String> validNames;


    public StandingHSQLDB(final String dbPath) {
        this.dbPath = dbPath;
        this.validNames = constructNamesList();
    }

    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    private Standing fromResultSet(final ResultSet rs) throws SQLException {

        final int teamID = rs.getInt("TEAMID");
        final String teamName = rs.getString("teamName");
        final int wins = rs.getInt("wins");
        final int losses = rs.getInt("losses");
        final int ot_losses = rs.getInt("ot_losses");
        final int points = rs.getInt("points");
        final String winStreak = rs.getString("win_streak");
        final int picID = checkValid(teamName);

        return new Standing(teamID,teamName,wins,losses,ot_losses,points,winStreak,picID);

    }

    private List<String> constructNamesList() {
        List<String> validNames = new ArrayList<>();

        validNames.add("calgary flames");
        validNames.add("winnipeg jets");
        validNames.add("montreal canadiens");
        validNames.add("ottowa senators");
        validNames.add("toronto maple leafs");
        validNames.add("edmonton oilers");

        return  validNames;
    }

    private int checkValid(String teamName) {
        // check name to see if we have pic for team,
        // otherwise will return generic pic id.
        for (String curr : validNames){
            if (curr.equals(teamName.toLowerCase())) {
                if (curr.contains("flames"))
                    return R.drawable.flames;
                else if (curr.contains("jets"))
                    return R.drawable.jets;
                else if (curr.contains("montreal"))
                    return R.drawable.montreal;
                else if (curr.contains("ottowa"))
                    return R.drawable.ottawa;
                else if (curr.contains("leafs"))
                    return R.drawable.leafs;
                else if (curr.contains("oilers"))
                    return R.drawable.oilers;
            }
        }
        return R.drawable.nhl;
    }

    @Override
    public List<Standing> getStandingsInOrder() {

        final List<Standing> standings = new ArrayList<>();
        try(final Connection c = connection()) {

            final Statement st = c.createStatement();
            final ResultSet rs = st.executeQuery("select * from STANDINGS order by points desc");

            while(rs.next()) {
                final Standing standing = fromResultSet(rs);
                standings.add(standing);
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            throw new PersistenceException(e);
        }

        return standings;
    }
}
