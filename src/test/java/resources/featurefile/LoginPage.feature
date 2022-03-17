Feature: Paylink Solutions Login Functionality
  User should able to login into Paylink Solutions

  Background: User is on Homepage

  Scenario: User should able to login with valid credentials
    Given  User is on Login Page
    And    User enters valid USERNAME and PASSWORD
      | USERNAME                       | PASSWORD    |
      | technicaltest22@protonmail.com | Password99* |
    And    User click on Login Button
    Then   Verify user is on account page


  Scenario Outline: Verify error message is diplayed for invalid credentials
    Given User is on Login Page
    And   User enters invalid "<USERNAME>" and "<PASSWORD>"
    And   User click on Login Button
    Then  Verify error message is displayed "<ERROR MESSAGE>"
    Examples:
      | USERNAME                       | PASSWORD    | ERROR MESSAGE                  |
      | abc@gmail.com                  | Password99* | Incorrect username or password |
      | technicaltest22@protonmail.com | abc123      | Incorrect username or password |
