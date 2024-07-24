package test.java.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@RunWith(Cucumber.class)
@CucumberOptions(features = "test/java/features", glue = { "stepDefinitions" },
       dryRun = true, monochrome = true)

public class TestRun {

}

