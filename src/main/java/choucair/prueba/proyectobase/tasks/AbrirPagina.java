package choucair.prueba.proyectobase.tasks;

import choucair.prueba.proyectobase.userinterface.Testerpagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirPagina implements Task {

    private Testerpagina testerpagina;;

    public static AbrirPagina thePage() {

        return  Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(testerpagina));
    }
}
