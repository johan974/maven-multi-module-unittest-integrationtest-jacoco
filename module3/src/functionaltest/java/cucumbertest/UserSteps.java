package cucumbertest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import users.User;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class UserSteps {
    Logger logger = LoggerFactory.getLogger(UserSteps.class);

    private User user = new User();

    @Given("^that the user (.*) is given a task to clear (.*) certification exam$")
    public void certificationName(String name, String certication) throws Throwable {
        logger.info( "Given: that: " + name);
        user.setName(name);
        user.setCertification(certication);
    }

    @When("^(.*) got (\\d+) marks in exam$")
    public void gotMarks(String name, int marks) throws Throwable {
        logger.info( "When: got: " + name);
        user.setName(name);
        user.setMarks(marks);
    }

    @Then("^(.*) is known as (.*) certified$")
    public void certifiedYes(String name, String certification) throws Throwable {
        logger.info( "Then: is: " + name);
        assertThat(name, is(user.getName()));
        assertThat(user.getCertification(), equalTo("Java"));
        assertThat(user.getResult(), is(true));
    }
}