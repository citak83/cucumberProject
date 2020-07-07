$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com.WebOrder/LoginTest.feature");
formatter.feature({
  "name": "WebOrder Login page test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Page Positive Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser validate the home page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_validate_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Functionality Negative Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"techtorial\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser validate \"Invalid Login or Password.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_validate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Functionality Negative Test 1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@conditional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"tttt\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser validate \"Invalid Login or Password.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_validate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Functionality Negative Test 2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Techtorial\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"tttt\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser validate \"Invalid Login or Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_validate(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Error message validation expected:\u003c...id Login or Password[]\u003e but was:\u003c...id Login or Password[.]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_validate(LoginPageSteps.java:63)\n\tat ✽.the demoUser validate \"Invalid Login or Password\"(file:///Users/nurayerdal/IdeaProjects/CucumberBatch4/src/test/resources/com.WebOrder/LoginTest.feature:24)\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com.WebOrder/NewOrder.feature");
formatter.feature({
  "name": "New Order validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate new order in WebOrder page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter product info \"MyMoney\" and \"10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_product_info_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter address info \"David\", \"2200 E devon\", \"Des plaines\", \"Illinos\", \"60018\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_address_info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter payment info \"Visa\", \"4444333322221111\", \"05/24\"",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_payment_info(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com.WebOrder/NewOrderDataTable.feature");
formatter.feature({
  "name": "Validation of headers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of new order headers",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to the new order page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_goes_to_the_new_order_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate the product headers",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_the_product_headers(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate the adress headers",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_the_adress_headers(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com.WebOrder/NewOrderOutline.feature");
formatter.feature({
  "name": "Validation of New order using Scenario Outline",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "New Order Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user enter product info \"\u003cproductName\u003e\" and \"\u003cquantitiy\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the user enter address info \"\u003cname\u003e\", \"\u003caddress\u003e\", \"\u003ccity\u003e\", \"\u003cstate\u003e\", \"\u003czipcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enter payment info \"\u003ccardType\u003e\", \"\u003ccardNumber\u003e\", \"\u003cexpDate\u003e\"",
  "keyword": "* "
});
formatter.step({
  "name": "the user validate success message",
  "keyword": "Then "
});
formatter.step({
  "name": "the user validate new order details \"\u003cproductName\u003e\", \"\u003cquantitiy\u003e\",\"\u003cname\u003e\", \"\u003caddress\u003e\",\"\u003ccity\u003e\",\"\u003cstate\u003e\",\"\u003czipcode\u003e\",\"\u003ccardType\u003e\",\"\u003ccardNumber\u003e\",\"\u003cexpDate\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "productName",
        "quantitiy",
        "name",
        "address",
        "city",
        "state",
        "zipcode",
        "cardType",
        "cardNumber",
        "expDate"
      ]
    },
    {
      "cells": [
        "MyMoney",
        "10",
        "David",
        "2200 E devon",
        "Des Planies",
        "Illinois",
        "60018",
        "Visa",
        "4444333322221111",
        "05/24"
      ]
    },
    {
      "cells": [
        "FamilyAlbum",
        "5",
        "John",
        "2200 E devon",
        "Chicago",
        "Arizona",
        "50456",
        "MasterCard",
        "4444333322226666",
        "06/26"
      ]
    },
    {
      "cells": [
        "ScreenSaver",
        "3",
        "Jessica",
        "3445 E river",
        "Los Angeles",
        "California",
        "45679",
        "American Express",
        "4444333322228888",
        "08/22"
      ]
    }
  ]
});
formatter.scenario({
  "name": "New Order Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter product info \"MyMoney\" and \"10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_product_info_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter address info \"David\", \"2200 E devon\", \"Des Planies\", \"Illinois\", \"60018\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_address_info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter payment info \"Visa\", \"4444333322221111\", \"05/24\"",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_payment_info(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate new order details \"MyMoney\", \"10\",\"David\", \"2200 E devon\",\"Des Planies\",\"Illinois\",\"60018\",\"Visa\",\"4444333322221111\",\"05/24\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_new_order_details(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c06/1[7]/2020\u003e but was:\u003c06/1[6]/2020\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_new_order_details(NewOrderSteps.java:84)\n\tat ✽.the user validate new order details \"MyMoney\", \"10\",\"David\", \"2200 E devon\",\"Des Planies\",\"Illinois\",\"60018\",\"Visa\",\"4444333322221111\",\"05/24\"(file:///Users/nurayerdal/IdeaProjects/CucumberBatch4/src/test/resources/com.WebOrder/NewOrderOutline.feature:10)\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "New Order Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter product info \"FamilyAlbum\" and \"5\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_product_info_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter address info \"John\", \"2200 E devon\", \"Chicago\", \"Arizona\", \"50456\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_address_info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter payment info \"MasterCard\", \"4444333322226666\", \"06/26\"",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_payment_info(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate new order details \"FamilyAlbum\", \"5\",\"John\", \"2200 E devon\",\"Chicago\",\"Arizona\",\"50456\",\"MasterCard\",\"4444333322226666\",\"06/26\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_new_order_details(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Paul Brow]n\u003e but was:\u003c[Joh]n\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_new_order_details(NewOrderSteps.java:77)\n\tat ✽.the user validate new order details \"FamilyAlbum\", \"5\",\"John\", \"2200 E devon\",\"Chicago\",\"Arizona\",\"50456\",\"MasterCard\",\"4444333322226666\",\"06/26\"(file:///Users/nurayerdal/IdeaProjects/CucumberBatch4/src/test/resources/com.WebOrder/NewOrderOutline.feature:10)\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "New Order Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter product info \"ScreenSaver\" and \"3\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_product_info_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter address info \"Jessica\", \"3445 E river\", \"Los Angeles\", \"California\", \"45679\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_address_info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user enter payment info \"American Express\", \"4444333322228888\", \"08/22\"",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_enter_payment_info(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate new order details \"ScreenSaver\", \"3\",\"Jessica\", \"3445 E river\",\"Los Angeles\",\"California\",\"45679\",\"American Express\",\"4444333322228888\",\"08/22\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_new_order_details(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c06/1[7]/2020\u003e but was:\u003c06/1[6]/2020\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_new_order_details(NewOrderSteps.java:84)\n\tat ✽.the user validate new order details \"ScreenSaver\", \"3\",\"Jessica\", \"3445 E river\",\"Los Angeles\",\"California\",\"45679\",\"American Express\",\"4444333322228888\",\"08/22\"(file:///Users/nurayerdal/IdeaProjects/CucumberBatch4/src/test/resources/com.WebOrder/NewOrderOutline.feature:10)\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/com.WebOrder/ProductsDataTable.feature");
formatter.feature({
  "name": "All Products",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of All products",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters username \"Tester\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the demoUser enters password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.LoginPageSteps.the_demoUser_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the all products button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_clicks_the_all_products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user validate the product details",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.com.WebOrder.NewOrderSteps.the_user_validate_the_product_details(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});