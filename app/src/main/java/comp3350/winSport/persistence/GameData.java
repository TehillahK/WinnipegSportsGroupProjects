package comp3350.winSport.persistence;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.objects.Game;
import comp3350.winSport.objects.League;
import comp3350.winSport.objects.Period;
import comp3350.winSport.objects.Player;
import comp3350.winSport.objects.Team;

public class GameData implements GamePersistance {

    private Game g1;
    private Game g2;
    private Game g3;
    private Game g4;

    public GameData() {

        g1 = null;
        g2 = null;
        g3 = null;
        g4 = null;

        initData();

    }

    public void initData() {

        Player p1 = new Player("Mark Scheifele", 55, "Position1");
        Player p2 = new Player("Kyle Connor", 81, "Position1");
        Player p3 = new Player("Neal Pionk", 4, "Position1");
        Player p4 = new Player("Blake Wheeler", 26, "Position1");
        Player p5 = new Player("Mason Appleton", 22, "Position1");
        Player p6 = new Player("Nickolaj Ehlers", 27, "Position1");
        Player p7 = new Player("Adam Lowry", 17, "Position1");
        Player p8 = new Player("Josh Morrissey", 44, "Position1");
        Player p9 = new Player("Mathieu Perreault", 85, "Position1");
        Player p10 = new Player("Paul Stastny", 25, "Position1");
        Player p11 = new Player("Nathan Beaulieu", 88, "Position1");
        Player p12 = new Player("Andrew Copp", 9, "Position1");
        Player p13 = new Player("Dylan DeMelo", 2, "Position1");
        Player p14 = new Player("Derek Forbort", 24, "Position1");
        Player p15 = new Player("Jansen Harkins", 12, "Position1");
        Player p16 = new Player("Connor Hellebuyck", 1, "Position1");
        Player p17 = new Player("Trevor Lewis", 23, "Position1");
        Player p18 = new Player("Tucker Poolman", 3, "Position1");
        Player p19 = new Player("Kristian Vesalainen", 93, "Position1");


        ArrayList<Player> team1 = new ArrayList<Player>();
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

        Player p20 = new Player("Auston Matthews", 34, "Position1");
        Player p21 = new Player("Joe Thornton", 97, "Position1");
        Player p22 = new Player("Travis Boyd", 72, "Position1");
        Player p23 = new Player("T. J. Brodie", 78, "Position1");
        Player p24 = new Player("Pierre Engvall", 47, "Position1");
        Player p25 = new Player("Alexander Kerfoot", 15, "Position1");
        Player p26 = new Player("Mitch Marner", 16, "Position1");
        Player p27 = new Player("Morgan Rielly", 44, "Position1");
        Player p28 = new Player("Jason Spezza", 19, "Position1");
        Player p29 = new Player("John Tavares", 91, "Position1");
        Player p30 = new Player("Frederik Andersen", 31, "Position1");
        Player p31 = new Player("Zach Bogosian", 22, "Position1");
        Player p32 = new Player("Travis Dermott", 23, "Position1");
        Player p33 = new Player("Justin Holl", 3, "Position1");
        Player p34 = new Player("Zach Hyman", 11, "Position1");
        Player p35 = new Player("Jake Muzzin", 8, "Position1");
        Player p36 = new Player("William Nylander", 88, "Position1");
        Player p37 = new Player("Jimmy Vesey", 26, "Position1");


        ArrayList<Player> team2 = new ArrayList<Player>();
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


        Player p39 = new Player("Connor Brown", 28, "Position1");
        Player p40 = new Player("Thomas Chabot", 72, "Position1");
        Player p41 = new Player("Evgenii Dadonov", 63, "Position1");
        Player p42 = new Player("Nick Paul", 13, "Position1");
        Player p43 = new Player("Drake Batherson", 19, "Position1");
        Player p44 = new Player("Josh Norris", 9, "Position1");
        Player p45 = new Player("Tim Stützle", 18, "Position1");
        Player p46 = new Player("Chris Tierney", 71, "Position1");
        Player p47 = new Player("Brady Tkachuk", 7, "Position1");
        Player p48 = new Player("Austin Watson", 16, "Position1");
        Player p49 = new Player("Colin White", 36, "Position1");
        Player p50 = new Player("Artyom Zub", 2, "Position1");
        Player p51 = new Player("Artem Anisimov", 51, "Position1");
        Player p52 = new Player("Erik Gudbranson", 44, "Position1");
        Player p53 = new Player("Mark Högberg", 1, "Position1");
        Player p54 = new Player("Mike Reilly", 5, "Position1");
        Player p55 = new Player("Derek Stepan", 21, "Position1");
        Player p56 = new Player("Christian Wolanin", 24, "Position1");
        Player p57 = new Player("Nikita Zaitsev", 22, "Position1");


        ArrayList<Player> team3 = new ArrayList<Player>();
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


        Player p58 = new Player("Tyson Barrie", 22, "Position1");
        Player p59 = new Player("Evan Bouchard", 75, "Position1");
        Player p60 = new Player("Alex Chiasson", 39, "Position1");
        Player p61 = new Player("Connor McDavid", 97, "Position1");
        Player p62 = new Player("Ryan Nugent-Hopkins", 93, "Position1");
        Player p63 = new Player("Tyler Ennis", 63, "Position1");
        Player p64 = new Player("Darnel Nurse", 25, "Position1");
        Player p65 = new Player("Jesse Puljujärvi", 13, "Position1");
        Player p66 = new Player("Delvin Shore", 14, "Position1");
        Player p67 = new Player("Kailer Yamamoto", 56, "Position1");
        Player p68 = new Player("Josh Archibald", 15, "Position1");
        Player p69 = new Player("Leon Draisaitl", 29, "Position1");
        Player p70 = new Player("Dominik Kahun", 21, "Position1");
        Player p71 = new Player("Jujhar Khaira", 16, "Position1");
        Player p72 = new Player("Slater Koekkoek", 20, "Position1");
        Player p73 = new Player("Mikko Koskinen", 19, "Position1");
        Player p74 = new Player("William Lagesson", 84, "Position1");
        Player p75 = new Player("Adam Larson", 6, "Position1");
        Player p76 = new Player("Mike Smith", 41, "Position1");
        Player p77 = new Player("Kyle Turris", 8, "Position1");

        ArrayList<Player> team4 = new ArrayList<Player>();
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

        Player p78 = new Player("Rasmus Anderson", 4, "Position1");
        Player p79 = new Player("Elias Lindholm", 28, "Position1");
        Player p80 = new Player("Dillon Dube", 29, "Position1");
        Player p81 = new Player("Johnny Gaudreau", 13, "Position1");
        Player p82 = new Player("Milan Lucic", 17, "Position1");
        Player p83 = new Player("Connor Mackey", 3, "Position1");
        Player p84 = new Player("Sean Monahan", 23, "Position1");
        Player p85 = new Player("Sam Bennett", 93, "Position1");
        Player p86 = new Player("Byron Froese", 38, "Position1");
        Player p87 = new Player("Mark Giordano", 5, "Position1");
        Player p88 = new Player("Noah Hanifin", 55, "Position1");
        Player p89 = new Player("Andrew Mangiapane", 88, "Position1");
        Player p90 = new Player("Jacob Markström", 25, "Position1");
        Player p91 = new Player("Jokaim Nordström", 20, "Position1");
        Player p92 = new Player("Buddy Robinson", 53, "Position1");
        Player p93 = new Player("Dominik Simon", 81, "Position1");
        Player p94 = new Player("Christopher Tanev", 8, "Position1");
        Player p95 = new Player("Matthew Tkatchuk", 19, "Position1");
        Player p96 = new Player("Juuso Välimäki", 6, "Position1");


        ArrayList<Player> team5 = new ArrayList<Player>();
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

        Player p97 = new Player("Brendan Gallagher", 11, "Position1");
        Player p98 = new Player("Tyler Toffoli", 73, "Position1");
        Player p99 = new Player("Phillip Danault", 24, "Position1");
        Player p100 = new Player("Jeff Petry", 26, "Position1");
        Player p101 = new Player("Josh Anderson", 17, "Position1");
        Player p102 = new Player("Joel Armia", 40, "Position1");
        Player p103= new Player("Paul Byron", 41, "Position1");
        Player p104 = new Player("Ben Chiarot", 8, "Position1");
        Player p105 = new Player("Jonathan Drouin", 92, "Position1");
        Player p106= new Player("Joel Edmundson", 44, "Position1");
        Player p107 = new Player("Jake Evans", 71, "Position1");
        Player p108 = new Player("Jesperi Kotkaniemi", 15, "Position1");
        Player p109 = new Player("Arturri Lehkonen", 62, "Position1");
        Player p110 = new Player("Victor Mete", 53, "Position1");
        Player p111 = new Player("Corey Perry", 94, "Position1");
        Player p112 = new Player("Carey Price", 81, "Position1");
        Player p113 = new Player("Alexander Romanov", 27, "Position1");
        Player p114 = new Player("Nick Suzuki", 14, "Position1");
        Player p115 = new Player("Shea Weber", 6, "Position1");


        ArrayList<Player> team6 = new ArrayList<Player>();
        team6.add(p96);
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


        League league1 = new League(1, "NHL");
        League league2 = new League(2, "NHL");

        Team t1 = new Team("Winnipeg Jets", team1);
        Team t2 = new Team("Toronto Maple Leafs", team2);
        Team t3 = new Team("Ottawa Senators", team3);
        Team t4 = new Team("Edmonton Oilers", team4);
        Team t5 = new Team("Calgary Flames", team5);
        Team t6 = new Team("Montreal Canadiens", team6);

        Period game1p1 = new Period(1, 3);
        Period game1p2 = new Period(2, 5);
        game1p2.addGoal(p2, "13:12");
        game1p2.addGoal(p6, "19:44");
        Period game1p3 = new Period(3, 4);
        ArrayList<Period> game1Periods = new ArrayList<Period>();
        game1Periods.add(game1p1);
        game1Periods.add(game1p2);
        game1Periods.add(game1p3);

        Period game2p1 = new Period(1, 6);
        game2p1.addGoal(p12, "09:05");
        game2p1.addGoal(p13, "16:07");
        game2p1.addGoal(p17, "11:11");
        Period game2p2 = new Period(2, 2);
        Period game2p3 = new Period(3, 3);
        ArrayList<Period> game2Periods = new ArrayList<Period>();
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

        List<Game> games = new ArrayList<Game>();
        games.add(g1);
        games.add(g2);
        games.add(g3);
        games.add(g4);

        return games;
    }
}
