package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/api/CreatePet.feature"},
        glue = "StepDefinitions",
        tags = "@api",
        dryRun = false
)

public class APIRunner {
}
