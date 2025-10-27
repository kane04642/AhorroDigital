package com.calidda.planQ.questions.planQuinquenal;

import com.calidda.planQ.questions.dashboard.ExisteGrafica;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.DTB_RESULTADOS;


public class ExisteTabla implements Question<Boolean> {
    public static ExisteTabla isVisible(){
        return new ExisteTabla();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(DTB_RESULTADOS).answeredBy(actor).isCurrentlyVisible();
    }
}
