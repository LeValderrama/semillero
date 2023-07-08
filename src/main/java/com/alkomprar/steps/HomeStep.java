package com.alkomprar.steps;

import com.alkomprar.pageobjects.registrousuario.PaginaInicialPage;
import net.thucydides.core.annotations.Step;

public class HomeStep {
    PaginaInicialPage homePage;
@Step
    public void abrirPagina() {
    homePage.open();
    }

}
