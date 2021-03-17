package comp3350.winSport.business;

import java.util.Collections;
import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Team;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.fakeDB.TeamData;

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
        team = tData.getTeamByName(name);
        return team;
    }

}
