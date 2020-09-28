package co.com.devco.stepdefinitions;

import co.com.devco.questions.LaImagen;
import co.com.devco.tasks.Abrir;
import co.com.devco.tasks.Seleccionar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class veGatoPetBookStepDefinitions {
    @Cuando("^quiera ver un gato$")
    public void quieraVerUnGato() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.ver("gato"));
        theActorInTheSpotlight().attemptsTo(Abrir.imagen());
    }


    @Entonces("^se debe abrir la imagen del gato$")
    public void seDebeAbrirLaImagenDelGato() {
        theActorInTheSpotlight().should(seeThat(
                LaImagen.de("gato")
        ));
    }
}
