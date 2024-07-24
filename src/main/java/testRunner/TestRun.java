package main.java.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./features",
        glue = "main.java.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}, dryRun = true
)

public class TestRun {
}
