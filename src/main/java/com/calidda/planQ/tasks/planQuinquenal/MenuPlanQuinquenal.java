package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LNK_DASHBOARD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MenuPlanQuinquenal implements Task {
    public static MenuPlanQuinquenal click(){
        return instrumented(MenuPlanQuinquenal.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_DASHBOARD)
        );

    }
}
