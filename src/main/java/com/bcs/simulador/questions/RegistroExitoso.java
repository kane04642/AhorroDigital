package com.bcs.simulador.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.bcs.simulador.userinterface.Login.LBL_EXITOSO;

public class RegistroExitoso implements Question<Boolean> {
    public static RegistroExitoso isVisible(){
        return new RegistroExitoso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(LBL_EXITOSO).answeredBy(actor).isCurrentlyVisible();
    }
}
