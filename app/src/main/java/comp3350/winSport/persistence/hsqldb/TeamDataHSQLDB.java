package comp3350.winSport.persistence.hsqldb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.ITeam;


public class TeamDataHSQLDB implements ITeam {
    @Override
    public List<Team> getTeams() {
        return null;
    }

    @Override
    public Team getSingleTeam() {
        return null;
    }

    @Override
    public Team getTeamByName(String name) {
        return null;
    }
}
