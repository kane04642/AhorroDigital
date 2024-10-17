package com.grupoemi.seguridad.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA {

    private NavegarA() {
        throw new UnsupportedOperationException("This class is not meant to be instantiated");
    }
    public static Performable seguridadHomePage() {
        return Task.where("abre la pagina seguridad",
                Open.browserOn().the(authenticationHomePage.class)
        );
    }
}
