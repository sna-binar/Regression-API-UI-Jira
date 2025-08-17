import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "stepDefinitions",
    plugin = {"pretty", "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-report.html"}
)

public class TestRunner {
}