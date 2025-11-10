package com.bcs.simulador.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login  extends PageObject {

    public static final Target TXT_NOMBRE= Target.the("Ingresa nombre del usuario")
            .located(By.id("nombre"));
    public static final Target TXT_EMAIL= Target.the("Ingresa email")
            .located(By.id("email"));
    public static final Target TXT_TELEFONO= Target.the("Ingresa telefono")
            .located(By.id("telefono"));
    public static final Target TXT_PAIS= Target.the("Selecionar paìs")
            .located(By.id("pais"));
    public static final Target TXT_COMENTARIOS= Target.the("Ingresa comentarios")
            .located(By.id("comentarios"));
    public static final Target BTN_ENVIAR= Target.the("Botòn enviar")
            .located(By.cssSelector("button[type='submit']"));
    public static final Target LBL_EXITOSO= Target.the("Label registro exitoso")
            .located(By.cssSelector("#successMessage"));
    public static final Target LBL_EMAIL_ERROR = Target.the("Label error de email inválido")
            .located(By.cssSelector("#emailFormatoError"));
    public static final Target LBL_NOMBRE_OBLI = Target.the("Label nombre es obligatorio")
            .located(By.cssSelector("#nombreError"));
}
