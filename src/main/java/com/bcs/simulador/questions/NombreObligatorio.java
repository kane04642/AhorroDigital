package com.bcs.simulador.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.bcs.simulador.userinterface.Login.LBL_NOMBRE_OBLI;

public class NombreObligatorio implements Question<Boolean> {
    public static NombreObligatorio isVisible(){
        return new NombreObligatorio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(LBL_NOMBRE_OBLI).answeredBy(actor).isCurrentlyVisible();
    }
}
