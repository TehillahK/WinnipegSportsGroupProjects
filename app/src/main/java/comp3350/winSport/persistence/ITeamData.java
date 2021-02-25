package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.Team;

public class ITeamData implements ITeam {

    IGameData gData = new IGameData();

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
    public Team getTeamByName(String name) throws InvalidNameException{

        if (name.matches("([a-zA-Z]|\\s)*")) {
            List<Team> teams = gData.GetTeams();

            for (Team curr : teams) {
                if (curr.getName().equals(name))
                    return curr;
            }
            return null;
        }
        else {
            throw new InvalidNameException("please pass a numeric team name");
        }
    }
}
