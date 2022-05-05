@Smoke
Feature: user can change currency

  Scenario: Logged User could switch between currencies US-Euro
    Given user navigates to login page
    And user enters login valid data and clicks on login button
    When user changes the currency
    Then the currency changed successfully