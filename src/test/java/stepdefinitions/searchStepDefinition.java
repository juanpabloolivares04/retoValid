package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.example.tasks.fillSearchbar;
import org.example.userinterfaces.homePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.example.userinterfaces.resultSearch.TITLE1;

public class searchStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Andrea");
    private homePage HomePage = new homePage();

    @Dado("^que el usuario  requiere buscar una palabra a la pagina Wikipedia$")
    public void queElUsuarioRequiereBuscarUnaPalabraALaPaginaWikipedia() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(HomePage));
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
    }


    @Cuando("^se el ingrese la \"([^\"]*)\" a la barra de busqueda$")
    public void seElIngreseLaALaBarraDeBusqueda(String palabra) {
        actor.wasAbleTo(
                fillSearchbar.ingresarPalabra(palabra)

        );
    }

    @Entonces("^el debe ver el titulo del articulo la palabra buscada$")
    public void seElDebeVerElArticuloDeLaPalabraBuscada() {
    actor.should(seeThat(the(TITLE1),isPresent()));


    }
}
