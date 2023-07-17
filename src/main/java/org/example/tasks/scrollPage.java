package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.resultSearch.TITLE2;

public class scrollPage implements Task {

    private String subtitulo;
    public scrollPage(String subtitulo){
        this.subtitulo = subtitulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TITLE2));

    }
    public static scrollPage scrollPage(String subtitulo) {
        return instrumented(scrollPage.class, subtitulo);
    }
}
