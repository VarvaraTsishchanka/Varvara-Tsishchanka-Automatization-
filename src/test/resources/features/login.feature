  Feature: User Login

    Scenario: Successful login with valid credentials
      Given the user navigates to the login page
      When the user enters the email "maria_7657@mail.ru"
      And the user enters the password "a12345678"
      And the user clicks the sign-in button
      Then the user should be successfully logged in

  Feature: Login functionality

    Scenario: User tries to log in with an incorrect email address
      Given the user navigates to the login page
      When the user enters an incorrect email and password
      Then the user should see an error message