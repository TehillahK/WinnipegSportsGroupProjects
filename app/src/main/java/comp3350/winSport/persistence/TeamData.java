package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.objects.Team;

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
            System.out.print("\nTeam not found.");
            return null;
        }
        else {
            throw new InvalidNameException("please pass a team name with letters only");
        }
    }
}
