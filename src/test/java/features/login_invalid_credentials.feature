Feature: OrangeHRM Login - Invalid Credentials Handling

  Description:
  - User is on OrangeHRM login page
  - Browser is fully loaded
  - Validate login with invalid username or password

  @TC_LM_002
  Scenario: Verify login with invalid password
    When User enters username "Admin"
    And User enters password "wrong123"
    And User clicks on login button
    Then Error message "Invalid credentials" should be displayed
    And User should remain on the login page

  @TC_LM_003
  Scenario: Verify login with invalid username
    When User enters username "WrongUser"
    And User enters password "admin123"
    And User clicks on login button
    Then Error message "Invalid credentials" should be displayed
    And User should remain on the login page
