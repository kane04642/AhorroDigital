package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.TXT_DESCIPCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Descripcion implements Task {
    private final Map<String, String> descripPQ;

    public Descripcion(Map<String, String> descripPQ) {
        this.descripPQ = descripPQ;
    }
    public static Descripcion ingresar(Map<String, String> descripPQ){
        return instrumented(Descripcion.class, descripPQ);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripPQ.get("descripcion")).into(TXT_DESCIPCION)
        );

    }
}
