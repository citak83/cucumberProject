package StepDefinitions;

import Utils.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    // We have before and after annotations.
    // Those are coming from the Cucumber.
    // They will run before and after each scenario.
    // We have one Scenario interface to get the details from the every scenario.

    @Before
    public void setUp(Scenario scenario){
        System.out.println("This one will run before each scenario");
        System.out.println(scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("This one will run after each scenario");
        // after annottion will execute after each scenario even though they are failed, undefined, or skipped.
        if (scenario.isFailed()){
            System.out.println("failed");
            BrowserUtils.takeScreenShot();
        }

    }

    // I m using run this Before annotation if the scebnario has @tt tag
    @Before("@tt")
    public void conditionalAnnotation(){
        // I want to run this annotation only before @conditional tag
        System.out.println("Conditional annotation");
    }



}
