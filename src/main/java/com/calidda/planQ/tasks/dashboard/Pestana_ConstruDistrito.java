package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.menus.MenusPOM.LNK_CONSTRU_DISTRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pestana_ConstruDistrito implements Task {
    public static Pestana_ConstruDistrito daClick(){
        return instrumented(Pestana_ConstruDistrito.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_CONSTRU_DISTRITO)
        );

    }
}
