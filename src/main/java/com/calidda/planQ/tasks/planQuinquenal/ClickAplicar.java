package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.BTN_APLICAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickAplicar implements Task {
    public static ClickAplicar consultar(){
        return instrumented(ClickAplicar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_APLICAR)
        );
    }
}
