#Author Adeep
@Login
Feature: Validate Login functionality of MagicBricks application

  @valid_login
  Scenario Outline: Login into MagicBricks application using valid credentials
    Given User is on Login Page of MagicBricks application
    When User enters the Email as "<Email>" on Login Page of MagicBricks application
    And User clicks on Next button
    And User enters the Password as "<Password>" on Login Page of MagicBricks application
    And User Clicks on the Login button on Login Page of MagicBricks application
    Then User should be able to navigate to the Home page of MagicBricks application

    Examples: 
      | Email                | Password   |
      | adeep.dv97@gmail.com | adeep1997! |

  @invalid_login
  Scenario Outline: Login into MagicBricks application using invalid credentials
    Given User is on Login Page of MagicBricks application
    When User enters the Email as "<Email>" on Login Page of MagicBricks application
    And User clicks on Next button
    And User enters the Password as "<Password>" on Login Page of MagicBricks application
    And User Clicks on the Login button on Login Page of MagicBricks application
    Then User should be able to navigate to the Home page of MagicBricks application

    Examples: 
      | Email                | Password   |
      | adeep.dv97@gmail.com |            |
      |                      | adeep1997! |
      |                      |            |
