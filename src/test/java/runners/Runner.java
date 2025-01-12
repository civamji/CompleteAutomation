package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "",
        features = {"src/test/java/resources"},
        glue = {"e2eStepdef"},
        plugin = {"pretty", "html:target/cucumber.html"},
        dryRun = false)

public class Runner extends AbstractTestNGCucumberTests {

}