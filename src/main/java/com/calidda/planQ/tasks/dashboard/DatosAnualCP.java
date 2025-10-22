package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static com.calidda.planQ.userinterface.menus.MenusPOM.BTN_APLICAR_HAP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosAnualCP implements Task {
    private final Map<String, String> datosAnualCP;

    public DatosAnualCP(Map<String, String> datosAnualCP) {
        this.datosAnualCP = datosAnualCP;
    }

    public static DatosAnualCP ingresar(Map<String, String> datosAnualCP){
        return instrumented(DatosAnualCP.class, datosAnualCP);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosAnualCP.get("plan")).from(LIS_PLAN_CP),
                SelectFromOptions.byVisibleText(datosAnualCP.get("pa")).from(LIS_PA_CP),
                SelectFromOptions.byVisibleText(datosAnualCP.get("material")).from(LIS_MATERIAL_CP),
                Click.on(BTN_APLICAR_CP)
        );
    }
}
