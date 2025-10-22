package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.menus.MenusPOM.LNK_CONSTRU_PERIODO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pestana_ConstruPeriodo implements Task {
    public static Pestana_ConstruPeriodo click(){
        return instrumented(Pestana_ConstruPeriodo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_CONSTRU_PERIODO)
        );

    }
}
