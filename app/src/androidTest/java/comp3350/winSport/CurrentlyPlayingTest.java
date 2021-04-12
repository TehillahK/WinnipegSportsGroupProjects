package comp3350.winSport;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import comp3350.winSport.application.Services;
import comp3350.winSport.persistence.IGame;
import comp3350.winSport.presentation.CurrentlyPlayingActivity;
import comp3350.winSport.presentation.MainActivity;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
//@LargeTest
public class CurrentlyPlayingTest {

    @Rule
    public ActivityTestRule<MainActivity> mainRule = new ActivityTestRule<>(MainActivity.class);

    //@Rule
    //public ActivityTestRule<CurrentlyPlayingActivity> activityRule = new ActivityTestRule<>(CurrentlyPlayingActivity.class);

    @Before
    public void setupDatabase(){

        //IGame iGame = Services.getGamePersistance();
        mainRule.getActivity();
        //activityRule.getActivity();
    }

    @Test
    public void viewCurrentGames(){
        onView(withId(R.id.currentlyPlayingMenu)).perform(click());
        //onView(ViewMatchers.withId(R.layout.activity_currently_playing)).perform(ViewActions.swipeUp());
    }
}
