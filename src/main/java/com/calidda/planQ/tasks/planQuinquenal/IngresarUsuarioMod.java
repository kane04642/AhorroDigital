package com.calidda.planQ.tasks.planQuinquenal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.Map;
import static com.calidda.planQ.userinterface.planQuinquenal.PlanQuinquenalPOM.LST_USUARIO_MOD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarUsuarioMod implements Task {
    private final Map<String, String> usuarioMod;

    public IngresarUsuarioMod(Map<String, String> usuarioMod) {
        this.usuarioMod = usuarioMod;
    }
public static IngresarUsuarioMod modificar(Map<String, String> usuarioMod){
        return instrumented(IngresarUsuarioMod.class, usuarioMod);
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(usuarioMod.get("usuarioMod")).from(LST_USUARIO_MOD)

        );
    }
}
