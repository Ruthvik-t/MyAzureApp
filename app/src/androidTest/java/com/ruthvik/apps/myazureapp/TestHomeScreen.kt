package com.ruthvik.apps.myazureapp

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.ruthvik.apps.myazureapp.ui.theme.MyAzureAppTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TestHomeScreen {

    @get:Rule
    val composeTestRule: ComposeContentTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            MyAzureAppTheme {
                Greeting("Android", Modifier.testTag("Test"))
            }
        }
    }

    @Test
    fun verify_greeting() {
        composeTestRule.onNodeWithText("Hello Android!").assertIsDisplayed()
    }
}