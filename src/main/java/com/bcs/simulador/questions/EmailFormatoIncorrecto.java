package com.bcs.simulador.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.bcs.simulador.userinterface.Login.LBL_EMAIL_ERROR;

public class EmailFormatoIncorrecto implements Question<Boolean> {
    public static EmailFormatoIncorrecto isVisible(){
        return new EmailFormatoIncorrecto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(LBL_EMAIL_ERROR).answeredBy(actor).isCurrentlyVisible();
    }
}
