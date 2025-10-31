package com.calidda.planQ.tasks.gestionReemplazo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidda.planQ.userinterface.gestionReemplazo.GestionReemplazoPOM.LNK_MAS_FILTROS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LinkMasFiltros implements Task {
    public static LinkMasFiltros click(){
        return instrumented(LinkMasFiltros.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_MAS_FILTROS)
        );
    }
}
