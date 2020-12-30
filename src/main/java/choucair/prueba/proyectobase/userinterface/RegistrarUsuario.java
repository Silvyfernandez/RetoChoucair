package choucair.prueba.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarUsuario extends PageObject {

    public static final Target REGISTRARBUTTON=Target.the("Boton para ver el formulario de registro")
            .located(By.xpath("//a[@Class='unauthenticated-nav-bar__sign-up'][contains(text(),'Join')]"));
    public static final Target INPUT_NOMBRE=Target.the("Ingresar el primer Nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_APELLIDO=Target.the("Ingresar el apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("Ingresar el correo eletronico")
            .located(By.id("email"));
    public static final Target DROPDOWN_MES=Target.the("Seleccionar el mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target DROPDOWN_DIA=Target.the("Seleccionar el dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target DROPDOWN_ANIO=Target.the("Seleccionar el año de nacimiento")
            .located(By.id("birthYear"));
    public static final Target SIGUIENTEBUTTON=Target.the("Boton para continuar con la segunda parte del formulario de registro")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_CIUDAD=Target.the("Ingresar la ciudad")
            .located(By.id("city"));
    public static final Target ITEM_CIUDAD=Target.the("Se selecciona la ciudad")
            .located(By.xpath("/html/body/div[4]/div[1]/span[3]"));
    public static final Target INPUT_CODIGOPOSTAL=Target.the("Ingresar el codigo postal")
           .located(By.id("zip"));
    public static final Target INPUT_PAIS=Target.the("Ingresar el Pais")
            .located(By.xpath("//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']"));
    public static final Target SIGUIENTE_STEP2_BUTTON=Target.the("Boton para continuar con la tercera parte del formulario de registro")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));




}
