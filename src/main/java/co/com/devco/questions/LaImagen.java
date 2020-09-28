package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.devco.userinterfaces.PetBookPetPage.*;

public class LaImagen implements Question<Boolean> {
    private String resultado;

    public LaImagen(String resultado){
        this.resultado = resultado;
    }

    public static LaImagen de(String resultado){
        return new LaImagen(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(BIG_IMAGE).named("style").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
    }
}
