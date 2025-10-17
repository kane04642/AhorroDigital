package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.menus.MenusPOM.LNK_HABI_DISTRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pestana_HabiDistrito implements Task {
    public static Pestana_HabiDistrito click(){
        return instrumented(Pestana_HabiDistrito.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_HABI_DISTRITO)
        );

    }
}
