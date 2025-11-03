package com.calidda.planQ.tasks.gestionReemplazo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.gestionReemplazo.GestionReemplazoPOM.LNK_BOLSA_REEM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PestanaBolsaReem implements Task {
    public static PestanaBolsaReem click(){
        return instrumented(PestanaBolsaReem.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_BOLSA_REEM)
        );

    }
}
