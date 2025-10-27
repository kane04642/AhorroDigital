package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.BTN_NUEVO_PLANQUIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonNuevoPlanQ implements Task {
    public static BotonNuevoPlanQ crear(){
        return instrumented(BotonNuevoPlanQ.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NUEVO_PLANQUIN)
        );

    }
}
