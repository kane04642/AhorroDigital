package com.calidda.planQ.tasks.gestionReemplazo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.gestionReemplazo.GestionReemplazoPOM.LNK_PES_IMPEDIMENTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PestanaImpedimentos implements Task {
    public static PestanaImpedimentos click(){
        return instrumented(PestanaImpedimentos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        Click.on(LNK_PES_IMPEDIMENTOS)

        );

    }
}
