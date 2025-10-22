package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.Map;
import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosQuinquePD implements Task {
    private final Map<String, String> datosQuinquePD;

    public DatosQuinquePD(Map<String, String> datosQuinquePD) {
        this.datosQuinquePD = datosQuinquePD;
    }

    public static DatosQuinquePD ingresar(Map<String, String> datosQuinquePD){
        return instrumented(DatosQuinquePD.class, datosQuinquePD);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosQuinquePD.get("plan")).from(LIS_PLAN_PD),
                SelectFromOptions.byVisibleText(datosQuinquePD.get("periodoPQ")).from(LIS_PERIODO_PD),
                Enter.theValue(datosQuinquePD.get("AnPQ")).into(TXT_APQ_PD),
                SelectFromOptions.byVisibleText(datosQuinquePD.get("material")).from(LIS_MATERIAL_PD),
                Click.on(BTN_APLICAR_PD)
        );
    }
}
