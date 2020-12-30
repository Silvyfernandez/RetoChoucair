package choucair.prueba.proyectobase.tasks;

import choucair.prueba.proyectobase.userinterface.RegistrarUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registrar implements Task {

    private String nombre;
    private String apellido;
    private String email;
    private String mes_Cumpleanio;
    private String dia_cumpleanio;
    private String anio_cumpleanio;
    private String ciudad;
    private String codigo_postal;
    private String pais;

    public  Registrar (String nombre, String apellido, String email, String mes_Cumpleanio, String dia_cumpleanio, String anio_cumpleanio,String ciudad,String codigo_postal,String pais) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.mes_Cumpleanio=mes_Cumpleanio;
        this.dia_cumpleanio=dia_cumpleanio;
        this.anio_cumpleanio=anio_cumpleanio;
        this.ciudad=ciudad;
        this.codigo_postal=codigo_postal;
        this.pais=pais;
    }
    public static Registrar the(String nombre, String apellido, String email, String mes_Cumpleanio, String dia_cumpleanio, String anio_cumpleanio,String ciudad,String codigo_postal,String pais) {

        return Tasks.instrumented(Registrar.class, nombre,apellido,email, mes_Cumpleanio,dia_cumpleanio, anio_cumpleanio, ciudad,codigo_postal, pais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrarUsuario.REGISTRARBUTTON),
                Enter.theValue(nombre).into(RegistrarUsuario.INPUT_NOMBRE),
                Enter.theValue(apellido).into(RegistrarUsuario.INPUT_APELLIDO),
                Enter.theValue(email).into(RegistrarUsuario.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(mes_Cumpleanio).from(RegistrarUsuario.DROPDOWN_MES),
                SelectFromOptions.byVisibleText(dia_cumpleanio).from(RegistrarUsuario.DROPDOWN_DIA),
                SelectFromOptions.byVisibleText(anio_cumpleanio).from(RegistrarUsuario.DROPDOWN_ANIO),
                Click.on(RegistrarUsuario.SIGUIENTEBUTTON),
                Enter.theValue(ciudad).into(RegistrarUsuario.INPUT_CIUDAD),
                SelectFromOptions.byVisibleText(ciudad).from(RegistrarUsuario.ITEM_CIUDAD),
                Enter.theValue(codigo_postal).into(RegistrarUsuario.INPUT_CODIGOPOSTAL),
                Enter.theValue(pais).into(RegistrarUsuario.INPUT_PAIS),
                Click.on(RegistrarUsuario.SIGUIENTE_STEP2_BUTTON)


        );
    }
}
