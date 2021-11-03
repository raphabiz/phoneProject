package test.java.StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"test.java.StepDefinitions"}
,monochrome=true,plugin = {"pretty","html:target/HtmlReports"},dryRun = false)

public class TestRunner {

}
