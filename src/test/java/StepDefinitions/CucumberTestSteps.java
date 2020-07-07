package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CucumberTestSteps {

    // We need to import the @Given, @When and @Then annotation
    @Given("the user school name")
    public void the_user_school_name() {

        System.out.println("Techtorial");
    }

    @When("the user print the name")
    public void the_user_print_the_name() {

        System.out.println("David");
    }

    @Then("the user print the last name")
    public void the_user_print_the_last_name() {

        System.out.println("Hunt");
    }

    @Then("the user print the city")
    public void the_user_print_the_city() {

        System.out.println("Des Plaines");
    }

    @Then("the user print the state")
    public void the_user_print_the_state() {

        System.out.println("Illinois");
    }

    @Then("the user validate the product titles")
    public void the_user_validate_the_product_titles(DataTable dataTable) {
                                                     // List<String> titles

        List<String> titles= dataTable.asList(); // then we will not use that for using List<String>.

        for (String title: titles){
            System.out.println("Title is "+title);
        }

    }
    @Then("the user login to the page")
    public void the_user_login_to_the_page(Map<String,String> data) {

        Set<String> keys=data.keySet(); //--> return type of keysSet is Set

        // we loop our keys to get the all keys from map
        for (String key: keys){
            // We used the get method which is from the map to get the value.
            System.out.println(data.get(key));
        }
    }
    @Then("the user validate order details list of list")
    public void the_user_validate_order_details_list_of_list(DataTable dataTable) {

        // asLists method will return the list of list of string
        List<List<String>> productDetails=dataTable.asLists();

        for (int i=0;i<productDetails.size();i++){
            for (int k=0; k<productDetails.get(i).size();k++){

                System.out.print(productDetails.get(i).get(k)+"-");

            }
            System.out.println();
        }

    }
    @Then("the user validate order details")
    public void the_user_validate_order_details(List<Map<String,String>> data) {

        for (Map <String,String> dt :data){
          Set<String> keys=dt.keySet();
          for (String key : keys){
              System.out.println(dt.get(key));
          }

        }

    }


}
