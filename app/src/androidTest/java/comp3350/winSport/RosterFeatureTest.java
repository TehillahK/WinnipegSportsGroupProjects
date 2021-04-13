package comp3350.winSport;

import android.widget.AdapterViewAnimator;
import android.widget.ListView;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import comp3350.winSport.presentation.MainActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


@RunWith(AndroidJUnit4.class)
public class RosterFeatureTest {

    @Rule
    public ActivityTestRule<MainActivity> mainRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup(){
        mainRule.getActivity();
    }

    @Test
    public void viewTeamRoster() {
        onView(withId(R.id.teamRostersMenu)).perform(click());
        onView(allOf(withId(R.id.teamName), withText("Winnipeg Jets"))).perform(click());
    }

    @Test
    public void viewMultipleTeamRoster() {
        onView(withId(R.id.teamRostersMenu)).perform(click());
        onView(allOf(withId(R.id.teamName), withText("Winnipeg Jets"))).perform(click());
        pressBack();
        onView(allOf(withId(R.id.teamName), withText("Calgary Flames"))).perform(click());
    }
}
