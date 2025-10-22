package com.calidda.planQ.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.Map;
import static com.calidda.planQ.userinterface.menus.MenusPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosQuinqueCP implements Task {
    private final Map<String, String> datosQuinqueCP;

    public DatosQuinqueCP(Map<String, String> datosQuinqueCP) {
        this.datosQuinqueCP = datosQuinqueCP;
    }

    public static DatosQuinqueCP ingresar(Map<String, String> datosQuinqueCP){
        return instrumented(DatosQuinqueCP.class, datosQuinqueCP);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosQuinqueCP.get("plan")).from(LIS_PLAN_CP),
                SelectFromOptions.byVisibleText(datosQuinqueCP.get("periodoPQ")).from(LIS_PERIODO_CP),
                Enter.theValue(datosQuinqueCP.get("AnPQ")).into(TXT_APQ_CP),
                SelectFromOptions.byVisibleText(datosQuinqueCP.get("material")).from(LIS_MATERIAL_PCP),
                Click.on(BTN_APLICAR_CP)
        );

    }
}
