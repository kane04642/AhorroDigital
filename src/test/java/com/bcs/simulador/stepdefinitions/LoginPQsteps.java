package com.bcs.simulador.stepdefinitions;

import com.bcs.simulador.questions.EmailFormatoIncorrecto;
import com.bcs.simulador.questions.NombreObligatorio;
import com.bcs.simulador.questions.RegistroExitoso;
import com.bcs.simulador.tasks.Login;
import com.bcs.simulador.tasks.Registrar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginPQsteps {

    @Dado("el usuario navega a la pagina login")
    public void elUsuarioNavegaALaPaginaLogin() {
        theActorInTheSpotlight().wasAbleTo(
                Login.cloud()
        );
    }
    
    @Cuando("el usuario ingresa datos correctos del registro")
    public void elUsuarioIngresaDatosCorrectosDelRegistro(Map<String, String> datos) {
        theActorInTheSpotlight().wasAbleTo(
                Registrar.datos(datos)
        );
    }

    @Entonces("el usuario valida mensaje de creaciòn exitoso")
    public void elUsuarioValidaMensajeDeCreacionExitoso() {
        theActorInTheSpotlight().should(
                seeThat(RegistroExitoso.isVisible())
        );
    }

    @Entonces("el usuario valida mensaje de email incorrecto")
    public void elUsuarioValidaMensajeDeEmailIncorrecto() {
        theActorInTheSpotlight().should(
                seeThat(EmailFormatoIncorrecto.isVisible())
        );
    }

    @Entonces("el usuario valida mensaje nombre obligatorio")
    public void elUsuarioValidaMensajeNombreObligatorio() {
        theActorInTheSpotlight().should(
                seeThat(NombreObligatorio.isVisible())
        );
    }
}
