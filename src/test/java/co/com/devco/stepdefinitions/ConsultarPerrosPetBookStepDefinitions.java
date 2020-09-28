package co.com.devco.stepdefinitions;

import co.com.devco.questions.LasImagenes;
import co.com.devco.tasks.Seleccionar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarPerrosPetBookStepDefinitions {
    @Cuando("^quiera ver todos los perros$")
    public void quieraVerTodosLosPerros() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.ver("perro"));
    }


    @Entonces("^debe encontrar solo imagenes de perros$")
    public void debeEncontrarSoloImagenesDePerros() {
        theActorInTheSpotlight().should(seeThat(
                LasImagenes.de("perro")
        ));
    }
}
