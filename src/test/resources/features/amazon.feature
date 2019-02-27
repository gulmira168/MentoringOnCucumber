@amazon
Feature: Amazon Search

  Background: Amazon Search test
    Given User goes to Amazon website

  Scenario: Amazon Search for Selenium Books
    When User enters search keywords
    And User clicks on Search button
    Then User should see search keywords in results

  Scenario: Amazon Search for Selenium Books
    When User enters keywords "Selenium Books"
    And User clicks on Search button
    Then User should see "Selenium Books" in results

  Scenario: Amazon Search for Java Books
    When User enters keywords "Java Books"
    And User clicks on Search button
    Then User should see "Java Books" in results

  Scenario: Amazon Search for SQL Books
    When User enters keywords "SQL Books"
    And User clicks on Search button
    Then User should see "SQL Books" in results

  Scenario: Amazon Search for API Books
    When User enters keywords "API Books"
    And User clicks on Search button
    Then User should see "API Books" in results

  Scenario Outline: Amazon Search for software testing books
    Given User goes to Amazon website
    When User enters keywords "<product>"
    And User clicks on Search button
    Then User should see "<product>" in results

    Examples: valid product names
      | product        |
      | Selenium Books |
      | Java Books     |
      | SQL Books      |
      | API Books      |

