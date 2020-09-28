package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookPetPage {
    public static final Target BIG_IMAGE = Target.the("Imagen ampliada").located(By.xpath("//*[@id=\"root-component\"]/ng-component/div/div/div"));
    public static final Target IMAGE = Target.the("Imagen ampliada").located(By.id("img-cont"));
}
