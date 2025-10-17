package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PlanAnualHD implements Task {
    private final Map<String, String> datosPlanAnual;

    public PlanAnualHD(Map<String, String> datosPlanAnual) {
        this.datosPlanAnual = datosPlanAnual;
    }
    public static PlanAnualHD datos(Map<String, String> datosPlanAnual){
        return instrumented(PlanAnualHD.class, datosPlanAnual);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIS_PLAN),
                Click.on(SLC_PLAN.of(datosPlanAnual.get("plan"))),
                Click.on(LIS_PA),
                Click.on(SLC_PA.of(datosPlanAnual.get("PA"))),
                Click.on(LIS_MATERIAL_ANUAL),
                Click.on(SLC_MATERIAL_ANUAL.of(datosPlanAnual.get("material"))),
                Click.on(BTN_APLICAR)
        );

    }
}
