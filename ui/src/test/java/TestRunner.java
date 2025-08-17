import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "ui/src/test/resources",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-report.html"}
)

public class TestRunner {
}