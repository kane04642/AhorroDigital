package com.calidda.planQ.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login  extends PageObject {

    public static final Target TXT_USER= Target.the("Ingresar usuario").located(By.id("correo"));
    public static final Target TXT_CLAVE= Target.the("Ingresar clave").located(By.id("password"));
    public static final Target BTN_INGRESAR= Target.the("Botòn ingresar").located(By.cssSelector("button[type='button']"));

}
