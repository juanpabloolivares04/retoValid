package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class resultSearch {
    public static final Target TITLE1 = Target.the("LBL_TITULO").locatedBy("//h1[@id='firstHeading']");
    public static final Target TITLE2 = Target.the("LBL_SUBTITULO").locatedBy("//span[@id='Análisis_CEEM']");
}
