@Smoke
Feature: user can login with his/her account successfully




  Scenario: user could login with valid credentials

    When user navigates to login page
    And user enters login valid data and clicks on login button
    Then user enters to his account

