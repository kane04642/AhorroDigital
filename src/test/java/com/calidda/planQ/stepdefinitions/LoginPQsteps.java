package com.calidda.planQ.stepdefinitions;

import com.calidda.planQ.tasks.AutenticarPQ;
import com.calidda.planQ.tasks.LoginPQ;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginPQsteps {
    @Dado("el usuario navega a la pagina plan quinquenal")
    public void elUsuarioNavegaALaPaginaPlanQuinquenal() {

        theActorInTheSpotlight().wasAbleTo(
                LoginPQ.cloud()
        );

    }

    @Cuando("el usuario ingresa las credenciales para autenticacion")
    public void elUsuarioIngresaLasCredencialesParaAutenticacion(Map<String, String> datosDashboard) {
        theActorInTheSpotlight().attemptsTo(
                AutenticarPQ.cloud(datosDashboard.get("actor"))
        );
    }
}
