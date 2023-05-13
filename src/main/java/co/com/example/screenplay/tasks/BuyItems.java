package co.com.example.screenplay.tasks;

import io.cucumber.java.en.But;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;


public class BuyItems implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Button.withNameOrId("add-to-cart-sauce-labs-backpack")),
                Click.on(Button.withCSSClass("shopping_cart_link")),
                Click.on(Button.withNameOrId("checkout")),
                Enter.theValue("sangir").into(InputField.withPlaceholder("First Name")),
                Enter.theValue("prueba").into(InputField.withPlaceholder("Last Name")),
                Enter.theValue("05007").into(InputField.withPlaceholder("Zip/Postal Code")),
                Click.on(Button.withNameOrId("continue")),
                Click.on(Button.withNameOrId("finish")));


    }

    public static Performable selectItem() {
        return Tasks.instrumented(BuyItems.class);
    }
}
