Feature: Add additional passengers to a flight reservation
  As an user
  I want to fill in personal information for additional passengers
  So that I can complete the booking process for multiple people

  Scenario: Add an additional passenger to an existing reservation
    Given the user is on the flight reservation page
    And the user has an existing reservation
    When the user navigates to the Reservar page
    And the user presses to add a new passenger
    And the user fills in the additional passenger information
    And the user submits the updated reservation
    Then the reservation should be updated successfully

  Scenario: Add multiple additional passengers to an existing reservation
    Given the user has an existing reservation
    When the user navigates to the "Reservar" page
    And the user selects to add new passengers
    And the user fills in the additional passengers information
    And the user submits the updated reservation
    Then the reservation should be updated successfully

  Scenario: Edit additional passenger information before submitting
    Given the user has an existing reservation
    When the user navigates to the "Manage Reservation" page
    And the user selects to add a new passenger
    And the user fills in the additional passenger information
    And the user edits the additional passenger information
    And the user submits the updated reservation
    Then the reservation should be updated successfully

