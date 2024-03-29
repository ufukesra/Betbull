package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-cucumber-reports"},
        features = {"src/test/resources/features"},
        glue = {"step_definitions"},
        //tags = {"@api,@mobile,@web"},
        dryRun = false
)
public class CukesRunner {


}
