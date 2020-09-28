package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.devco.userinterfaces.PetBookHomePage.*;

public class LasImagenes implements Question<Boolean> {
    private String resultado;

    public LasImagenes(String resultado){
        this.resultado = resultado;
    }

    public static LasImagenes de(String resultado){
        return new LasImagenes(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(resultado == "perro"){
            String resultadoEncontrado = Attribute.of(FIRST_IMAGE).named("src").viewedBy(actor).asString();
            return resultadoEncontrado.contains(resultado);
        }else if(resultado == "gato"){
            String resultadoEncontrado = Attribute.of(FIRST_IMAGE).named("src").viewedBy(actor).asString();
            return resultadoEncontrado.contains(resultado);
        }else{
            String resultadoEncontrado1 = Attribute.of(FIRST_IMAGE).named("src").viewedBy(actor).asString();
            String resultadoEncontrado2 = Attribute.of(THIRD_IMAGE).named("src").viewedBy(actor).asString();
            return resultadoEncontrado1.contains("perro") && resultadoEncontrado2.contains("gato");
        }
    }
}
