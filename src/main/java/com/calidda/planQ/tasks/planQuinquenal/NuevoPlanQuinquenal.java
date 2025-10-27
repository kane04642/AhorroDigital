package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NuevoPlanQuinquenal implements Task {
    private final Map<String, String> datosNuevoPlanQ;

    public NuevoPlanQuinquenal(Map<String, String> datosNuevoPlanQ) {
        this.datosNuevoPlanQ = datosNuevoPlanQ;
    }
    public static NuevoPlanQuinquenal crear(Map<String, String> datosNuevoPlanQ){
        return instrumented(NuevoPlanQuinquenal.class, datosNuevoPlanQ);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosNuevoPlanQ.get("periodoPQ")).into(TXT_PERIDO_NUEV),
                SelectFromOptions.byVisibleText(datosNuevoPlanQ.get("estadoAproba")).from(LST_ESTADO_APRO),
                Enter.theValue(datosNuevoPlanQ.get("aprobaciones")).into(CLD_APROBACIONES),
                Enter.theValue(datosNuevoPlanQ.get("descripcion")).into(TXT_DESCIPCION_NUE),
                Click.on(BTN_GUARDAR)
        );

    }
}
