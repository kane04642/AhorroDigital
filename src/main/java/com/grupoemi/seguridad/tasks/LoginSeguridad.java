package com.grupoemi.seguridad.tasks;

import com.grupoemi.seguridad.interactions.IngresarAutenticacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginSeguridad implements Task {

    private final Map<String, String> datosAccesos;

    public LoginSeguridad(Map<String, String> datosAccesos) {
        this.datosAccesos = datosAccesos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                IngresarAutenticacion.loginUsuarioTi(datosAccesos)
        );

    }

    public static Performable loginUsuario(Map<String, String> datosAccesos) {
        return instrumented(LoginSeguridad.class, datosAccesos);
    }

}

