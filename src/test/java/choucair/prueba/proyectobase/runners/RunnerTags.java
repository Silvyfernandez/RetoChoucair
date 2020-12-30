package choucair.prueba.proyectobase.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/retoChoucair.feature",
        tags = "@stories",
        glue = "choucair.prueba.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
