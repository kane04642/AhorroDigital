package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LNK_PES_QUINQUENAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PestanaQuinquenal implements Task {
    public static PestanaQuinquenal click(){
        return instrumented(PestanaQuinquenal.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_PES_QUINQUENAL)
        );

    }
}
