package com.example.test

import androidx.test.filters.RequiresDevice
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@RunWith(Suite::class)
@SuiteClasses(
    MainActivityTest::class,
    SecondaryActivityTest::class
)
@RequiresDevice
class ActivityTestSuite {
}