package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static com.calidda.planQ.userinterface.menus.MenusPOM.BTN_APLICAR_CP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosAnualPD implements Task {
    private final Map<String, String> datosAnualPD;

    public DatosAnualPD(Map<String, String> datosAnualPD) {
        this.datosAnualPD = datosAnualPD;
    }

    public static DatosAnualPD ingresar(Map<String, String> datosAnualPD){
        return instrumented(DatosAnualPD.class,datosAnualPD );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosAnualPD.get("plan")).from(LIS_PLAN_APD),
                SelectFromOptions.byVisibleText(datosAnualPD.get("pa")).from(LIS_PA_PD),
                SelectFromOptions.byVisibleText(datosAnualPD.get("material")).from(LIS_MATERIAL_APD),
                Click.on(BTN_APLICAR_CP)
        );

    }
}
