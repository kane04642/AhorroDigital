package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.BTN_LIMPIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonLimpiar implements Task {
    public static BotonLimpiar click(){
        return instrumented(BotonLimpiar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LIMPIAR)
        );
    }
}
