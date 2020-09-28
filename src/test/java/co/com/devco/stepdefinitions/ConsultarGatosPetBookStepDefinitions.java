package co.com.devco.stepdefinitions;

import co.com.devco.questions.LasImagenes;
import co.com.devco.tasks.Seleccionar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarGatosPetBookStepDefinitions {

    @Cuando("^quiera ver todos los gatos$")
    public void quieraVerTodosLosGatos() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.ver("gato"));
    }


    @Entonces("^debe encontrar solo imagenes de gatos$")
    public void debeEncontrarSoloImagenesDeGatos() {
        theActorInTheSpotlight().should(seeThat(
                LasImagenes.de("gato")
        ));
    }
}
