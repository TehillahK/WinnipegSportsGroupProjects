package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.Team;

public interface TeamPersistance {
    List<Team> getTeams();
    Team getSingleTeam();
    Team getTeamByName(String name);
}
