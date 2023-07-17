package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class homePage extends PageObject {
    public static final Target SEARCHBAR = Target.the("TXT_BUSQUEDA").locatedBy("//input[@id='searchInput']");
    public static final Target SEARCHBUTTON = Target.the("BTN_BUSQUEDA").locatedBy("//form[@id='searchform']//button");
    public static final Target TITLEHOME = Target.the("LBL_TITULO").locatedBy("//span[@id='h-Bienvenidos_a_Wikipedia,']");
    public static final Target CREATEBUTTON = Target.the("BTN_CREARCUENTA").locatedBy("//li[@id='pt-createaccount-2']");
}
