Feature: OrangeHRM Empty Fields Validation

  Description:
  - User is on OrangeHRM login page
  - Validate required field messages when username or password is empty

  @TC_LM_004
  Scenario: Verify login when both fields are empty
    When User enters username ""
    And User enters password ""
    And User clicks on login button
    Then Error message under username field should be "Required"
    And Error message under password field should be "Required"
    And User should remain on the login page

  @TC_LM_005
  Scenario: Verify login with only username entered (password empty)
    When User enters username "Admin"
    And User enters password ""
    And User clicks on login button
    Then Error message under password field should be "Required"
    And User should remain on the login page

  @TC_LM_006
  Scenario: Verify login with only password entered (username empty)
    When User enters username ""
    And User enters password "admin123"
    And User clicks on login button
    Then Error message under username field should be "Required"
    And User should remain on the login page
