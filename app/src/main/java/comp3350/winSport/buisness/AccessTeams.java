package comp3350.winSport.buisness;

import java.util.List;

import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.InvalidNameException;
import comp3350.winSport.persistence.ITeamData;
import comp3350.winSport.persistence.ITeam;

public class AccessTeams {

    private ITeam ITeam;
    private List<Team> teams;
    private Team team;
    private int currentTeam;

    public AccessTeams() {

        ITeam = new ITeamData();
        teams = null;
        team = null;
        currentTeam = 0;
    }

    public List<Team> getTeams() {
        teams = ITeam.getTeams();
        return teams;
    }

    public Team getSingleGame() {
        team = ITeam.getSingleTeam();
        return team;
    }

    public Team getTeamByName(String name) throws InvalidNameException {
        team = ITeam.getTeamByName(name);
        return team;
    }
}
