@Smoke

Feature: user can register with new account successfully




  Scenario: user could sign up with valid credentials

    When user opens the browser and navigates to registration page
    And user enters registration valid data and clicks on register button
    Then valid registration message is displayed
