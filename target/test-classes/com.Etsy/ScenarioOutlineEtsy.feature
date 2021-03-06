Feature: Scenario outline test

  Background: Etsy navigation
    Given the user goes to the Etsy


    # Scenario Outline:  and Scenario Template:   are same
  # Examples and Scenarios are the same

  @etsyOutline
    Scenario Outline: Etsy Search Validation with outline
      When the user search in etsy with "<searchValue>"
      Then the user validate title "<title>" url "<etsyUrl>"
      Examples:
        | searchValue    | title                  | etsyUrl |
        | winter hat     | Winter hat \| Etsy     | winter  |
        | hat            | Hat \| Etsy            | hat     |
        | winter soldier | Winter soldier \| Etsy | soldier |

      # to organize your code in intelliji you need to use option+command+l

   # @DataProvider
  # public Object[][] getData(){
   # return new Object{
   # {"first"}
   # {"second"}
   # }

