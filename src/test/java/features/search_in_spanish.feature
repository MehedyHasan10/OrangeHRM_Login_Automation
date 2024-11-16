Feature: Search for an article in Spanish
  As a user
  I want to search for an article in Spanish
  So that I can view the article page in Spanish language

  Scenario: Search for "Gabriel García Márquez" in Spanish and view the article
    Then Main page is displayed
    When I input "Gabriel García Márquez" in the search field
    And I select "Spanish" from the language dropdown
    And I click the submit button
    Then The article page for "Gabriel García Márquez" should be open
