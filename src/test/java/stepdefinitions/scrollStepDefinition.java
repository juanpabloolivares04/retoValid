package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.example.tasks.fillSearchbar;
import org.example.tasks.scrollPage;
import org.example.userinterfaces.homePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.example.userinterfaces.resultSearch.TITLE1;
import static org.example.userinterfaces.resultSearch.TITLE2;

public class scrollStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Andrea");
    private homePage HomePage = new homePage();

    @Dado("^que el usuario requiere buscar una palabra al hacer scroll en la pantalla$")
    public void queElUsuarioRequiereBuscarUnaPalabraAlHacerScrollEnLaPantalla() {

        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(HomePage));
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

    }


    @Cuando("^se el usuario realice la busqueda del \"([^\"]*)\" cuando ingrese la \"([^\"]*)\" a la barra de busqueda$")
    public void seElUsuarioRealiceLaBusquedaDelCuandoIngreseLaALaBarraDeBusqueda(String palabra, String subtitulo) {
        actor.wasAbleTo(
                fillSearchbar.ingresarPalabra(palabra), scrollPage.scrollPage(subtitulo)
        );
    }

    @Entonces("^el debe ver en el articulo el subtitulo buscado$")
    public void elDebeVerEnElArticuloElSubtituloBuscado() {
        actor.should(seeThat(the(TITLE2),isPresent()));

    }

}
