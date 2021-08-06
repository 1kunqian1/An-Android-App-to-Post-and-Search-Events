
package com.laioffer.eventreporter;

import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExpressoTestSample {
    private String mStringToBetyped;

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(
            LoginActivity.class);

    @Before
    public void initValidString() {
        mStringToBetyped = "Espresso";
    }

    /**
     * Check if Login successfully, if yes, it should go to another EventActivity
     */
    @Test
    public void checkLoginSuccessful() {
        //Type username
        onView(withId(R.id.editTextLogin)).perform(ViewActions.clearText()).
                perform(ViewActions.typeText("abc"));

        //Type password
        onView(withId(R.id.editTextPassword)).perform(ViewActions.clearText()).
                perform(ViewActions.typeText("abc"));

        //Send intent and check intent
        onView(withId(R.id.submit)).perform(ViewActions.click());

        //Check text
        onView(withId(R.id.Events)).check(matches(withText("Events")));
    }

    @Test
    public void checkShowToast() {
        //Type username
        onView(withId(R.id.editTextLogin)).perform(ViewActions.clearText()).
                perform(ViewActions.typeText("abc"));


        //Send intent and check intent
        onView(withId(R.id.submit)).perform(ViewActions.click());

        //Check text
        onView(withId(R.id.Events)).check(matches(withText("Events")));
    }

}
