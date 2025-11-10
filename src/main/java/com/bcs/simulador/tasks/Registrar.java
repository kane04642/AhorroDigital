package com.bcs.simulador.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.bcs.simulador.userinterface.Login.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {
    private final Map<String, String> datos;

    public Registrar(Map<String, String> datos) {
        this.datos = datos;
    }

    public static Registrar datos(Map<String, String> datos){
        return instrumented(Registrar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get("nombre")).into(TXT_NOMBRE),
                Enter.theValue(datos.get("email")).into(TXT_EMAIL),
                Enter.theValue(datos.get("telefono")).into(TXT_TELEFONO),
                SelectFromOptions.byVisibleText(datos.get("pais")).from(TXT_PAIS),
                Enter.theValue(datos.get("comentarios")).into(TXT_COMENTARIOS),
                Click.on(BTN_ENVIAR)

        );

    }
}
