package comp3350.winSport.persistence;

import java.util.List;

import comp3350.winSport.objects.Team;

public class TeamData implements TeamPersistance {

    GameData gData = new GameData();

    @Override
    public List<Team> getTeams() {
        return gData.GetTeams();
    }

    @Override
    public Team getSingleTeam() {
        return getTeams().get(0);
    }

    @Override
    public Team getTeamByName(String name) {

        List<Team> teams = gData.GetTeams();
        Team findMe;

        for (Team curr : teams) {
            if (curr.getName().equals(name))
                return curr;
        }

        return teams.get(0);
    }
}
