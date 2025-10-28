package com.calidda.planQ.stepdefinitions.planQuinquenal;

import com.calidda.planQ.Constantes.Constantes;
import com.calidda.planQ.questions.dashboard.ExisteGrafica;
import com.calidda.planQ.questions.planQuinquenal.EstadoAprobacion;
import com.calidda.planQ.questions.planQuinquenal.ExisteTabla;
import com.calidda.planQ.questions.planQuinquenal.ValidarCodigoProyecto;
import com.calidda.planQ.tasks.AutenticarPQ;
import com.calidda.planQ.tasks.LoginPQ;
import com.calidda.planQ.tasks.planQuinquenal.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PlanQuinquenalSteps {
    @Dado("el usuario selecciona menu Plan Quinquenal")
    public void elUsuarioSeleccionaMenuPlanQuinquenal() {
        theActorInTheSpotlight().wasAbleTo(
                MenuPlanQuinquenal.click()
        );
    }

    @Cuando("Doy click en pestaña plan quinquenal")
    public void doyClickEnPestanaPlanQuinquenal() {
        theActorInTheSpotlight().wasAbleTo(
                PestanaQuinquenal.click()
        );
    }

    @Cuando("el usuario ingresa periodo")
    public void elUsuarioIngresaPeriodo(Map<String, String> periodoPQ) {
        theActorInTheSpotlight().wasAbleTo(
                IngresarPeriodoPQ.digitar(periodoPQ)
        );

    }


    @Cuando("el usuario ingresa las credenciales para autenticacion como {string}")
    public void elUsuarioIngresaLasCredencialesParaAutenticacionComo(String cliente) {
        theActorInTheSpotlight().wasAbleTo(
                AutenticarPQ.cloud("cliente")
        );
    }

    @Cuando("Ingreso estado de aprobaciòn")
    public void ingresoEstadoDeAprobacion(Map<String, String> aprobacion) {
        theActorInTheSpotlight().wasAbleTo(
                ValidarEstaAprobacion.estado(aprobacion)
        );
    }

    @Y("doy click en aplicar")
    public void doyClickEnAplicar() {
        theActorInTheSpotlight().wasAbleTo(
                ClickAplicar.consultar()
        );
    }

    @Entonces("Valido se genera consulta")
    public void validoSeGeneraConsulta() {
        theActorInTheSpotlight().should(
                seeThat(ExisteTabla.isVisible())
        );
    }

    @Cuando("Ingreso fecha de modificacion")
    public void ingresoFechaDeModificacion(Map<String, String> fechaMod) {
        theActorInTheSpotlight().wasAbleTo(
                IngresarFechaMod.conLosDatos(fechaMod)
        );
    }

    @Cuando("Ingreso usuario modifica")
    public void ingresoUsuarioModifica(Map<String, String> usuarioMod) {
        theActorInTheSpotlight().wasAbleTo(
                IngresarUsuarioMod.modificar(usuarioMod)
        );
    }

    @Y("Doy click en mas filtros")
    public void doyClickEnMasFiltros() {
        theActorInTheSpotlight().wasAbleTo(
                MasFiltros.click()
        );

    }

    @Cuando("el usuario ingresa descripciòn")
    public void elUsuarioIngresaDescripcion(Map<String, String> descripcion) {
        theActorInTheSpotlight().wasAbleTo(
                Descripcion.ingresar(descripcion)
        );
    }

    @Y("doy click en aplicar mas filtros")
    public void doyClickEnAplicarMasFiltros() {
        theActorInTheSpotlight().wasAbleTo(
                BtnAplicarMF.click()
        );
    }

    @Cuando("ingreso fecha de registro")
    public void ingresoFechaDeRegistro(Map<String, String> fechaRegistro) {
        theActorInTheSpotlight().wasAbleTo(
                FechaRegistro.ingresar(fechaRegistro)
        );
    }

    @Cuando("ingreso usuario que registro")
    public void ingresoUsuarioQueRegistro(Map<String, String> usuRegistro) {
        theActorInTheSpotlight().wasAbleTo(
                UsuarioRegistro.ingresa(usuRegistro)
        );
    }

    @Y("doy click en boton nuevo registro")
    public void doyClickEnBotonNuevoRegistro() {
        theActorInTheSpotlight().wasAbleTo(
                BotonNuevoPlanQ.crear()
        );
    }

    @Cuando("ingreso los datos del nuevo plan quinquenal")
    public void ingresoLosDatosDelNuevoPlanQuinquenal(Map<String, String> datosNuevoPlanQ) {
        theActorInTheSpotlight().wasAbleTo(
                NuevoPlanQuinquenal.crear(datosNuevoPlanQ)
        );
    }

    @Entonces("Valido mensaje ingreso codigo de proyecto")
    public void validoMensajeIngresoCodigoDeProyecto() {
        theActorInTheSpotlight().should(
                seeThat(ValidarCodigoProyecto.esVisible())
        );
    }

    @Entonces("Valido mensaje estado aprobacion es obligatorio")
    public void validoMensajeEstadoAprobacionEsObligatorio() {
        theActorInTheSpotlight().should(
                seeThat("Se valida mensaje campo obligatorio", EstadoAprobacion.obligatorio(), equalTo(Constantes.MSG_ESTADO_APRO))
        );
    }

    @Y("doy click en boton limpiar")
    public void doyClickEnBotonLimpiar() {
        theActorInTheSpotlight().wasAbleTo(
                BotonLimpiar.click()
        );
    }

    @Cuando("Doy click en pestaña plan anual")
    public void doyClickEnPestanaPlanAnual() {
        theActorInTheSpotlight().wasAbleTo(
                Pestana_PAnual.click()
        );
    }

    @Cuando("ingreso los datos del nuevo plan anual")
    public void ingresoLosDatosDelNuevoPlanAnual(Map<String, String> datosNuevoPlanA) {
        theActorInTheSpotlight().wasAbleTo(
                NuevoPlanAnual.crear(datosNuevoPlanA)
        );
    }
}
