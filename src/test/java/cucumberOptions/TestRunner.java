package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/java/featureFiles",
		glue = "stepDefination", 
		plugin = {"pretty","html:target/CucumberReports/CucumberReport.html" }, 
		monochrome = true
		//dryRun = true
		//tags = "@RightLogin or @WrongLogin"

)
public class TestRunner {

}
