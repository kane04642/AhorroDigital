package com.calidda.planQ.stepdefinitions.dashboard;

import com.calidda.planQ.questions.dashboard.ExisteGrafica;
import com.calidda.planQ.tasks.dashboard.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.core.Serenity;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DashboardSteps {
    @Dado("el usuario selecciona menu dashboard")
    public void elUsuarioSeleccionaMenuDashboard() {
        theActorInTheSpotlight().wasAbleTo(
                MenuDashboard.click()
        );
    }

    @Y("el usuario selecciona pestaña plan quinquenal")
    public void elUsuarioSeleccionaPestanaPlanQuinquenal() {
        theActorInTheSpotlight().wasAbleTo(
                Pestana_HabiDistrito.click()
        );

    }

    @Cuando("el usuario ingresa datos de consulta")
    public void elUsuarioIngresaDatosDeConsulta(Map<String, String> datosDashboard) {

        theActorInTheSpotlight().wasAbleTo(
                DatosConsulta.dashboard(datosDashboard)
        );
    }

    @Dado("que se ejecuta el caso de prueba {string}")
    public void queSeEjecutaElCasoDePrueba(String testCase) {
        System.out.println("Ejecutando caso de prueba: " + testCase);
        // Opcional: Guardar en session variable para uso posterior
        Serenity.setSessionVariable("CURRENT_TEST_CASE").to(testCase);
    }

    @Cuando("el usuario ingresa datos de consulta plan anual")
    public void elUsuarioIngresaDatosDeConsultaPlanAnual(Map<String, String> datosPlanAnual) {
        theActorInTheSpotlight().wasAbleTo(
                PlanAnualHD.datos(datosPlanAnual)
        );
    }

    @Entonces("visualizo grafica de resultados")
    public void visualizoGraficaDeResultados() {
        theActorInTheSpotlight().should(
                seeThat(ExisteGrafica.isVisible())
        );
    }

    @Cuando("Doy click en pestaña Avance Construcciòn - Distrito")
    public void doyClickEnPestanaAvanceConstruccionDistrito() {
        theActorInTheSpotlight().wasAbleTo(
                Pestana_ConstruDistrito.daClick()
        );
    }

    @Cuando("el usuario ingresa datos de consulta Construcciòn - Distrito")
    public void elUsuarioIngresaDatosDeConsultaConstruccionDistrito(Map<String, String> datosDashCD) {

        theActorInTheSpotlight().wasAbleTo(
                Datos_DashCD.dashboard(datosDashCD)
        );
    }

    @Cuando("el usuario ingresa datos plan anual de consulta Construcciòn - Distrito")
    public void elUsuarioIngresaDatosPlanAnualDeConsultaConstruccionDistrito(Map<String, String> planAnualCD) {
        theActorInTheSpotlight().wasAbleTo(
                PlanAnualCD.datos(planAnualCD)
        );
    }

    @Y("el usuario selecciona pestaña Habilitación - Periodo")
    public void elUsuarioSeleccionaPestanaHabilitacionPeriodo() {
        theActorInTheSpotlight().wasAbleTo(
                Pestana_HabiliPeriodo.clikc()
        );
    }

    @Cuando("el usuario ingresa datos de consulta Habilitación - Periodo")
    public void elUsuarioIngresaDatosDeConsultaHabilitacionPeriodo(Map<String, String> datosQuinqueHAP) {
        theActorInTheSpotlight().wasAbleTo(
                Datos_QuinquenalHAP.datos(datosQuinqueHAP)
        );
    }

    @Cuando("el usuario ingresa datos de consulta plan anual Habilitación - Periodo")
    public void elUsuarioIngresaDatosDeConsultaPlanAnualHabilitacionPeriodo(Map<String, String> datosAnualHAP) {
        theActorInTheSpotlight().wasAbleTo(
                Datos_AnualHAP.diligenciar(datosAnualHAP)
        );
    }

    @Y("el usuario selecciona pestaña Construcciòn - Periodo")
    public void elUsuarioSeleccionaPestanaConstruccionPeriodo() {
        theActorInTheSpotlight().wasAbleTo(
                Pestana_ConstruPeriodo.click()
        );
    }

    @Cuando("el usuario ingresa datos de consulta plan anual Construcciòn - Periodo")
    public void elUsuarioIngresaDatosDeConsultaPlanAnualConstruccionPeriodo(Map<String, String> datosAnualCP) {
        theActorInTheSpotlight().wasAbleTo(
                DatosAnualCP.ingresar(datosAnualCP)
        );

    }

    @Cuando("el usuario ingresa datos de consulta plan quinquenal Construcciòn - Periodo")
    public void elUsuarioIngresaDatosDeConsultaPlanQuinquenalConstruccionPeriodo(Map<String, String> datosQuinqueCP) {
        theActorInTheSpotlight().wasAbleTo(
                DatosQuinqueCP.ingresar(datosQuinqueCP)
        );
    }

    @Y("el usuario selecciona pestaña Permiso - Distrito")
    public void elUsuarioSeleccionaPestanaPermisoDistrito() {
        theActorInTheSpotlight().wasAbleTo(
                Pestana_PermiDistrito.click()
        );
    }

    @Cuando("el usuario ingresa datos de consulta plan quinquenal permiso - Distrito")
    public void elUsuarioIngresaDatosDeConsultaPlanQuinquenalPermisoDistrito(Map<String, String> datosQuinquePD) {
        theActorInTheSpotlight().wasAbleTo(
                DatosQuinquePD.ingresar(datosQuinquePD)
        );
    }

    @Cuando("el usuario ingresa datos de consulta plan anual Permiso - Distrito")
    public void elUsuarioIngresaDatosDeConsultaPlanAnualPermisoDistrito(Map<String, String> datosAnualPD) {
        theActorInTheSpotlight().wasAbleTo(
                DatosAnualPD.ingresar(datosAnualPD)
        );
    }
}
