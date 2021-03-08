package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Team;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.fakeDB.TeamData;

public class AccessTeams {

    private ITeam tData;
    private List<Team> teams;
    private Team team;
    private int currentTeam;

    public AccessTeams() {
        tData = Services.getTeamPersistance();
        teams = null;
        team = null;
        currentTeam = 0;
    }

    public AccessTeams(final ITeam tData) {
        this();
        this.tData = tData;
    }

    public List<Team> getTeams() {
        teams = tData.getTeams();
        return teams;
    }

    public Team getSingleGame() {
        team = tData.getSingleTeam();
        return team;
    }

    public Team getTeamByName(String name) throws InvalidNameException {
        team = tData.getTeamByName(name);
        return team;
    }


}
