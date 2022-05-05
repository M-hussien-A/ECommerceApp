@Smoke
Feature: Create successful full Order

Scenario:  Create successful Order

Given user navigates to login page
And user enters login valid data and clicks on login button
When user searches "Nokia"
And user adds the product to shopping cart
And user navigates to shopping cart and continue shopping
Then the order processes successfully