$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ExpediaFlightSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Exercise 2 – Expedia",
  "description": "",
  "id": "exercise-2-–-expedia",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5441595788,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify that user is able to search flight on Expedia website",
  "description": "",
  "id": "exercise-2-–-expedia;verify-that-user-is-able-to-search-flight-on-expedia-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate browser to \"https://www.expedia.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I should be able to view US version of the website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I select Flight and Hotel accommodation",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter \"Brussels\" in Origin field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"New York\" in Destination field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter Departing date",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I Select the Travelers from Travelers dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify that Flight result page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.expedia.com/",
      "offset": 23
    }
  ],
  "location": "stepDefinition.i_Navigate_browser_to(String)"
});
formatter.result({
  "duration": 28010774112,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_should_be_able_to_view_US_version_of_the_website()"
});
formatter.result({
  "duration": 51468012,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_select_Flight_and_Hotel_accommodation()"
});
formatter.result({
  "duration": 24887676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brussels",
      "offset": 9
    }
  ],
  "location": "stepDefinition.i_enter_in_Origin_field(String)"
});
formatter.result({
  "duration": 3871462544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 9
    }
  ],
  "location": "stepDefinition.i_enter_in_Destination_field(String)"
});
formatter.result({
  "duration": 2894525730,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_enter_Departing_date()"
});
formatter.result({
  "duration": 1865562611,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_Select_the_Travelers_from_Travelers_dropdown()"
});
formatter.result({
  "duration": 2537120137,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_Search_button()"
});
formatter.result({
  "duration": 1766343733,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_verify_that_Flight_result_page_is_displayed()"
});
formatter.result({
  "duration": 16393536346,
  "status": "passed"
});
formatter.after({
  "duration": 280312375,
  "status": "passed"
});
formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Exercise 1 – Google",
  "description": "",
  "id": "exercise-1-–-google",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2308079190,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify that user is able to search and take screeshot on Google website",
  "description": "",
  "id": "exercise-1-–-google;verify-that-user-is-able-to-search-and-take-screeshot-on-google-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate browser to \"https://www.google.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for \"Bahamas\" on Google home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should verify google search result page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I take the screenshot of search result page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I search for \"Amsterdam\" on Google home page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should verify google search result page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com",
      "offset": 23
    }
  ],
  "location": "stepDefinition.i_Navigate_browser_to(String)"
});
formatter.result({
  "duration": 8233594592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bahamas",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_search_for_on_Google_home_page(String)"
});
formatter.result({
  "duration": 8208160763,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_should_verify_google_search_result_page()"
});
formatter.result({
  "duration": 18140638,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_take_the_screenshot_of_search_result_page()"
});
formatter.result({
  "duration": 733698825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amsterdam",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_search_for_on_Google_home_page(String)"
});
formatter.result({
  "duration": 8432122865,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_should_verify_google_search_result_page()"
});
formatter.result({
  "duration": 13104703,
  "status": "passed"
});
formatter.after({
  "duration": 158698198,
  "status": "passed"
});
formatter.uri("WeatherAPI.feature");
formatter.feature({
  "line": 1,
  "name": "Exercise 3 – REST API",
  "description": "",
  "id": "exercise-3-–-rest-api",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test will validate weather from Weather API",
  "description": "",
  "id": "exercise-3-–-rest-api;test-will-validate-weather-from-weather-api",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Get API for Country \"\u003cCountry\u003e\" and City \"\u003cCity\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Max Temp value \"\u003ckey\u003e\" is to be validated",
  "keyword": "When "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "exercise-3-–-rest-api;test-will-validate-weather-from-weather-api;",
  "rows": [
    {
      "cells": [
        "Country",
        "City",
        "key"
      ],
      "line": 8,
      "id": "exercise-3-–-rest-api;test-will-validate-weather-from-weather-api;;1"
    },
    {
      "cells": [
        "us",
        "New York",
        "MaxTemp"
      ],
      "line": 9,
      "id": "exercise-3-–-rest-api;test-will-validate-weather-from-weather-api;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2652975318,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Test will validate weather from Weather API",
  "description": "",
  "id": "exercise-3-–-rest-api;test-will-validate-weather-from-weather-api;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Get API for Country \"us\" and City \"New York\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Max Temp value \"MaxTemp\" is to be validated",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "us",
      "offset": 21
    },
    {
      "val": "New York",
      "offset": 35
    }
  ],
  "location": "stepDefinition.get_WeatherResponse(String,String)"
});
formatter.result({
  "duration": 1852323557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MaxTemp",
      "offset": 16
    }
  ],
  "location": "stepDefinition.max_Temp_value_is_to_be_validated(String)"
});
formatter.result({
  "duration": 324014417,
  "status": "passed"
});
formatter.after({
  "duration": 123754568,
  "status": "passed"
});
});