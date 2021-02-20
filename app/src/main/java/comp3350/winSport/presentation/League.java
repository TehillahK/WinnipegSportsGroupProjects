
public class League {

    private int ID;
    private String name;

    public League() {
        ID = 0;
        name = "Unknown";
    }

    public League(int n, String m) {
        ID = n;
        name = m;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int n) {
        ID = n;
    }

    public void setName(String s) {
        name = s;
    }

    public String toString() {
        return "League: [" + ID + "] " + name;
    }

}
