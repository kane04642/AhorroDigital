package com.calidda.planQ.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.model.util.EnvironmentVariables;

import static com.calidda.planQ.userinterface.Login.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AutenticarPQ implements Task {

    private final String actorName;
    private EnvironmentVariables environmentVariables;
    public AutenticarPQ(String actorName) {
        this.actorName = actorName;
    }

    public static AutenticarPQ cloud(String actorName){
        return instrumented(AutenticarPQ.class, actorName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String usernameKey = "users." + actorName + ".username";
        String passwordKey = "users." + actorName + ".password";
        // Lee el usuario y la contraseña desde serenity.conf
        String username = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty(usernameKey);
        String password = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty(passwordKey);

        actor.attemptsTo(
                Enter.keyValues(username).into(TXT_USER),
                Enter.keyValues(password).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
                );
        Serenity.takeScreenshot();

    }
}
