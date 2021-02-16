package GameRooster;

public class Player {
    private String firstName;
    private String lastName;
    private String position;
    
    private int playerNumber;
    private boolean captain;
    private double weight;
    public Player(){
        firstName="";
        lastName="";
        position="";
        playerNumber=0;
        weight=0.0;
        captain=false;
    }
    public Player(String firstName,String lastName,int playerNumber,double weight,boolean captain)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.playerNumber=playerNumber;
        this.weight=weight;
        this.captain=captain;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getPosition()
    {
        return position;
    }
    public boolean getCaptain()
    {
        return captain;
    }
    public double getWeight()
    {
        return weight;
    }
    public int getPlayerNumber()
    {
        return playerNumber;
    }
}
