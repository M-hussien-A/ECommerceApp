@Smoke
Feature: user can search for any product

  Scenario: Logged User could search for any product
Given user navigates to login page
 And user enters login valid data and clicks on login button
    When user searches "Nokia"
    Then the product appears