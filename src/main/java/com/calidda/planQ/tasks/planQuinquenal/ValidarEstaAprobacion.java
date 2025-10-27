package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LST_ESTA_APROBA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarEstaAprobacion implements Task {
    private final Map<String, String> aprobacion;

    public ValidarEstaAprobacion(Map<String, String> aprobacion) {
        this.aprobacion = aprobacion;
    }
    public static ValidarEstaAprobacion estado(Map<String, String> aprobacion){
        return instrumented(ValidarEstaAprobacion.class, aprobacion);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(aprobacion.get("estadoAprobacion")).from(LST_ESTA_APROBA)
        );
    }
}
