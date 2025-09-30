package com.calidda.planQ.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login  extends PageObject {

    public static final Target TXT_USER= Target.the("Ingresar usuario").located(By.id("personEmail"));
    public static final Target TXT_CLAVE= Target.the("Ingresar clave").located(By.id("personPassword"));
    public static final Target BTN_INICIAR_SESION= Target.the("Inicicar sesion").located(By.id("personLogin"));
    public static final Target BTN_COOKIES= Target.the("Acepto cookies").located(By.cssSelector("#body > div.cky-consent-container.cky-banner-bottom > div > div > div > div.cky-notice-btn-wrapper > button.cky-btn.cky-btn-accept"));
    public static final Target BTN_ACTUALIZAR= Target.the("Confirmar pais").located(By.cssSelector("div[class='container'] button[class='yellow-bg mat-flat-button mat-button-base']"));
    public static final Target LBL_SALUD_OV= Target.the("Mensaje bienvenida").located(By.cssSelector(".py-2.d-none.d-md-inline-block"));
    public static final Target TXT_NUMERO = Target.the("Campo Teléfono Fijo")
            .located(By.cssSelector("input[formcontrolname='homePhone']"));
    public static final Target BTN_REGISTRARME= Target.the("Botòn registrar nuevo usuario").located(By.id("registrarPersona"));
    public static final Target TXT_NOMBRE_APELLIDO= Target.the("Ingresar nombres y apellidos").located(By.xpath("//input[@formcontrolname='clientName']"));
    public static final Target TXT_EMAIL= Target.the("Ingresar email de registro").located(By.xpath("//input[@formcontrolname='clientEmail']"));
    public static final Target TXT_TELEFONO_REGISTRO= Target.the("Ingresar telèfono registro").located(By.xpath("//input[@formcontrolname='clientPhone']"));
    public static final Target TXT_CELULAR= Target.the("Ingresar celular de registro").located(By.xpath("//input[@formcontrolname='clientCellPhone']"));
    public static final Target TXT_CLAVE_REGISTRO= Target.the("Ingresar clave de registro").located(By.xpath("//input[@formcontrolname='clientPassword']"));
    public static final Target TXT_CLAVE_CONFIRMAR= Target.the("Ingresar confirmo clave de registro").located(By.xpath("//input[@formcontrolname='clientConfirmPassword']"));
    public static final Target TXT_NUM_CLIENTE= Target.the("Ingresar numero de cliente").located(By.xpath("//input[@formcontrolname='clientCode']"));
    public static final Target TXT_NUM_RECIBO= Target.the("Ingresar numero de recibo").located(By.xpath("//input[@formcontrolname='clientReceiptNumber']"));
    public static final Target CHK_POLI_WEB = Target.the("Check politica web de privacidad").located(By.cssSelector("span.mat-slide-toggle-content"));
    public static final Target CHK_FINES_COMER = Target.the("Check acepto fines comerciales").located(By.id("mat-slide-toggle-2-input"));
    public static final Target CHK_RECIBO = Target.the("Check recibo digital").located(By.id("mat-slide-toggle-3-input"));
    public static final Target BTN_REGIS_USUARIO= Target.the("Botòn registrar el nuevo usuario").located(By.xpath("//button[@class='btnRegister mat-flat-button mat-button-base']"));
    public static final Target BTN_ACEPTO_FINES= Target.the("Botòn acepto fines comerciales").located(By.xpath("//button[@class='blue-bg whiteText mat-button mat-button-base']"));

}
