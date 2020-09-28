package co.com.devco.stepdefinitions;

import co.com.devco.questions.LaImagen;
import co.com.devco.tasks.Abrir;
import co.com.devco.tasks.Seleccionar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class verPerroPetBookStepDefinitions {

    @Cuando("^quiera ver un perro$")
    public void quieraVerUnPerro() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.ver("perro"));
        theActorInTheSpotlight().attemptsTo(Abrir.imagen());
    }

    @Entonces("^se debe abrir la imagen del perro$")
    public void seDebeAbrirLaImagenDelPerro() {
        theActorInTheSpotlight().should(seeThat(
                LaImagen.de("perro")
        ));
    }
}
