
Feature: Testing datatables website



  Scenario: Testing adding new employee to the table
    Given User goes to URL
    And User clicks on New Button
    Then User should see Create New Entry Box
    And User should enter firstname
    And User should enter lastname
    And User should enter position
    And User should enter office
    And User should enter extension
    And User should enter start date
    And User should enter salary
    Then User should click to create button
    And User enters first name to search box
    Then User should see first name is inserted in the table

  @wip
  Scenario: Testing adding new employee to the table
    Given User goes to URL
    And User clicks on New Button
    Then User should see Create New Entry Box
    And User should enter firstname "Ann"
    And User should enter lastname "White"
    And User should enter position "SDET"
    And User should enter office "McLean"
    And User should enter extension "168"
    And User should enter start date "2019-03-18"
    And User should enter salary "100000"
    Then User should click to create button
    And User enters first name "Ann" to search box
    Then User should see first name "Ann" is inserted in the table

  @wip
  Scenario Outline: Testing adding new employee to the table
    Given User goes to URL
    And User clicks on New Button
    Then User should see Create New Entry Box
    And User should enter firstname "<firstname>"
    And User should enter lastname "<lastname>"
    And User should enter position "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extension>"
    And User should enter start date "<date>"
    And User should enter salary "<salary>"
    Then User should click to create button
    And User enters first name "<firstname>" to search box
    Then User should see first name "<firstname>" is inserted in the table

    Examples: Test data for datatables

      | firstname | lastname | position   | office   | extension | date       | salary |
      | Ann       | White    | SDET       | McLean   | 168       | 2019-03-18 | 100000 |
      | Bradley   | Bean     | Developer  | Chicago  | 312       | 2019-11-01 | 150000 |
      | Adam      | Sailer   | Developer  | New York | 310       | 2019-10-10 | 160000 |
      | Daniel    | Cast     | Manager    | Berlin   | 310       | 2019-10-10 | 250000 |
      | Freddie   | Nice     | Accountant | Hartford | 310       | 2019-10-10 | 250000 |
