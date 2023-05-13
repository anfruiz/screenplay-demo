package co.com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.example.screenplay.userinterfaces.BuyItemsPage.LBL_PURCHASE_FINALIZED;
import static co.com.example.screenplay.userinterfaces.LoginPage.TXT_ERRORMESSAGE;

public class ValidatePurchaseFinalized implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_PURCHASE_FINALIZED).answeredBy(actor);
    }

    public static Question<String> withMessage() {
        return new ValidatePurchaseFinalized();
    }
}
