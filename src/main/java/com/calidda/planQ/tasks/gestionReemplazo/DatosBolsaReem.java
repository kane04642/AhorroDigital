package com.calidda.planQ.tasks.gestionReemplazo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.gestionReemplazo.GestionReemplazoPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosBolsaReem implements Task {
    private final Map<String, String> datosBolsaReem;

    public DatosBolsaReem(Map<String, String> datosBolsaReem) {
        this.datosBolsaReem = datosBolsaReem;
    }
    public static DatosBolsaReem ingresar(Map<String, String> datosBolsaReem){
        return instrumented(DatosBolsaReem.class, datosBolsaReem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosBolsaReem.get("codigoAnteProyecto")).into(TXT_COD_ANTEPRO),
                SelectFromOptions.byVisibleText(datosBolsaReem.get("distrito")).from(LST_DISTRITO),
                SelectFromOptions.byVisibleText(datosBolsaReem.get("constructor")).from(LST_CONSTRUCTOR_BR),
                Enter.theValue(datosBolsaReem.get("longReemplazo")).into(TXT_LONG_BOL_REEM),
                Click.on(BTN_APLICAR)
                );

    }
}
