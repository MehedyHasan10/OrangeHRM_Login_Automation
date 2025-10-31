Feature: OrangeHRM Successful Login

  Description:
  - User is on OrangeHRM login page
  - Browser is fully loaded
  - Valid credentials are available (Admin/admin123)

  Scenario: Successful login with valid credentials
    When User enters username "Admin"
    And User enters password "admin123"
    And User clicks on login button
    Then Dashboard page should display "Dashboard" text
    And User name in the top right corner should be displayed
