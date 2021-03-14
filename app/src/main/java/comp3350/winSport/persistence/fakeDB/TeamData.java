package comp3350.winSport.persistence.fakeDB;

import java.util.List;

import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.fakeDB.GameData;

public class TeamData implements ITeam {

    GameData gData = new GameData();

    @Override
    public List<Team> getTeams() {
        return gData.GetTeams();
    }

    // just returns winnipeg jets if only 1 team is required.
    @Override
    public Team getSingleTeam() {
        return getTeams().get(0);
    }

    @Override
    public Team getTeamByName(String name) throws InvalidNameException {

        if (name.matches("^[a-zA-z]+([\\s][a-zA-Z]+)*$")) {
            List<Team> teams = gData.GetTeams();

            for (Team curr : teams) {
                if (curr.getName().equals(name))
                    return curr;
            }

            //If team is not in the list...
//            System.out.print("\nTeam not found.");
            return null;
        }
        else {
            throw new InvalidNameException("please pass a team name with letters only");
        }
    }

    @Override
    public Team insertTeam(Team team) {
        return null;
    }

    @Override
    public void insertAllTeams(List<Team> teams) {

    }

    @Override
    public Team updateTeam(Team team) {
        return null;
    }
}
