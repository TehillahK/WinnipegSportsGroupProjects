package comp3350.winSport.persistence.fakeDB;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.exceptions.InvalidNameException;
import comp3350.winSport.objects.Team;
import comp3350.winSport.persistence.ITeam;
import comp3350.winSport.persistence.fakeDB.GameData;

public class TeamData implements ITeam {

    List<Team> teams;
    PlayerData playerData = new PlayerData();

    Team t1;
    Team t2;
    Team t3;
    Team t4;
    Team t5;
    Team t6;


    public TeamData() {
        teams = new ArrayList<>();
        initData();
    }

    void initData() {

        t1 = new Team("Winnipeg Jets", playerData.getPlayersById(1), R.drawable.jets,0);
        t2 = new Team("Toronto Maple Leafs", playerData.getPlayersById(2),R.drawable.leafs,1);
        t3 = new Team("Ottawa Senators", playerData.getPlayersById(3), R.drawable.ottawa,2);
        t4 = new Team("Edmonton Oilers", playerData.getPlayersById(4),R.drawable.oilers,3);
        t5 = new Team("Calgary Flames", playerData.getPlayersById(5),R.drawable.flames,4);
        t6 = new Team("Montreal Canadiens", playerData.getPlayersById(6),R.drawable.montreal,5);

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        teams.add(t4);
        teams.add(t5);
        teams.add(t6);

    }


    @Override
    public List<Team> getTeams() {
        return teams;
    }

    // just returns winnipeg jets if only 1 team is required.
    @Override
    public Team getSingleTeam() {
        return t1;
    }

    @Override
    public Team getTeamByName(String name) throws InvalidNameException {

        if (name.matches("^[a-zA-z]+([\\s][a-zA-Z]+)*$")) {

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

}
