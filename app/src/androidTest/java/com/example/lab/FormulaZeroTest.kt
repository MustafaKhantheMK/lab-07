package com.example.lab

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FormulaZeroTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun navigateToRacesAddRaceAndReturnHome() {
        // navigate to race screen
        composeTestRule
            .onNodeWithTag("raceButton")
            .performClick()

        // verify race screen
        composeTestRule
            .onNodeWithTag("locationInput")
            .assertIsDisplayed()

        // enter race location
        composeTestRule
            .onNodeWithTag("locationInput")
            .performTextInput("Canada")

        // add race location
        composeTestRule
            .onNodeWithTag("addRaceButton")
            .performClick()

        // verify race appears
        composeTestRule
            .onNodeWithText("Canada")
            .assertIsDisplayed()

        // return to home screen
        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        // verify return to home screen
        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertIsDisplayed()
    }
    @Test
    fun navigateToDriverAddNamesAndReturnHome() {
        // navigate to race screen
        composeTestRule
            .onNodeWithTag("driverButton")
            .performClick()

        // verify race screen
        composeTestRule
            .onNodeWithTag("driverInput")
            .assertIsDisplayed()

        // enter race location
        composeTestRule
            .onNodeWithTag("driverInput")
            .performTextInput("Saif")

        // add race location
        composeTestRule
            .onNodeWithTag("addNameButton")
            .performClick()

        // verify race appears
        composeTestRule
            .onNodeWithText("Saif")
            .assertIsDisplayed()

        // return to home screen
        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        // verify return to home screen
        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertIsDisplayed()
    }
}