package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "json:target/"},
		features = {"src/test/java/"}
		)
public class CucumberRunner {

}
