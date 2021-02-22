package comp3350.winSport.buisness;

import java.util.Collections;
import java.util.List;

import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.GameData;
import comp3350.winSport.persistence.GamePersistance;
import comp3350.winSport.persistence.TeamData;
import comp3350.winSport.persistence.TeamPersistance;

public class AccessTeams {

    private TeamPersistance teamPersistance;
    private List<Team> teams;
    private Team team;
    private int currentTeam;

    public AccessTeams() {

        teamPersistance  = new TeamData();
        teams = null;
        team = null;
        currentTeam = 0;
    }

    public List<Team> getTeams() {
        teams = teamPersistance.getTeams();
        return teams;
    }

    public Team getSingleGame() {
        team = teamPersistance.getSingleTeam();
        return team;
    }

    public Team getTeamByName(String name) {
        team = teamPersistance.getTeamByName(name);
        return team;
    }
}
