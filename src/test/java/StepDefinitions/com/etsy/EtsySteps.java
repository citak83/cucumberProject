package StepDefinitions.com.etsy;

import Pages.EtsyPages.EtsyHomePages;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EtsySteps {

    WebDriver driver= Driver.getDriver();
    EtsyHomePages etsyHomePages=new EtsyHomePages(driver);

    @Given("the user goes to the Etsy")
    public void the_user_goes_to_the_Etsy() {
        driver.navigate().to(ConfigReader.getProperty("etsyUrl"));
    }

    @When("the user search in etsy with {string}")
    public void the_user_search_in_etsy_with(String searchValue) {
        etsyHomePages.searchBox.sendKeys(searchValue);
        etsyHomePages.searchButton.click();
    }

    @Then("the user validate title {string} url {string}")
    public void the_user_validate_title_url(String expectedTitle, String searchValue) {
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchValue));


    }


}
