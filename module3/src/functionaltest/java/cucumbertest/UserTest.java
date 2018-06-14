package cucumbertest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/functionaltest/resources/features",
        glue = "junitcucumber"
)
public class UserTest {
}