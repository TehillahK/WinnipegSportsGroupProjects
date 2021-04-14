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

import comp3350.winSport.presentation.MainActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class ScheduleTest {

    @Rule
    public ActivityTestRule<MainActivity> mainRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup(){
        mainRule.getActivity();
    }

    @Test
    public void viewSchedule(){
        onView(withId(R.id.schedule_layout)).perform(click());
        onView(allOf(withId(R.id.teamName), withText("Winnipeg Jets"))).perform(click());
    }

    @Test
    public void viewMultipleSchedules(){
        onView(withId(R.id.schedule_layout)).perform(click());
        onView(allOf(withId(R.id.teamName), withText("Winnipeg Jets"))).perform(click());
        pressBack();
        onView(allOf(withId(R.id.teamName), withText("Edmonton Oilers"))).perform(click());
    }
}
