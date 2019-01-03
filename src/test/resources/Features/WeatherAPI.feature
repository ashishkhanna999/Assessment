Feature: Exercise 3 – REST API

  Scenario Outline: Test will validate weather from Weather API
    Given Get API for Country "<Country>" and City "<City>"
    When Max Temp value "<key>" is to be validated

    Examples: 
      | Country | City     | key     |
      | us      | New York | MaxTemp |
