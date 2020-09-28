package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookHomePage {
    public static final String PETBOOK_HOME_PAGE = "http://localhost:4200/";

    public static final Target ALL_BUTTON = Target.the("Botón con el filtro ALL").located(By.xpath("//*[@id=\"filterButtons\"]/div[2]/button"));
    public static final Target PERRO_BUTTON = Target.the("Botón con el filtro Perro").located(By.xpath("//*[@id=\"filterButtons\"]/div[3]/button"));
    public static final Target GATO_BUTTON = Target.the("Botón con el filtro Gato").located(By.xpath("//*[@id=\"filterButtons\"]/div[4]/button"));

    public static final Target FIRST_IMAGE = Target.the("Primera imagen").located(By.xpath("//*[@id=\"root-component\"]/app-imagegallery/div/div[3]/ul/li[1]/a/img"));
    public static final Target SECOND_IMAGE= Target.the("Segunda imagen").located(By.xpath("//*[@id=\"root-component\"]/app-imagegallery/div/div[3]/ul/li[2]/a/img"));
    public static final Target THIRD_IMAGE = Target.the("Tercera Imagen").located(By.xpath("//*[@id=\"root-component\"]/app-imagegallery/div/div[3]/ul/li[3]/a/img"));

}
