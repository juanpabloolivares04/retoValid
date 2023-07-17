package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.homePage.*;

public class fillSearchbar implements Task {

    private String palabra;
    public fillSearchbar(String palabra){
        this.palabra = palabra;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(palabra).into(SEARCHBAR),
                Click.on(SEARCHBUTTON)
        );

    }
    public static fillSearchbar ingresarPalabra(String palabra) {
        return instrumented(fillSearchbar.class, palabra);
    }
}
