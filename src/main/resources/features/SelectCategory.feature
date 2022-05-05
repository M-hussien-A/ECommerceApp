@Smoke
Feature: Select by category

  Scenario:  Logged user could select different Categories
Given user navigates to login page
And user enters login valid data and clicks on login button
  When user can select category and subcategory
  Then verify the category is selected

  Scenario:  Logged user could filter with color
    Given user navigates to login page
    And user enters login valid data and clicks on login button
    When user can select category and subcategory
    And user can filter by color
    Then verify the category and color are selected

  Scenario:  Logged user could select different tags
    Given user navigates to login page
    And user enters login valid data and clicks on login button
    When user can select category and subcategory
    And user can select tag
    Then verify the tag is selected