package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.Map;
import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.CLD_FECHA_REGISTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FechaRegistro implements Task {
    private final Map<String, String> fechaRegistro;

    public FechaRegistro(Map<String, String> fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public static FechaRegistro ingresar(Map<String, String> fechaRegistro){
        return instrumented(FechaRegistro.class, fechaRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(fechaRegistro.get("fechaRegistro")).into(CLD_FECHA_REGISTRO)
        );

    }
}
