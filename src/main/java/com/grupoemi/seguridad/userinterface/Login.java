package com.grupoemi.seguridad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    private Login() {
        throw new UnsupportedOperationException("This class is not meant to be instantiated");
    }

    public static final Target TEXTO_USUARIO = Target.the("Ingresa el Usuario")
            .locatedBy("//input[contains(@type,'email')]");

    public static final Target TEXTO_PASWORD = Target.the("Ingresa el password")
            .locatedBy("//input[contains(@type,'password')]");

    public static final Target BOTON_INGRESAR = Target.the("clic en ingresar")
            .locatedBy("//span[@class='mdc-button__label'][contains(.,'Iniciar Sesión')]");

    public static final Target PAGINA_INICIO = Target.the("espera la pagina de inicio")
            .locatedBy("//span[@class='logo-name'][contains(.,'Autenticador')]");

    public static final Target AUTHENTICATION = Target.the("clic en Autenticacion")
            .locatedBy("//a[@class='nav-link btn-color-muted p-4'][contains(.,'Authentication')]");

    public static final Target MENSAJE_ERROR = Target.the("mensaje de error")
            .located(By.id("toast_login_validation"));
}
