package comp3350.winSport.persistence.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import comp3350.winSport.objects.NewsPost;
import comp3350.winSport.persistence.INewsFeed;

public class NewsFeedDataHSQLDB implements INewsFeed {
    private final String dbPath;

    public NewsFeedDataHSQLDB(String dbPath) {
        this.dbPath = dbPath;
    }
    private Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath + ";shutdown=true", "SA", "");
    }

    private NewsPost fromResultSet(final ResultSet rs) throws SQLException
    {
        return null;
    }

    @Override
    public List<NewsPost> getNewsPosts() {
        return null;
    }
}
