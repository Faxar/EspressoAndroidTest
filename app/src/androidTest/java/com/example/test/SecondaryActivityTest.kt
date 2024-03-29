package com.example.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest {

    @get: Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun testSecondaryActivity() {
        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))
    }
}