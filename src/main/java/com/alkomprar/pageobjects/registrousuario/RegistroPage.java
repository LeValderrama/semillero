package com.alkomprar.pageobjects.registrousuario;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RegistroPage extends PageObject {

    By txtNombre = By.id("register.firstName");
    By txtApellidos = By.id("register.lastName");
    By txtTelefono = By.id("register.mobileNumber");
    By chkAutorizar = By.xpath("//label[@for='registerChkTermsConditions']");
    By btnContinuar = By.xpath("(//button[contains(text(), 'Continuar')])[1]");
    By msjMiCuenta = By.xpath("//div[contains(text(), 'Mi cuenta')]");

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellidos() {
        return txtApellidos;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getChkAutorizar() {
        return chkAutorizar;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
    public By getMsjMiCuenta() {
        return msjMiCuenta;
    }



}
