package StepDefinitions.com.WebOrder;

import Pages.WebOrderPages.AllOrdersPage;
import Pages.WebOrderPages.HomePage;
import Pages.WebOrderPages.OrderPage;
import Utils.BrowserUtils;
import Utils.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NewOrderSteps {
    WebDriver driver= Driver.getDriver();
    HomePage homePage=new HomePage(driver);
    OrderPage orderPage=new OrderPage(driver);
    AllOrdersPage allOrdersPage=new AllOrdersPage(driver);

    @Then("the user enter product info {string} and {string}")
    public void the_user_enter_product_info_and(String product, String quantity) throws InterruptedException {
        homePage.orderButton.click();
        Select select=new Select(orderPage.productName);
        select.selectByVisibleText(product);

        orderPage.quantity.clear();
        Thread.sleep(1000);
        orderPage.quantity.sendKeys(quantity);

    }

    @Then("the user enter address info {string}, {string}, {string}, {string}, {string}")
    public void the_user_enter_address_info(String customerName, String street, String city, String state, String zipCode) {
        orderPage.customerName.sendKeys(customerName);
        orderPage.street.sendKeys(street);
        orderPage.city.sendKeys(city);
        orderPage.state.sendKeys(state);
        orderPage.zipCode.sendKeys(zipCode);

    }

    @Then("the user enter payment info {string}, {string}, {string}")
    public void the_user_enter_payment_info(String card, String cardNum, String expiration) {
        switch (card){
            case "Visa":
                orderPage.visaCard.click();
                break;
            case "Master":
                orderPage.masterCard.click();
                break;
            case "American Express":
                orderPage.amex.click();
                break;
        }
        orderPage.cardNumber.sendKeys(cardNum);
        orderPage.expirationDate.sendKeys(expiration);
        orderPage.processButton.click();

    }

    @Then("the user validate success message")
    public void the_user_validate_success_message() {
        Assert.assertTrue(orderPage.successMessage.isDisplayed());

    }
    @Then("the user validate new order details {string}, {string},{string}, {string},{string},{string},{string},{string},{string},{string}")
    public void the_user_validate_new_order_details(String productName, String quantity, String name, String address, String city, String state, String zipCode, String cardType, String cardNum, String expDate) {

        homePage.viewAllOrdersButton.click();
        List<WebElement> orderDetails=allOrdersPage.newOrderDetails;
        Assert.assertEquals(orderDetails.get(1).getText(),name);
        Assert.assertEquals(orderDetails.get(2).getText(),productName);
        Assert.assertEquals(orderDetails.get(3).getText(),quantity);

        String today= BrowserUtils.todaysDate("MM/dd/yyyy");
        // While we are asserrting in JUnit forst expected and decond actual
        // in TESTNG first actual than expected
        Assert.assertEquals(orderDetails.get(4).getText(),today);

        Assert.assertEquals(orderDetails.get(5).getText(),address);
        Assert.assertEquals(orderDetails.get(6).getText(),city);
        Assert.assertEquals(orderDetails.get(7).getText(),state);
        Assert.assertEquals(orderDetails.get(8).getText(),zipCode);
        Assert.assertEquals(orderDetails.get(9).getText(),cardType);
        Assert.assertEquals(orderDetails.get(10).getText(),cardNum);
        Assert.assertEquals(orderDetails.get(11).getText(),expDate);
    }
    @Then("the user goes to the new order page")
    public void the_user_goes_to_the_new_order_page() {
        homePage.orderButton.click();


    }

    @Then("the user validate the product headers")
    public void the_user_validate_the_product_headers(List<String> productHeaders) {

        List<String> actualProductHeader=BrowserUtils.getTextOfElement(orderPage.productDetails);
        Assert.assertEquals(actualProductHeader,productHeaders);


    }
    @Then("the user validate the adress headers")
    public void the_user_validate_the_adress_headers(DataTable dataTable) {

        // since it is comig from the features file. It is expected
        List<String> expected=dataTable.asList();
        List<String> actual=BrowserUtils.getTextOfElement(orderPage.addressDetails);
        Assert.assertEquals(actual,expected);

        // create the method will take one parameter as list of weblelement
        // return list of String

    }
    @Then("the user clicks the all products button")
    public void the_user_clicks_the_all_products_button() {
        homePage.allProductsButton.click();

    }

    @Then("the user validate the product details")
    public void the_user_validate_the_product_details(DataTable dataTable) {

            List<WebElement> pTable=homePage.productTable;
            for (int i=0; i<dataTable.asList().size(); i++){
                Assert.assertEquals("Validation of product table",dataTable.asList().get(i),pTable.get(i).getText());


        }
    }






}
