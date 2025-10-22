package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.menus.MenusPOM.LNK_PERMI_DISTRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pestana_PermiDistrito implements Task {
    public static Pestana_PermiDistrito click(){
        return instrumented(Pestana_PermiDistrito.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_PERMI_DISTRITO)
        );

    }
}
