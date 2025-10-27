package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LNK_PES_PANUAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pestana_PAnual implements Task {
    public static Pestana_PAnual click(){
        return instrumented(Pestana_PAnual.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_PES_PANUAL)
        );

    }
}
