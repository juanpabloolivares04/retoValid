package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.example.userinterfaces.homePage;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.example.userinterfaces.homePage.TITLEHOME;
import static org.example.userinterfaces.resultSearch.TITLE1;

public class homeStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private homePage HomePage = new homePage();

    @Dado("^que el usuario desea ingresar a la pagina Wikipedia$")
    public void queElUsuarioRequiereBuscarUnaPalabraALaPaginaWikipedia() {
        actor.can(BrowseTheWeb.with(navegador));
        navegador.manage().window().maximize();


    }

    @Cuando("^el ingresa la url en el navegador$")
    public void seElIngreseLaALaBarraDeBusqueda() {
        actor.wasAbleTo(Open.browserOn(HomePage));
    }

    @Entonces("^el debe ver el titulo de bienvenida$")
    public void seElDebeVerElArticuloDeLaPalabraBuscada() {
        actor.should(seeThat(the(TITLEHOME),isPresent()));

    }
}
