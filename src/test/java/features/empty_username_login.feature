Feature: OrangeHRM Empty Fields Validation

  Description:
  - User is on OrangeHRM login page
  - Username and password fields are empty

  Scenario: Verify login when both fields are empty
    When User enters username ""
    And User enters password "admin123"
    And User clicks on login button
    Then Error message under username field should be "Required"
    And User should remain on the login page
