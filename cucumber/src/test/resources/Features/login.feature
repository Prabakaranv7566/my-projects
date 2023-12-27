Feature: Validate the login functionality

  Scenario: Login check with valid credentials
    Given user should be on login page
    When User pass the values for username and password
    When user cliking the login button
    Then User should has to be on homepage
