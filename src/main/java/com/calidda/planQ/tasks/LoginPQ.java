package com.calidda.planQ.tasks;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginPQ implements Task {

    private EnvironmentVariables environmentVariables;
    String urlBase;

    public static LoginPQ cloud(){
        return instrumented(LoginPQ.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        urlBase = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
        actor.attemptsTo(
                Open.url(urlBase)
        );
    }
}
