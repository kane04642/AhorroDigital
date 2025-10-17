package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Datos_DashCD implements Task {

    private final Map<String, String> datosDashCD;

    public Datos_DashCD(Map<String, String> datosDashCD) {
        this.datosDashCD = datosDashCD;
    }


    public static Datos_DashCD dashboard(Map<String, String> datosDashCD){
        return instrumented(Datos_DashCD.class, datosDashCD);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIS_PLAN_CD),
                SelectFromOptions.byVisibleText(datosDashCD.get("plan")).from(LIS_PLAN_CD),
                Click.on(LIS_PERIODO_PQ),
                Click.on(SLC_PERIODO_PQ.of(datosDashCD.get("periodoPQ"))),
                Enter.theValue(datosDashCD.get("anPQ")).into(TXT_AN_PQ),
                SelectFromOptions.byVisibleText(datosDashCD.get("material")).from(LIS_MATERIAL_CD),
                Click.on(BTN_APLICAR_CD)
        );

    }
}
