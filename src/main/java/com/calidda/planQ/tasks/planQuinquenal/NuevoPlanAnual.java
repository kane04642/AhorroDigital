package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NuevoPlanAnual implements Task {
    private final Map<String, String> datosNuevoPlanA;

    public NuevoPlanAnual(Map<String, String> datosNuevoPlanA) {
        this.datosNuevoPlanA = datosNuevoPlanA;
    }


    public static NuevoPlanAnual crear(Map<String, String> datosNuevoPlanA){
        return instrumented(NuevoPlanAnual.class, datosNuevoPlanA);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosNuevoPlanA.get("anPA")).into(TXT_AN_PA),
                SelectFromOptions.byVisibleText(datosNuevoPlanA.get("estadoAproba")).from(LST_ESTADO_APRO),
                Enter.theValue(datosNuevoPlanA.get("aprobaciones")).into(CLD_APROBACIONES),
                Enter.theValue(datosNuevoPlanA.get("descripcion")).into(TXT_DESCIPCION_NUE),
                Click.on(BTN_GUARDAR)
        );

    }
}
