package comp3350.winSport.application;

public class Main
{
    private static String dbName="WS";

//    public static void main(String[] args)
//    {
////        CLI.run();
//        System.out.println("All done");
//    }

    public static void setDBPathName(final String name) {
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        dbName = name;
    }

    public static String getDBPathName() {
        return dbName;
    }
}