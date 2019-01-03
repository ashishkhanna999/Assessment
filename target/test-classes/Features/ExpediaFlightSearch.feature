Feature: Exercise 2 – Expedia

  Scenario: Verify that user is able to search flight on Expedia website
    Given I navigate browser to "https://www.expedia.com/"
    When I should be able to view US version of the website
    Then I select Flight and Hotel accommodation
    And I enter "Brussels" in Origin field
    And I enter "New York" in Destination field
    Then I enter Departing date
    And I Select the Travelers from Travelers dropdown
    And I click on Search button
    Then I verify that Flight result page is displayed
