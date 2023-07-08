package com.alkomprar.pageobjects.registrousuario;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.alkomprar.com/")
public class PaginaInicialPage extends PageObject {
    By btnMiCuenta = By.id("js-myaccount-header");

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }

}
