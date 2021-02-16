package GameRooster;

import DataTypes.List;
public class Team {
    private String teamName;
    private String teamLogoPath;
    private List teamMates;
    private boolean home;
    public Team()
    {
        teamName="";
        teamLogoPath="";
        home=false;
    }
    public Team(String teamName,String teamLogoPath, boolean isHome)
    {
        this.teamLogoPath=teamName;
        this.teamLogoPath=teamLogoPath;
        this.home=isHome;
    }
    public boolean isHome()
    {
        return home;
    }
    public String toString()
    {

        return this.teamLogoPath+","+this.teamName+"";
    }
}
