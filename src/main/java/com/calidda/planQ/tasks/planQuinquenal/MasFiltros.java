package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LNK_MAS_FILTROS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MasFiltros implements Task {
    public static MasFiltros click(){
        return instrumented(MasFiltros.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_MAS_FILTROS)
        );

    }
}
