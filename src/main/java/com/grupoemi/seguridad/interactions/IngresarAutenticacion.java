package com.grupoemi.seguridad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.Map;


import static com.grupoemi.seguridad.userinterface.Login.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class IngresarAutenticacion implements Interaction {

    private Map<String, String> datosAccesos;

    public IngresarAutenticacion(Map<String, String> datosAccesos){
        this.datosAccesos = datosAccesos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

         actor.attemptsTo(
                    Enter.keyValues(datosAccesos.get("usuario")).into(TEXTO_USUARIO),
                    Enter.keyValues(datosAccesos.get("password")).into(TEXTO_PASWORD),
                    Click.on(BOTON_INGRESAR),
                    WaitUntil.the(AUTHENTICATION, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(AUTHENTICATION)
            );
    }

    public static IngresarAutenticacion loginUsuarioTi(Map<String, String> datosAccesos) {
        return instrumented(IngresarAutenticacion.class, datosAccesos);
    }
}
