package stepDefintions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/test/resources/Network.feature",
        plugin = {
                "pretty",                             // For readable output in the console
                "html:target/cucumber-report/cucumber-html-report.html",   // HTML report
                "json:target/cucumber-report/cucumber-report.json"    // JSON report needed for detailed reporting
        },
        //path of step definition file
        glue = "stepDefintions"
)
public class TestRunner {
}
