package comp3350.winSport.persistence;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.R;
import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.League;
import comp3350.winSport.objects.Period;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;

public class GameData implements IGame {

    private Game g1;
    private Game g2;
    private Game g3;
    private Game g4;

    private Team t1;
    private Team t2;
    private Team t3;
    private Team t4;
    private Team t5;
    private Team t6;



    public GameData() {

        g1 = null;
        g2 = null;
        g3 = null;
        g4 = null;

        initData();

    }

    public void initData() {

        Player p1 = new Player("Mark Scheifele", 55, "Centerman","Winnipeg Jets", R.drawable.jets);
        Player p2 = new Player("Kyle Connor", 81, "Left Wing","Winnipeg Jets", R.drawable.jets);
        Player p3 = new Player("Neal Pionk", 4, "Defenseman","Winnipeg Jets", R.drawable.jets);
        Player p4 = new Player("Blake Wheeler(C)", 26, "Right wing","Winnipeg Jets", R.drawable.jets);
        Player p5 = new Player("Mason Appleton", 22, "Right wing","Winnipeg Jets", R.drawable.jets);
        Player p6 = new Player("Nickolaj Ehlers", 27, "Right wing","Winnipeg Jets", R.drawable.jets);
        Player p7 = new Player("Adam Lowry", 17, "Centerman","Winnipeg Jets", R.drawable.jets);
        Player p8 = new Player("Josh Morrissey", 44, "Defenseman","Winnipeg Jets", R.drawable.jets);
        Player p9 = new Player("Mathieu Perreault", 85, "Left wing","Winnipeg Jets", R.drawable.jets);
        Player p10 = new Player("Paul Stastny", 25, "Centerman","Winnipeg Jets", R.drawable.jets);
        Player p11 = new Player("Nathan Beaulieu", 88, "Defensemen","Winnipeg Jets", R.drawable.jets);
        Player p12 = new Player("Andrew Copp", 9, "Left wing","Winnipeg Jets", R.drawable.jets);
        Player p13 = new Player("Dylan DeMelo", 2, "Defenseman","Winnipeg Jets", R.drawable.jets);
        Player p14 = new Player("Derek Forbort", 24, "Defenseman","Winnipeg Jets", R.drawable.jets);
        Player p15 = new Player("Jansen Harkins", 12, "Centerman","Winnipeg Jets", R.drawable.jets);
        Player p16 = new Player("Connor Hellebuyck", 1, "Goaltender","Winnipeg Jets", R.drawable.jets);
        Player p17 = new Player("Trevor Lewis", 23, "Right wing","Winnipeg Jets", R.drawable.jets);
        Player p18 = new Player("Tucker Poolman", 3, "Defenseman","Winnipeg Jets", R.drawable.jets);
        Player p19 = new Player("Kristian Vesalainen", 93, "Left wing","Winnipeg Jets", R.drawable.jets);


        ArrayList<Player> team1 = new ArrayList<>();
        team1.add(p1);
        team1.add(p2);
        team1.add(p3);
        team1.add(p4);
        team1.add(p5);
        team1.add(p6);
        team1.add(p7);
        team1.add(p8);
        team1.add(p9);
        team1.add(p10);
        team1.add(p11);
        team1.add(p12);
        team1.add(p13);
        team1.add(p14);
        team1.add(p15);
        team1.add(p16);
        team1.add(p17);
        team1.add(p18);
        team1.add(p19);

        Player p20 = new Player("Auston Matthews", 34, "Centerman","Toronto Maple Leafs",R.drawable.leafs);
        Player p21 = new Player("Joe Thornton", 97, "Left wing","Toronto Maple Leafs",R.drawable.leafs);
        Player p22 = new Player("Travis Boyd", 72, "Right wing","Toronto Maple Leafs",R.drawable.leafs);
        Player p23 = new Player("T. J. Brodie", 78, "Defenseman","Toronto Maple Leafs",R.drawable.leafs);
        Player p24 = new Player("Pierre Engvall", 47, "Right wing","Toronto Maple Leafs",R.drawable.leafs);
        Player p25 = new Player("Alexander Kerfoot", 15, "Centerman","Toronto Maple Leafs",R.drawable.leafs);
        Player p26 = new Player("Mitch Marner", 16, "Right wing","Toronto Maple Leafs",R.drawable.leafs);
        Player p27 = new Player("Morgan Rielly", 44, "Defenseman","Toronto Maple Leafs",R.drawable.leafs);
        Player p28 = new Player("Jason Spezza", 19, "Centerman","Toronto Maple Leafs",R.drawable.leafs);
        Player p29 = new Player("John Tavares", 91, "Centerman","Toronto Maple Leafs",R.drawable.leafs);
        Player p30 = new Player("Frederik Andersen", 31, "Goaltender","Toronto Maple Leafs",R.drawable.leafs);
        Player p31 = new Player("Zach Bogosian", 22, "Defenseman","Toronto Maple Leafs",R.drawable.leafs);
        Player p32 = new Player("Travis Dermott", 23, "Defenseman","Toronto Maple Leafs",R.drawable.leafs);
        Player p33 = new Player("Justin Holl", 3, "Defenseman","Toronto Maple Leafs",R.drawable.leafs);
        Player p34 = new Player("Zach Hyman", 11, "Left wing","Toronto Maple Leafs",R.drawable.leafs);
        Player p35 = new Player("Jake Muzzin", 8, "Defenseman","Toronto Maple Leafs",R.drawable.leafs);
        Player p36 = new Player("William Nylander", 88, "Left wing","Toronto Maple Leafs",R.drawable.leafs);
        Player p37 = new Player("Jimmy Vesey", 26, "Right wing","Toronto Maple Leafs",R.drawable.leafs);


        ArrayList<Player> team2 = new ArrayList<>();
        team2.add(p20);
        team2.add(p21);
        team2.add(p22);
        team2.add(p23);
        team2.add(p24);
        team2.add(p25);
        team2.add(p26);
        team2.add(p27);
        team2.add(p28);
        team2.add(p29);
        team2.add(p30);
        team2.add(p31);
        team2.add(p32);
        team2.add(p33);
        team2.add(p34);
        team2.add(p35);
        team2.add(p36);
        team2.add(p37);


        Player p39 = new Player("Connor Brown", 28, "Right wing","Ottawa Senators",R.drawable.ottawa);
        Player p40 = new Player("Thomas Chabot", 72, "Defenseman","Ottawa Senators",R.drawable.ottawa);
        Player p41 = new Player("Evgenii Dadonov", 63, "Right wing","Ottawa Senators",R.drawable.ottawa);
        Player p42 = new Player("Nick Paul", 13, "Left wing","Ottawa Senators",R.drawable.ottawa);
        Player p43 = new Player("Drake Batherson", 19, "Right wing","Ottawa Senators",R.drawable.ottawa);
        Player p44 = new Player("Josh Norris", 9, "Centerman","Ottawa Senators",R.drawable.ottawa);
        Player p45 = new Player("Tim Stützle", 18, "Left wing","Ottawa Senators",R.drawable.ottawa);
        Player p46 = new Player("Chris Tierney", 71, "Centerman","Ottawa Senators",R.drawable.ottawa);
        Player p47 = new Player("Brady Tkachuk", 7, "Left wing","Ottawa Senators",R.drawable.ottawa);
        Player p48 = new Player("Austin Watson", 16, "Right wing","Ottawa Senators",R.drawable.ottawa);
        Player p49 = new Player("Colin White", 36, "Centerman","Ottawa Senators",R.drawable.ottawa);
        Player p50 = new Player("Artyom Zub", 2, "Defenseman","Ottawa Senators",R.drawable.ottawa);
        Player p51 = new Player("Artem Anisimov", 51, "Centerman","Ottawa Senators",R.drawable.ottawa);
        Player p52 = new Player("Erik Gudbranson", 44, "Defenseman","Ottawa Senators",R.drawable.ottawa);
        Player p53 = new Player("Mark Högberg", 1, "Goaltender","Ottawa Senators",R.drawable.ottawa);
        Player p54 = new Player("Mike Reilly", 5, "Defenseman","Ottawa Senators",R.drawable.ottawa);
        Player p55 = new Player("Derek Stepan", 21, "Defenseman","Ottawa Senators",R.drawable.ottawa);
        Player p56 = new Player("Christian Wolanin", 24, "Defenseman","Ottawa Senators",R.drawable.ottawa);
        Player p57 = new Player("Nikita Zaitsev", 22, "Defenseman","Ottawa Senators",R.drawable.ottawa);


        ArrayList<Player> team3 = new ArrayList<>();
        team3.add(p39);
        team3.add(p40);
        team3.add(p41);
        team3.add(p42);
        team3.add(p43);
        team3.add(p44);
        team3.add(p45);
        team3.add(p46);
        team3.add(p47);
        team3.add(p48);
        team3.add(p49);
        team3.add(p50);
        team3.add(p51);
        team3.add(p52);
        team3.add(p53);
        team3.add(p54);
        team3.add(p55);
        team3.add(p56);
        team3.add(p57);


        Player p58 = new Player("Tyson Barrie", 22, "Defenseman","Edmonton Oilers",R.drawable.oilers);
        Player p59 = new Player("Evan Bouchard", 75, "Defenseman","Edmonton Oilers",R.drawable.oilers);
        Player p60 = new Player("Alex Chiasson", 39, "Right wing","Edmonton Oilers",R.drawable.oilers);
        Player p61 = new Player("Connor McDavid", 97, "Centerman","Edmonton Oilers",R.drawable.oilers);
        Player p62 = new Player("Ryan Nugent-Hopkins", 93, "Left wing","Edmonton Oilers",R.drawable.oilers);
        Player p63 = new Player("Tyler Ennis", 63, "Left wing","Edmonton Oilers",R.drawable.oilers);
        Player p64 = new Player("Darnel Nurse", 25, "Defenseman","Edmonton Oilers",R.drawable.oilers);
        Player p65 = new Player("Jesse Puljujärvi", 13, "Right wing","Edmonton Oilers",R.drawable.oilers);
        Player p66 = new Player("Delvin Shore", 14, "Left wing","Edmonton Oilers",R.drawable.oilers);
        Player p67 = new Player("Kailer Yamamoto", 56, "Right wing","Edmonton Oilers",R.drawable.oilers);
        Player p68 = new Player("Josh Archibald", 15, "Right wing","Edmonton Oilers",R.drawable.oilers);
        Player p69 = new Player("Leon Draisaitl", 29, "Centerman","Edmonton Oilers",R.drawable.oilers);
        Player p70 = new Player("Dominik Kahun", 21, "Left wing","Edmonton Oilers",R.drawable.oilers);
        Player p71 = new Player("Jujhar Khaira", 16, "Centerman","Edmonton Oilers",R.drawable.oilers);
        Player p72 = new Player("Slater Koekkoek", 20, "Defenseman","Edmonton Oilers",R.drawable.oilers);
        Player p73 = new Player("Mikko Koskinen", 19, "Goaltender","Edmonton Oilers",R.drawable.oilers);
        Player p74 = new Player("William Lagesson", 84, "Goaltender","Edmonton Oilers",R.drawable.oilers);
        Player p75 = new Player("Adam Larson", 6, "Defenseman","Edmonton Oilers",R.drawable.oilers);
        Player p76 = new Player("Mike Smith", 41, "Goaltender","Edmonton Oilers",R.drawable.oilers);
        Player p77 = new Player("Kyle Turris", 8, "Centerman","Edmonton Oilers",R.drawable.oilers);

        ArrayList<Player> team4 = new ArrayList<>();
        team4.add(p58);
        team4.add(p59);
        team4.add(p60);
        team4.add(p61);
        team4.add(p62);
        team4.add(p63);
        team4.add(p64);
        team4.add(p65);
        team4.add(p66);
        team4.add(p67);
        team4.add(p68);
        team4.add(p69);
        team4.add(p70);
        team4.add(p71);
        team4.add(p72);
        team4.add(p73);
        team4.add(p74);
        team4.add(p75);
        team4.add(p76);
        team4.add(p77);

        Player p78 = new Player("Rasmus Anderson", 4, "Defenseman","Calgary Flames",R.drawable.calgary_flames);
        Player p79 = new Player("Elias Lindholm", 28, "Centerman","Calgary Flames",R.drawable.calgary_flames);
        Player p80 = new Player("Dillon Dube", 29, "Centerman","Calgary Flames",R.drawable.calgary_flames);
        Player p81 = new Player("Johnny Gaudreau", 13, "Left wing","Calgary Flames",R.drawable.calgary_flames);
        Player p82 = new Player("Milan Lucic", 17, "Left wing","Calgary Flames",R.drawable.calgary_flames);
        Player p83 = new Player("Connor Mackey", 3, "Defenseman","Calgary Flames",R.drawable.calgary_flames);
        Player p84 = new Player("Sean Monahan", 23, "Centerman","Calgary Flames",R.drawable.calgary_flames);
        Player p85 = new Player("Sam Bennett", 93, "Left wing","Calgary Flames",R.drawable.calgary_flames);
        Player p86 = new Player("Byron Froese", 38, "Centerman","Calgary Flames",R.drawable.calgary_flames);
        Player p87 = new Player("Mark Giordano", 5, "Defenseman","Calgary Flames",R.drawable.calgary_flames);
        Player p88 = new Player("Noah Hanifin", 55, "Defenseman","Calgary Flames",R.drawable.calgary_flames);
        Player p89 = new Player("Andrew Mangiapane", 88, "Left wing","Calgary Flames",R.drawable.calgary_flames);
        Player p90 = new Player("Jacob Markström", 25, "Goaltender","Calgary Flames",R.drawable.calgary_flames);
        Player p91 = new Player("Jokaim Nordström", 20, "Left wing","Calgary Flames",R.drawable.calgary_flames);
        Player p92 = new Player("Buddy Robinson", 53, "Right wing","Calgary Flames",R.drawable.calgary_flames);
        Player p93 = new Player("Dominik Simon", 81, "Right wing","Calgary Flames",R.drawable.calgary_flames);
        Player p94 = new Player("Christopher Tanev", 8, "Defenseman","Calgary Flames",R.drawable.calgary_flames);
        Player p95 = new Player("Matthew Tkatchuk", 19, "Right wing","Calgary Flames",R.drawable.calgary_flames);
        Player p96 = new Player("Juuso Välimäki", 6, "Defenseman","Calgary Flames",R.drawable.calgary_flames);


        ArrayList<Player> team5 = new ArrayList<>();
        team5.add(p78);
        team5.add(p79);
        team5.add(p80);
        team5.add(p81);
        team5.add(p82);
        team5.add(p83);
        team5.add(p84);
        team5.add(p85);
        team5.add(p86);
        team5.add(p87);
        team5.add(p88);
        team5.add(p89);
        team5.add(p90);
        team5.add(p91);
        team5.add(p92);
        team5.add(p93);
        team5.add(p94);
        team5.add(p95);
        team5.add(p96);


        Player p97 = new Player("Brendan Gallagher", 11, "Right wing","Montreal Canadiens",R.drawable.montreal);
        Player p98 = new Player("Tyler Toffoli", 73, "Left wing","Montreal Canadiens",R.drawable.montreal);
        Player p99 = new Player("Phillip Danault", 24, "Centerman","Montreal Canadiens",R.drawable.montreal);
        Player p100 = new Player("Jeff Petry", 26, "Defenseman","Montreal Canadiens",R.drawable.montreal);
        Player p101 = new Player("Josh Anderson", 17, "Right wing","Montreal Canadiens",R.drawable.montreal);
        Player p102 = new Player("Joel Armia", 40, "Left wing","Montreal Canadiens",R.drawable.montreal);
        Player p103= new Player("Paul Byron", 41, "Left wing","Montreal Canadiens",R.drawable.montreal);
        Player p104 = new Player("Ben Chiarot", 8, "Defenseman","Montreal Canadiens",R.drawable.montreal);
        Player p105 = new Player("Jonathan Drouin", 92, "Left wing","Montreal Canadiens",R.drawable.montreal);
        Player p106= new Player("Joel Edmundson", 44, "Defenseman","Montreal Canadiens",R.drawable.montreal);
        Player p107 = new Player("Jake Evans", 71, "Centerman","Montreal Canadiens",R.drawable.montreal);
        Player p108 = new Player("Jesperi Kotkaniemi", 15, "Centerman","Montreal Canadiens",R.drawable.montreal);
        Player p109 = new Player("Arturri Lehkonen", 62, "Left wing","Montreal Canadiens",R.drawable.montreal);
        Player p110 = new Player("Victor Mete", 53, "Defenseman","Montreal Canadiens",R.drawable.montreal);
        Player p111 = new Player("Corey Perry", 94, "Right wing","Montreal Canadiens",R.drawable.montreal);
        Player p112 = new Player("Carey Price", 81, "Goaltender","Montreal Canadiens",R.drawable.montreal);
        Player p113 = new Player("Alexander Romanov", 27, "Defenseman","Montreal Canadiens",R.drawable.montreal);
        Player p114 = new Player("Nick Suzuki", 14, "Centerman","Montreal Canadiens",R.drawable.montreal);
        Player p115 = new Player("Shea Weber", 6, "Defenseman","Montreal Canadiens",R.drawable.montreal);


        ArrayList<Player> team6 = new ArrayList<>();
        team6.add(p97);
        team6.add(p98);
        team6.add(p99);
        team6.add(p100);
        team6.add(p101);
        team6.add(p102);
        team6.add(p103);
        team6.add(p104);
        team6.add(p105);
        team6.add(p106);
        team6.add(p107);
        team6.add(p108);
        team6.add(p109);
        team6.add(p110);
        team6.add(p111);
        team6.add(p112);
        team6.add(p113);
        team6.add(p114);
        team6.add(p115);


        League league1 = new League(1, "NHL");
        League league2 = new League(2, "NHL");

        t1 = new Team("Winnipeg Jets", team1, R.drawable.jets);
        t2 = new Team("Toronto Maple Leafs", team2,R.drawable.leafs);
        t3 = new Team("Ottawa Senators", team3, R.drawable.ottawa);
        t4 = new Team("Edmonton Oilers", team4,R.drawable.oilers);
        t5 = new Team("Calgary Flames", team5,R.drawable.calgary_flames);
        t6 = new Team("Montreal Canadiens", team6,R.drawable.montreal);

        Period game1p1 = new Period(1, 3);
        Period game1p2 = new Period(2, 5);

        try{
            game1p2.addGoal(p2, "13:12");
            game1p2.addGoal(p6, "19:44");
        }
        catch(Exception InvalidNameException){
            System.out.print(InvalidNameException.toString());
        }

        Period game1p3 = new Period(3, 4);
        ArrayList<Period> game1Periods = new ArrayList<>();
        game1Periods.add(game1p1);
        game1Periods.add(game1p2);
        game1Periods.add(game1p3);

        Period game2p1 = new Period(1, 6);

        try{
            game2p1.addGoal(p12, "09:05");
            game2p1.addGoal(p13, "16:07");
            game2p1.addGoal(p17, "11:11");
        }
        catch(Exception InvalidNameException){
            System.out.print(InvalidNameException.toString());
        }


        Period game2p2 = new Period(2, 2);
        Period game2p3 = new Period(3, 3);
        ArrayList<Period> game2Periods = new ArrayList<>();
        game2Periods.add(game2p1);
        game2Periods.add(game2p2);
        game2Periods.add(game2p3);


        g1 = new Game(1, "Stanley Cup Playoffs", league1, t1, t2, "Feb 26, 2021", "Rogers Place", game1Periods, "4 - 3");
        g2 = new Game(2, "Stanley Cup Playoffs", league2, t3, t4, "Feb 26, 2021", "Scotiabank Arena", game2Periods, "6 - 5");
        g3 = new Game(3, "Stanley Cup Playoffs", league1, t5, t6, "Feb 27, 2021", "Rogers Place", game1Periods, "7 - 3");
        g4 = new Game(4, "Stanley Cup Playoffs", league2, t1, t6, "Feb 27, 2021", "Scotiabank Arena", game2Periods, "9 - 5");

//        System.out.println(g1.toString());
//        System.out.println(g2.toString());

    }

    @Override
    public List<Game> getGamesSequential() {

        List<Game> games = new ArrayList<>();
        games.add(g1);
        games.add(g2);
        games.add(g3);
        games.add(g4);

        return games;
    }

    @Override
    public Game getSingleGame() {
        return this.g1;
    }

    public List<Team> GetTeams() {

        List<Team> teams = new ArrayList<>();

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        teams.add(t4);
        teams.add(t5);
        teams.add(t6);

        return teams;
    }

}
