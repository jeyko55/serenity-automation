Feature: Clear all fields in the flight reservation form
  As an user
  I want to clear all the fields in the flight reservation form
  So that I can reset the form and start over if needed

  Scenario: Clear all fields when the Clear button is pressed
    Given the user is on the flight reservation page
    And the flight information is pre-defined
    When the user fills in the passenger information
    And the user presses the Clear button
    Then all the passenger information fields should be empty
