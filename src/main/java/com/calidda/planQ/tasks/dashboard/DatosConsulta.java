package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class DatosConsulta implements Task {

    private final Map<String, String> datosDashboard;

    public DatosConsulta(Map<String, String> datosDashboard) {
        this.datosDashboard = datosDashboard;
    }

    public static DatosConsulta dashboard(Map<String, String> datosDashboard){
        return instrumented(DatosConsulta.class, datosDashboard);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIS_PLAN),
                Click.on(SLC_PLAN.of(datosDashboard.get("plan"))),
                Click.on(LIS_PERIODO_PQ),
                Click.on(SLC_PERIODO_PQ.of(datosDashboard.get("periodoPQ"))),
                Enter.theValue(datosDashboard.get("anPQ")).into(TXT_AN_PQ),
                Click.on(LIS_MATERIAL),
                Click.on(SLC_MATERIAL.of(datosDashboard.get("material"))),
                Click.on(BTN_APLICAR)
        );

    }
}
