Feature: View information page for "Bengal tiger" article

  Scenario: Search for "Bengal tiger" and view article information
    Then Main page is displayed
    When I input "Bengal tiger" in the search field
    And I click the submit button
    When I click the tools menu button
    And I click the Page information button
    Then Information page for Bengal tiger article is displayed
