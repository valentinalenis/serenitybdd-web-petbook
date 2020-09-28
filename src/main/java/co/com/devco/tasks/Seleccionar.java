package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.devco.userinterfaces.PetBookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Seleccionar implements Task {

    private String filtro;

    public Seleccionar(String filtro) {
        this.filtro = filtro;
    }

    public static Performable ver(String filtro) {
        return instrumented(Seleccionar.class, filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(filtro == "perro") {
            actor.attemptsTo(
                    Click.on(PERRO_BUTTON)
            );
        }else if(filtro == "gato"){
            actor.attemptsTo(
                    Click.on(GATO_BUTTON)
            );
        }else{
            actor.attemptsTo(
                    Click.on(ALL_BUTTON)
            );
        }

    }
}
