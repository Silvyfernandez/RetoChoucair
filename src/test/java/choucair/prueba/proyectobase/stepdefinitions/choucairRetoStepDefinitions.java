package choucair.prueba.proyectobase.stepdefinitions;

import choucair.prueba.proyectobase.model.CouchairPruebaData;
import choucair.prueba.proyectobase.tasks.AbrirPagina;
import choucair.prueba.proyectobase.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class choucairRetoStepDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Silvana quiere registrarse en la comunidad de tester$")
    public void queSilvanaQuiereRegistrarseEnLaComunidadDeTester() {
        OnStage.theActor("Silvana").wasAbleTo(AbrirPagina.thePage());
    }

    @Cuando("^ella diligencia el formulario con su informacion personal$")
    public void ellaDiligenciaElFormularioConSuInformacionPersonal(List<CouchairPruebaData> couchairPruebaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.the(couchairPruebaData.get(0).getNombre(),couchairPruebaData.get(0).getApellido(), couchairPruebaData.get(0).getEmail(),couchairPruebaData.get(0).getMes_Cumpleanio(),couchairPruebaData.get(0).getDia_cumpleanio(),couchairPruebaData.get(0).getAnio_cumpleanio(),couchairPruebaData.get(0).getCiudad(),couchairPruebaData.get(0).getCodigo_postal(),couchairPruebaData.get(0).getPais()));
    }

    @Entonces("^ella es un nuevo usuario en la pagina de tester$")
    public void ellaEsUnNuevoUsuarioEnLaPaginaDeTester() {

    }


}
