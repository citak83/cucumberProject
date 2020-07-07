Feature: Validation of headers

  Scenario: Validation of new order headers
    Given the demoUser enters username "Tester"
    When the demoUser enters password "test"
    Then the user goes to the new order page
    And the user validate the product headers
      | Product:*        |
      | Quantity:*       |
      | Price per unit:  |
      | Discount:        |
      | Total:           |

    # Task using datatable the header for adress information
  #Create new step for this scenario and validate the headers for adress
     * the user validate the adress headers

      | Customer name:* |
      | Street:*        |
      | City:*          |
      | State:          |
      | Zip:*           |


