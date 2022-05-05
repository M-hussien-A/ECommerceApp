package CucumberReport;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "StepDefinitions",
        tags ="@Smoke",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "json:target/cucumber.runtime.formatter.JSONFormatter",
                "rerun:target/rerun.txt"},
        dryRun = false)






public class TestRunner {

}
