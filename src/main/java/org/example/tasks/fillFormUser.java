package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.homePage.CREATEBUTTON;
import static org.example.userinterfaces.userCreate.*;

public class fillFormUser implements Task {
    String usuario, contrasena, email;
    public fillFormUser(List<String> info){

        this.usuario = info.get(0);
        this.contrasena = info.get(1);
        this.email = info.get(2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.keyValues(usuario).into(USUARIO),
                Enter.keyValues(contrasena).into(CONTRASENA),
                Enter.keyValues(contrasena).into(CONFIRM_CONTR),
                Enter.keyValues(email).into(EMAIL),
                Click.on(BOTONCREAR)

        );

    }
    public static fillFormUser ingresarDatos(List<String> info) {
        return instrumented(fillFormUser.class, info);
    }
}
