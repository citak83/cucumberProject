@api
Feature: Pet Store
  Scenario: Create a Pet
    When user creates a pet with id, name, status
    Then the status code is 200
    And pet with id, name, status is created
