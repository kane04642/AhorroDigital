package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.menus.MenusPOM.LNK_HABILI_PERIODO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pestana_HabiliPeriodo implements Task {
    public static Pestana_HabiliPeriodo clikc(){
        return instrumented(Pestana_HabiliPeriodo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_HABILI_PERIODO)
        );

    }
}
