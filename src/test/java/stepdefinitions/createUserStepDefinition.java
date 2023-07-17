package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.example.tasks.fillFormUser;
import org.example.userinterfaces.homePage;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.userinterfaces.homePage.CREATEBUTTON;

public class createUserStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private homePage HomePage = new homePage();
    @Dado("^que el usuario requiere llenar el formulario de creacion de usuario$")
    public void que_el_usuario_requiere_llenar_el_formulario_de_creacion_de_usuario() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(HomePage));
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
    }

    @Cuando("^el ingrese a la opcion de creacion de usuario$")
    public void el_ingrese_a_la_opcion_de_creacion_de_usuario() {
        actor.attemptsTo(Click.on(CREATEBUTTON));

    }

    @Cuando("^el ingresen los datos en el formulario$")
    public void el_ingresen_los_datos_en_el_formulario(List <String> info) {
        actor.wasAbleTo(fillFormUser.ingresarDatos(info));
    }

    @Entonces("^el ve un mensaje de validacion de captcha$")
    public void el_ve_un_mensaje_de_validacion_de_captcha() {
        //no logre capturar el popup
    }
}
