package com.calidda.planQ.questions.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.MSG_ESTADO_APRO;

public class EstadoAprobacion implements Question<String> {
    public static Question<String> obligatorio(){
        return new EstadoAprobacion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(MSG_ESTADO_APRO).getText();
    }
}
