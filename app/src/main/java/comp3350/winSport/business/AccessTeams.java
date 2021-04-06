package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Team;
import comp3350.winSport.exceptions.InvalidNameException;
import comp3350.winSport.persistence.ITeam;

public class AccessTeams {

    /*
        Abstracts where the data is comming from using interfaces.
        What UI methods call to get data
    */

    private ITeam tData;
    private List<Team> teams;
    private Team team;

    public AccessTeams() {
        tData = Services.getTeamPersistance();
        teams = null;
        team = null;
    }

    public AccessTeams(final ITeam tData) {
        this();
        this.tData = tData;
    }

    public List<Team> getTeams() {
        teams = tData.getTeams();
        return (teams);
    }

    public Team getSingleTeam() {
        team = tData.getSingleTeam();
        return team;
    }

    public Team getTeamByName(String name) throws InvalidNameException {
        if (name.matches("^[a-zA-z]+([\\s][a-zA-Z]+)*$")) {
            team = tData.getTeamByName(name);
        }
        else {
            throw new InvalidNameException("please pass a team name with letters only");
        }
        return team;
    }

}
