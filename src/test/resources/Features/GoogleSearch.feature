Feature: Exercise 1 – Google

  Scenario: Verify that user is able to search and take screeshot on Google website
    Given I navigate browser to "https://www.google.com"
    When I search for "Bahamas" on Google home page
    Then I should verify google search result page
    And I take the screenshot of search result page
    When I search for "Amsterdam" on Google home page
    Then I should verify google search result page
