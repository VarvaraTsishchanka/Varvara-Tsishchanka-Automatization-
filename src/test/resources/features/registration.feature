Feature: User Registration

  Scenario: Unsuccessful registration with invalid email
    Given the user navigates to the registration page
    When the user enters first name "Ольга"
    And the user enters last name "Романова"
    And the user enters date of birth "01/01/1990"
    And the user enters email "olga_165677mail.ru"
    And the user enters password "a12345678"
    And the user enters password confirmation "a12345678"
    And the user clicks the submit button
    Then the registration should fail with an error message
