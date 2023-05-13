package co.com.example.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyItemsPage {

    public static final Target LBL_PURCHASE_FINALIZED = Target.the("LBL PURCHASE FINALIZED").located(By.xpath("//h2[@class = 'complete-header']"));
}
