package com.grupoemi.seguridad.userinterface;

import net.serenitybdd.screenplay.targets.Target;


public class Home {

    private Home() {
        throw new UnsupportedOperationException("This class is not meant to be instantiated");
    }
    public static final Target BOTON_CONTINUAR = Target.the("clic en continuar hacia el pricing")
            .locatedBy("//button[contains(@id,'btn-go-to-pricing')]");

    public static final Target PAGINA_PRICING = Target.the("espera pagina pricing")
            .locatedBy("//span[@class='mdc-evolution-chip__text-label mat-mdc-chip-action-label'][contains(.,'Recomendado')]");

}
