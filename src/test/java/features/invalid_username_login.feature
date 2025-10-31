Feature: OrangeHRM Login - Invalid Credentials Handling

  Description:
  - User is on OrangeHRM login page
  - Browser is fully loaded
  - Valid username and invalid password are known

  Scenario: Verify login with invalid password
    When User enters username "WrongUser"
    And User enters password "admin123"
    And User clicks on login button
    Then Error message "Invalid credentials" should be displayed
    And User should remain on the login page
   
