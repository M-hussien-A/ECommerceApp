@Smoke
Feature:  reset password

  Scenario: user could reset his/her password successfully
    Given user navigates to login page
    And user selects reset password
    When user enters his-her email
    Then the password resets successfully