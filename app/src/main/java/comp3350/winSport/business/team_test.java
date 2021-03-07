package comp3350.winSport.buisness;

import java.util.Collections;
import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.ITeam;

public class team_test {

    private ITeam team_interface;
    private List<Team> teams;
    private Team team;
    private int currentTeam;

    public team_test() {
        team_interface = Services.getTeamPersistance();
        teams = null;
        team = null;
        currentTeam = 0;
    }

    public team_test(final ITeam teamPersistance) {
        this();
        this.team_interface = teamPersistance;
    }

    public List<Team> getTeams() {
        teams = team_interface.getTeams();
        return Collections.unmodifiableList(teams);
    }

    public Team getSequential() {
        String result = null;
        if (teams == null) {
            teams = team_interface.getTeams();
            currentTeam = 0;
        }
        if (currentTeam < teams.size()) {
            team = (Team) teams.get(currentTeam);
            currentTeam++;
        }
        else {
            teams = null;
            team = null;
            currentTeam = 0;
        }
        return team;
    }

}
