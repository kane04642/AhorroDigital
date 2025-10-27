package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.TXT_PERIODO_PQ;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarPeriodoPQ implements Task {
    private final Map<String, String> periodoPQ;

    public IngresarPeriodoPQ(Map<String, String> periodoPQ) {
        this.periodoPQ = periodoPQ;
    }

    public static IngresarPeriodoPQ digitar(Map<String, String> periodoPQ){
        return instrumented(IngresarPeriodoPQ.class, periodoPQ);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(periodoPQ.get("periodo")).into(TXT_PERIODO_PQ)
        );

    }
}
