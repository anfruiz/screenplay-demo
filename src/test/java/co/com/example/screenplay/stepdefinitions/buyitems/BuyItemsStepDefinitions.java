package co.com.example.screenplay.stepdefinitions.buyitems;

import co.com.example.screenplay.questions.ValidatePurchaseFinalized;
import co.com.example.screenplay.tasks.BuyItems;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class BuyItemsStepDefinitions {

    @When("User selected some item")
    public void user_selected_some_item() {
        theActorInTheSpotlight().attemptsTo(BuyItems.selectItem());
    }

    @Then("he can see finalized his purchase")
    public void he_can_see_finalized_his_purchase(String message){
        theActorInTheSpotlight().should(seeThat(ValidatePurchaseFinalized.withMessage(), equalTo(message)));
    }
}
