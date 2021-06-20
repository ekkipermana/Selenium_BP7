Feature: Login

  Scenario: username and password not match
    Given user open the web page
    When user input username and password
    Then user see the dashboard
