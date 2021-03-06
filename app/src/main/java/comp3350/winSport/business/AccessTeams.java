package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.objects.Team;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.persistence.TeamData;

public class AccessTeams {

    private TeamData tData;

    private List<Team> teams;
    private Team team;
    private int currentTeam;

    public AccessTeams() {

        tData = new TeamData();
        teams = null;
        team = null;
        currentTeam = 0;
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
