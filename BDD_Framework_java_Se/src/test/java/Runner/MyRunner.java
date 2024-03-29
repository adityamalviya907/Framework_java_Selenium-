package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"StepDefinations","Hooks"},
monochrome =true,
plugin={"pretty",
	    "html:target/CucumberReports/CucumberReports.html"}
,tags="@flipkart"
)
public class
MyRunner {

}
