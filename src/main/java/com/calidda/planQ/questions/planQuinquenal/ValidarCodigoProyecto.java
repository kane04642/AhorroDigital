package com.calidda.planQ.questions.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LBLCODIGO_OBLIGA;


public class ValidarCodigoProyecto implements Question<Boolean> {

    public static ValidarCodigoProyecto  esVisible(){
        return new ValidarCodigoProyecto();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(LBLCODIGO_OBLIGA).answeredBy(actor).isCurrentlyVisible();
    }
}
