package com.alkomprar.steps;

import com.alkomprar.pageobjects.registrousuario.PaginaInicialPage;
import com.alkomprar.pageobjects.registrousuario.RegistroPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import utils.ExtraerDatosExcel;
import utils.Scroll;

import java.io.IOException;

public class RegistroStep {
    PaginaInicialPage paginaInicialPage;
    RegistroPage registroPage;
    Scroll scroll;
    ExtraerDatosExcel datosExcel = new ExtraerDatosExcel();
    static final String LIBRO_REGISTRO = "Registro";
    static final String EXCEL = "DatosReto.xlsx";

    @Step
    public  void iniciarRegistro(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getBtnMiCuenta()).click();
    }
    @Step
    public  void diligenciarDatos() throws IOException {
        registroPage.getDriver().findElement(registroPage.getTxtNombre()).sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 1));
        registroPage.getDriver().findElement(registroPage.getTxtApellidos()).sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 2));
        registroPage.getDriver().findElement(registroPage.getTxtTelefono()).sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 3));
        scroll.scroll();
        registroPage.getDriver().findElement(registroPage.getChkAutorizar()).click();
        registroPage.getDriver().findElement(registroPage.getBtnContinuar()).click();
    }

    @Step
    public void validarMensaje(){
            paginaInicialPage.getDriver().findElement(paginaInicialPage.getBtnMiCuenta()).click();
            Assert.assertThat(registroPage.getDriver().findElement(registroPage.getMsjMiCuenta())
                    .isDisplayed(), Matchers.is(true));

    }
}

