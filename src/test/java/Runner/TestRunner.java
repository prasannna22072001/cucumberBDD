package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", glue= {"Prasanna.CucumberCourse"},
monochrome=true, plugin={"html:target/cucmber.html", "json:target/JSONReports/report.json"}

		)
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
}
