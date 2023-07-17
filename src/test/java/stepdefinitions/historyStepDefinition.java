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
import static org.example.userinterfaces.historyPage.LISTRB;
import static org.example.userinterfaces.homePage.*;

public class historyStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private homePage HomePage = new homePage();
    @Dado("^que el usuario desea ingresar al historial$")
    public void queElUsuarioDeseaIngresarAlHistorial() {
        // Write code here that turns the phrase above into concrete actions
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(HomePage));
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
    }


    @Cuando("^selecciona el boton de historial$")
    public void seleccionaElBotonDeHistorial() {
        actor.attemptsTo(Click.on(HISTORYBUTTON));

    }

    @Entonces("^Se debe mostrar la lista con radio buttons para comparar$")
    public void seDebeMostrarLaListaConRadioButtonsParaComparar() {
        actor.should(seeThat(the(LISTRB),isPresent()));

    }

    @Cuando("^el seleccione dos radio button realizar la comparacion$")
    public void elSeleccioneDosRadioButtonRealizarLaComparacion() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Entonces("^el debe ver los campos de texto de la revision comparadas$")
    public void elDebeVerLosCamposDeTextoDeLaRevisionComparadas() {
        // Write code here that turns the phrase above into concrete actions

    }
}
