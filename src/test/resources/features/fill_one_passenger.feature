Feature: Fill flight reservation.
  As an user
  I want to fill in my personal information for a flight reservation
  So that I can complete the booking process

  Scenario: Create a reservation with one passenger
    Given the user is on the flight reservation page
    When the user fills in the passenger information
    And the user submits the reservation
    Then the reservation should be created successfully

  Scenario: Create a reservation with missing first name
    Given the user is on the flight reservation page
    When the user fills in the passenger information
    And the user submits the reservation
    Then an error message should be displayed

  Scenario: Create a reservation with invalid email
    Given the user is on the flight reservation page
    When the user fills in the passenger information
    And the user submits the reservation
    Then an error message should be displayed indicating invalid email

