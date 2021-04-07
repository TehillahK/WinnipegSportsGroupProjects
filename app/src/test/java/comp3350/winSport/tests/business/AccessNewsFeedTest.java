package comp3350.winSport.tests.business;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import comp3350.winSport.business.AccessNewsFeed;
import comp3350.winSport.objects.NewsPost;
import comp3350.winSport.persistence.INewsFeed;
import comp3350.winSport.persistence.IStanding;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AccessNewsFeedTest {
    private INewsFeed iNewsFeed;
    private AccessNewsFeed accessNewsFeed;

    @Before
    public void setUp(){
        iNewsFeed = mock(INewsFeed.class);
        accessNewsFeed = new AccessNewsFeed(iNewsFeed);
    }

    @Test
    public void testGetNewsPosts(){
        System.out.print("\n------------------AccessNewsFeed Test---------------------");
        System.out.print("\n---------------------------------------");
        System.out.print("\nTest 1: Get NewsPosts");
        System.out.print("\n---------------------------------------");
        final List<NewsPost> dummyList;
        final List<NewsPost> sampleNewsPosts = new ArrayList<>();

        when(iNewsFeed.getNewsPosts()).thenReturn(sampleNewsPosts);

        dummyList = accessNewsFeed.getNewsPosts();
        assertNotNull(dummyList);

        verify(iNewsFeed).getNewsPosts();

        System.out.print("\nFinished test.");
    }
}
