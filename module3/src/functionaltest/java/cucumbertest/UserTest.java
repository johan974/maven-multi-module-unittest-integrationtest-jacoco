package cucumbertest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "src/test/resources/features/user.feature",
        features = "src/functionaltest/resources/features",
        glue = "cucumbertest"
)
public class UserTest {
}