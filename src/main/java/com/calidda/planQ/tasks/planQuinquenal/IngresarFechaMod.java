package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.CLD_FECHA_MOD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class IngresarFechaMod implements Task {
    private final Map<String, String> fechaMod;

    public IngresarFechaMod(Map<String, String> fechaMod) {
        this.fechaMod = fechaMod;
    }

    public static IngresarFechaMod conLosDatos(Map<String, String> fechaMod) {
        return instrumented(IngresarFechaMod.class, fechaMod);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String fecha = fechaMod.get("fechaModificacion");

        actor.attemptsTo(
                WaitUntil.the(CLD_FECHA_MOD, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(10).seconds(),
                Enter.theValue(fecha).into(CLD_FECHA_MOD)
        );
    }
}