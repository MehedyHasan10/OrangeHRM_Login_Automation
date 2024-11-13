Feature: Download an article as PDF from Wikipedia

  Scenario: Download the article "Albert Einstein" as PDF
    Then Main page is displayed
    When I input "Albert Einstein" in the search field
    And I click the submit button
    When I click the tools menu button
    And  I click  the Download as PDF button
    When I click the download button
    Then The file should be downloaded
    