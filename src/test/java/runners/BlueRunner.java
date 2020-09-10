package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features/skyblue.feature", tags = {"@blue"},glue = {
		"steps" }, dryRun = false, monochrome = true, plugin = { "pretty", "html:test-output" })


public class BlueRunner {

}

//tags = {"@smoke, @sprint"} this is OR
//tags = {"@smoke" , "@sprint"} this is AND