package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static com.calidda.planQ.userinterface.menus.MenusPOM.BTN_APLICAR_HAP;
import static com.calidda.planQ.userinterface.menus.MenusPOM.LIS_CATEGORIA_HAP;
import static com.calidda.planQ.userinterface.menus.MenusPOM.LIS_MATERIAL_HAP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Datos_AnualHAP implements Task {
    private final Map<String, String> datosAnualHAP;

    public Datos_AnualHAP(Map<String, String> datosAnualHAP) {
        this.datosAnualHAP = datosAnualHAP;
    }
    public static Datos_AnualHAP diligenciar(Map<String, String> datosAnualHAP){
        return instrumented(Datos_AnualHAP.class, datosAnualHAP);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosAnualHAP.get("plan")).from(LIS_PLAN_HAP),
                SelectFromOptions.byVisibleText(datosAnualHAP.get("pa")).from(LIS_PA_HAP),
                SelectFromOptions.byVisibleText(datosAnualHAP.get("material")).from(LIS_MATERIAL_HAP),
                SelectFromOptions.byVisibleText(datosAnualHAP.get("categoria")).from(LIS_CATEGORIA_HAP),
                Click.on(BTN_APLICAR_HAP)
        );
    }
}
