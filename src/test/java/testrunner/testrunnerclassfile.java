package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./FeaturesResources",
		glue="StepDefinitions",
		dryRun=true,
		tags={"@sanity"},
		plugin= {"pretty","html:test-output"}
		)
public class testrunnerclassfile {

}
