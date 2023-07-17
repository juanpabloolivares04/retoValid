package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.example.userinterfaces.homePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.example.userinterfaces.homePage.*;

public class mobileDesktopDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private homePage HomePage = new homePage();
    @Dado("^que el usuario desea ingresar a las versiones de la pagina$")
    public void queElUsuarioDeseaIngresarALasVersionesDeLaPagina() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(HomePage));
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
    }


    @Cuando("^selecciona el modo movil$")
    public void seleccionaElModoMovil() {
        actor.attemptsTo(Click.on(MOBILEBUTTON));
    }

    @Entonces("^el debe ver el titulo de bienvenida y cambio de tamaño de la pagina$")
    public void elDebeVerElTituloDeBienvenidaYCambioDeTamañoDeLaPagina() {
        actor.should(seeThat(the(TITLEHOME),isPresent()));
    }

    @Cuando("^seleccione el modo escritorio para volver$")
    public void seleccioneElModoEscritorioParaVolver() {
        actor.attemptsTo(Click.on(DESKTOPBUTTON));
    }

    @Entonces("^el debe ver el titulo de bienvenida antes de seleccionar el movil$")
    public void elDebeVerElTituloDeBienvenidaAntesDeSeleccionarElMovil() {
        actor.should(seeThat(the(TITLEHOME),isPresent()));
    }
}
