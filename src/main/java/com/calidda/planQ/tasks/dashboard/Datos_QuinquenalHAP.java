package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Datos_QuinquenalHAP implements Task {

    private final Map<String, String> datosQuinqueHAP;

    public Datos_QuinquenalHAP(Map<String, String> datosQuinqueHAP) {
        this.datosQuinqueHAP = datosQuinqueHAP;
    }

    public static Datos_QuinquenalHAP datos(Map<String, String> datosQuinqueHAP){
        return instrumented(Datos_QuinquenalHAP.class, datosQuinqueHAP);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosQuinqueHAP.get("plan")).from(LIS_PLAN_HAP),
                SelectFromOptions.byVisibleText(datosQuinqueHAP.get("periodoPQ")).from(LIS_PERIODO_HAP),
                Enter.theValue(datosQuinqueHAP.get("anPQ")).into(TXT_APQ_HAP),
                SelectFromOptions.byVisibleText(datosQuinqueHAP.get("material")).from(LIS_MATERIAL_HAP),
                SelectFromOptions.byVisibleText(datosQuinqueHAP.get("categoria")).from(LIS_CATEGORIA_HAP),
                Click.on(BTN_APLICAR_HAP)
        );

    }
}
