package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;
import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LST_USUARIO_REG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UsuarioRegistro implements Task {
    private final Map<String, String> usuRegistro;

    public UsuarioRegistro(Map<String, String> usuRegistro) {
        this.usuRegistro = usuRegistro;
    }
    public static UsuarioRegistro ingresa(Map<String, String> usuRegistro){
        return instrumented(UsuarioRegistro.class,usuRegistro );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            SelectFromOptions.byVisibleText(usuRegistro.get("usuRegistro")).from(LST_USUARIO_REG)
    );
        }
}
