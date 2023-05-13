package co.com.example.screenplay.stepdefinitions.login;

import co.com.example.screenplay.exceptions.AssertionsErrors;
import co.com.example.screenplay.interactions.NavigateTo;
import co.com.example.screenplay.models.LoginData;
import co.com.example.screenplay.questions.ValidateLoginErrorMessage;
import co.com.example.screenplay.tasks.LoginWithCredentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SwaglabsLoginStepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        theActorCalled("User").wasAbleTo(NavigateTo.swaglabPage());
    }

    @When("User attempts to login with the following credentials:")
    public void user_attempts_to_login_with_the_following_credentials(List<LoginData> loginData) {
        theActorInTheSpotlight().attemptsTo(LoginWithCredentials.userCredentials(loginData));

    }

    @Then("he should be presented with the error message")
    public void he_should_be_presented_with_the_error_message(List<String> message) {
        theActorInTheSpotlight().should(seeThat(ValidateLoginErrorMessage.withMessage(),
                equalTo(message.get(1))).orComplainWith(AssertionsErrors.class, "Purchase not completed"));

    }

}
