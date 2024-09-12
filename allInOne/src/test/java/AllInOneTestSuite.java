import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "/stepDefinition"
         },
        monochrome = true)
public class AllInOneTestSuite extends AbstractTestNGCucumberTests {
}
