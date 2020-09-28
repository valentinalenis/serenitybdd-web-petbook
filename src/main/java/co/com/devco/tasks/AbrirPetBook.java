package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetBookHomePage.PETBOOK_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPetBook implements Task {

    public AbrirPetBook() {

    }

    public static Performable paginaPrincipal() {
        return instrumented(AbrirPetBook.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE)
        );
    }
}
