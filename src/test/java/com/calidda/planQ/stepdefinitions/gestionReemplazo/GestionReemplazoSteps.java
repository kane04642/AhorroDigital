package com.calidda.planQ.stepdefinitions.gestionReemplazo;

import com.calidda.planQ.tasks.gestionReemplazo.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GestionReemplazoSteps {

    @Dado("el usuario selecciona menu gestion de reemplazo")
    public void elUsuarioSeleccionaMenuGestionDeReemplazo() {
        theActorInTheSpotlight().wasAbleTo(
                MenuGestionReem.click()
        );
    }

    @Cuando("Doy click en pestaña impedimentos")
    public void doyClickEnPestanaImpedimentos() {
        theActorInTheSpotlight().wasAbleTo(
                PestanaImpedimentos.click()
        );
    }

    @Cuando("ingreso datos de busqueda")
    public void ingresoDatosDeBusqueda(Map<String, String> datosBusqueda) {
        theActorInTheSpotlight().wasAbleTo(
                DatosBusqueda.ingresar(datosBusqueda)
        );
    }

    @Y("Doy click en link mas filtros")
    public void doyClickEnLinkMasFiltros() {
        theActorInTheSpotlight().wasAbleTo(
                LinkMasFiltros.click()
        );
    }

    @Cuando("ingreso datos de busqueda mas filtros")
    public void ingresoDatosDeBusquedaMasFiltros(Map<String, String> datosMasFiltros) {
        theActorInTheSpotlight().wasAbleTo(
                BusquedaMasFiltros.ingresar(datosMasFiltros)
        );
    }

    @Cuando("Doy click en bolsa de reemplazo")
    public void doyClickEnBolsaDeReemplazo() {
        theActorInTheSpotlight().wasAbleTo(
                PestanaBolsaReem.click()
        );
    }

    @Cuando("ingreso datos de busqueda bolsa de reemplazo")
    public void ingresoDatosDeBusquedaBolsaDeReemplazo(Map<String, String> datosBolsaReem) {
        theActorInTheSpotlight().wasAbleTo(
                DatosBolsaReem.ingresar(datosBolsaReem)
        );
    }
}
