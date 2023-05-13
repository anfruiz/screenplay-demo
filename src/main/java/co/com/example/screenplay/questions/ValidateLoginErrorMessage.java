package co.com.example.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.example.screenplay.userinterfaces.LoginPage.TXT_ERRORMESSAGE;

public class ValidateLoginErrorMessage implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_ERRORMESSAGE).answeredBy(actor);
    }

    public static Question<String> withMessage() {
        return new ValidateLoginErrorMessage();
    }
}
