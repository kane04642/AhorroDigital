package com.calidda.planQ.tasks.gestionReemplazo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.calidda.planQ.userinterface.gestionReemplazo.GestionReemplazoPOM.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedaMasFiltros implements Task {
    private final Map<String, String> datosMasFiltros;

    public BusquedaMasFiltros(Map<String, String> datosMasFiltros) {
        this.datosMasFiltros = datosMasFiltros;
    }
    public static BusquedaMasFiltros ingresar(Map<String, String> datosMasFiltros){
        return instrumented(BusquedaMasFiltros.class, datosMasFiltros);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosMasFiltros.get("codigoMalla")).into(TXT_COD_MALLA),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("Constructor")).from(LST_CONSTRUCTOR),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("causalReemplazo")).from(LST_CAUSAL_REEM),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("ingResponsable")).from(LST_ING_RESPON),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("problemaReal")).from(LST_PROBLE_REAL),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("problemaReal")).from(LST_PROBLE_REAL),
                Enter.theValue(datosMasFiltros.get("estrato1")).into(TXT_ESTRATO_1),
                Enter.theValue(datosMasFiltros.get("estrato2")).into(TXT_ESTRATO_2),
                Enter.theValue(datosMasFiltros.get("estrato3")).into(TXT_ESTRATO_3),
                Enter.theValue(datosMasFiltros.get("estrato4")).into(TXT_ESTRATO_4),
                Enter.theValue(datosMasFiltros.get("estrato5")).into(TXT_ESTRATO_5),
                Enter.theValue(datosMasFiltros.get("longImpedimentos")).into(TXT_LONG_IMPEDIM),
                Enter.theValue(datosMasFiltros.get("longReemplazo")).into(TXT_LONG_REEMPLAZO),
                Enter.theValue(datosMasFiltros.get("fechaPreReem")).into(TXT_FEC_PRESE_REEM),
                Enter.theValue(datosMasFiltros.get("fechaRegistro")).into(TXT_FEC_REGISTRO),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("nReemplazo")).from(LST_NO_REEMPLAZO),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("valiCargoPlanos")).from(LST_VALIDA_CARGO),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("valiCargoSusPermi")).from(LST_VAL_CSP),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("valiCargoSusRRCC")).from(LST_VAL_RRCC),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("validaLegal")).from(LST_VALIDA_LEGAL),
                SelectFromOptions.byVisibleText(datosMasFiltros.get("importancia")).from(LST_IMPORTANCIA),
                Enter.theValue(datosMasFiltros.get("usuResponsables")).into(TXT_USU_RESPONSA),
                Click.on(BTN_APLICAR_FILTROS)
                );

    }
}
