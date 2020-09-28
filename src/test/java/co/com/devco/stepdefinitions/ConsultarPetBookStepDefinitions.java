package co.com.devco.stepdefinitions;

import co.com.devco.questions.LasImagenes;
import co.com.devco.tasks.AbrirPetBook;
import co.com.devco.tasks.Seleccionar;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarPetBookStepDefinitions {

    @Dado("^que (.*) ingresa al petBook$")
    public void queIngresaAlPetBook(String actor) {
        theActorCalled(actor).attemptsTo(AbrirPetBook.paginaPrincipal());
    }

    @Cuando("^quiera ver todos los animales$")
    public void quieraVerTodosLosAnimales() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.ver("All"));
    }

    @Entonces("^debe encontrar tanto gatos como perros$")
    public void debeEncontrarTantoGatosComoPerros() {
        theActorInTheSpotlight().should(seeThat(
            LasImagenes.de("perrosygatos")
        ));
    }
}
