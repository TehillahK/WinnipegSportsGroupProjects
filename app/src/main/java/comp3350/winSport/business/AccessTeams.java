package comp3350.winSport.business;

import java.util.List;

import comp3350.winSport.application.Services;
import comp3350.winSport.objects.Team;
import comp3350.winSport.exceptions.InvalidNameException;
import comp3350.winSport.persistence.ITeam;

public class AccessTeams {

    /*
        Abstracts where the data is comming from using interfaces.
        What UI methods call to get data
    */

    private ITeam tData;
    private List<Team> teams;
    private Team team;
    private PictureChecker pc;

    public AccessTeams() {
        tData = Services.getTeamPersistance();
        teams = null;
        team = null;
        pc = new PictureChecker();
    }

    public AccessTeams(final ITeam tData) {
        this();
        this.tData = tData;
        pc = new PictureChecker();
    }

    public List<Team> getTeams() {
        teams = tData.getTeams();
        checkAllPics();
        return (teams);
    }

    public Team getSingleTeam() {
        team = tData.getSingleTeam();
        checkTeamPic();
        return team;
    }

    public Team getTeamByName(String name) throws InvalidNameException {
        if (name.matches("^[a-zA-z]+([\\s][a-zA-Z]+)*$")) {
            team = tData.getTeamByName(name);
            checkTeamPic();
        }
        else {
            throw new InvalidNameException("please pass a team name with letters only");
        }
        return team;
    }

    private void checkAllPics() {
        for (Team curr : teams)
            if (curr.getTeamPic() == 0)
                curr.setTeamPic(pc.getPic(curr.getName()));
    }

    private void checkTeamPic() {
        if (team.getTeamPic() == 0)
            team.setTeamPic(pc.getPic(team.getName()));
    }


}
