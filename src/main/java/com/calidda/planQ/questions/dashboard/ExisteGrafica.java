package com.calidda.planQ.questions.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.calidda.planQ.userinterface.menus.MenusPOM.GRF_RESULTADOS;

public class ExisteGrafica implements Question<Boolean> {
    public static ExisteGrafica isVisible(){
        return new ExisteGrafica();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(GRF_RESULTADOS).answeredBy(actor).isCurrentlyVisible();
    }
}
