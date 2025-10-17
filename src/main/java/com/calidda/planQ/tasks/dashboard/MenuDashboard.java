package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.menus.MenusPOM.LNK_DASHBOARD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MenuDashboard implements Task {
    public static MenuDashboard click(){
        return instrumented(MenuDashboard.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_DASHBOARD)
        );
    }
}
