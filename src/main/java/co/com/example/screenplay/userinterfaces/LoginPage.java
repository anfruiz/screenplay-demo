package co.com.example.screenplay.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("UsernameText Box ").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("PasswordText Box ").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(By.id("login-button"));
    public static final Target TXT_ERRORMESSAGE = Target.the("Login Error Message").located(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]"));
}
