package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PlanAnualCD implements Task {
    private final Map<String, String> planAnualCD;

    public PlanAnualCD (Map<String, String> planAnualCD) {
        this.planAnualCD = planAnualCD;
    }
    public static PlanAnualCD datos(Map<String, String> planAnualCD){
        return instrumented(PlanAnualCD.class, planAnualCD);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(planAnualCD.get("plan")).from(LIS_PLAN_CD),
                Click.on(LIS_PA),
                Click.on(SLC_PA.of(planAnualCD.get("PA"))),
                SelectFromOptions.byVisibleText(planAnualCD.get("material")).from(LIS_MATE_CD),
                //Click.on(LIS_MATERIAL_ANUAL),
                //Click.on(SLC_MATERIAL_ANUAL.of(planAnualCD.get("material"))),
                Click.on(BTN_APLICAR_CD)
        );

    }
}
