@Smoke

Feature: user adds products to cart

  Scenario:  Logged user could add different products to Wishlist

    Given user navigates to login page
    And user enters login valid data and clicks on login button
    When user searches "Nokia"
    And user adds the product to wishlist
    Then the product added to the wishlist

  Scenario:  Logged user could add different products to Shopping cart

    Given user navigates to login page
    And user enters login valid data and clicks on login button
    When user searches "Nokia"
    And user adds the product to shopping cart
    Then the product added to the shopping cart


  Scenario:   Logged user could add different products to compare list
    Given user navigates to login page
    And user enters login valid data and clicks on login button
    When user searches "Nokia"
    And user adds the product to compare list
    Then the product added to the compare list


