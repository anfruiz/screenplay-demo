package co.com.example.screenplay.tasks;

import co.com.example.screenplay.models.LoginData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.InstrumentedTask;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static co.com.example.screenplay.userinterfaces.LoginPage.*;

public class LoginWithCredentials implements Task {

    List<LoginData> loginDataList;

    protected LoginWithCredentials(List<LoginData> loginDataList){
        this.loginDataList = loginDataList;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(loginDataList.get(0).getUsername()).into(TXT_USERNAME),
                Enter.theValue(loginDataList.get(0).getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Performable userCredentials(List<LoginData> loginDataList){
        return Instrumented.instanceOf(LoginWithCredentials.class).withProperties(loginDataList);
    }
}
