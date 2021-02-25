package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.InvalidNameException;
import comp3350.winSport.objects.Team;

public interface ITeam {
    List<Team> getTeams();
    Team getSingleTeam();
    Team getTeamByName(String name) throws InvalidNameException;
}
