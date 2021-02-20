
public class Player {

    private String name;
    private int number;
    private String position;

    public Player() {
        name = "Unknown";
        number = 0;
        position = "Unknown";
    }

    public Player(String nme, int num, String pos) {
        name = nme;
        number = num;
        position = pos;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }


    public void setName(String nme) {
        name = nme;
    }

    public void setNumber(int num) {
        number = num;
    }

    public void setPosition(String pos) {
        position = pos;
    }

    public String toString() {
        return "Player: [" + number + "] " + name + ", " + position;
    }
}
