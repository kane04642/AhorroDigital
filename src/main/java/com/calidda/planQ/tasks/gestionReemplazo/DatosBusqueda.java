package com.calidda.planQ.tasks.gestionReemplazo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.gestionReemplazo.GestionReemplazoPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosBusqueda implements Task {
    private final Map<String, String> datosBusqueda;

    public DatosBusqueda(Map<String, String> datosBusqueda) {
        this.datosBusqueda = datosBusqueda;
    }
    public static DatosBusqueda ingresar(Map<String, String> datosBusqueda){
        return instrumented(DatosBusqueda.class, datosBusqueda);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosBusqueda.get("codigoProyecto")).into(TXT_COD_PROYECTO),
                SelectFromOptions.byVisibleText(datosBusqueda.get("distrito")).from(LST_PROYECTO),
                SelectFromOptions.byVisibleText(datosBusqueda.get("AnPA")).from(LST_AN_PA),
                Enter.theValue(datosBusqueda.get("inversion")).into(TXT_INVER_USD),
                Enter.theValue(datosBusqueda.get("impedimentos")).into(TXT_LONG_IMPEDI),
                Click.on(BTN_APLICAR)
                );

    }
}
