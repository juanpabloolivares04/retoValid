package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class userCreate {

    public static final Target USUARIO = Target.the("TXT_USUARIO").locatedBy("//input[@id='wpName2']");
    public static final Target CONTRASENA = Target.the("TXT_CONTRASENA").locatedBy("//input[@id='wpPassword2']");
    public static final Target CONFIRM_CONTR = Target.the("TXT_CONFIRMAR_CONTRASENA").locatedBy("//input[@id='wpRetype']");
    public static final Target EMAIL = Target.the("TXT_CORREO_ELECTRONICO").locatedBy("//input[@id='wpEmail']");
    public static final Target BOTONCREAR = Target.the("BTN_CREAR").locatedBy("//button[@id='wpCreateaccount']");
}
