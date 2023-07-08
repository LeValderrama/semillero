package com.alkomprar.steps;

import com.alkomprar.pageobjects.registrousuario.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import utils.ExtraerDatosExcel;

import java.io.IOException;

public class InicioSesionStep {
    ExtraerDatosExcel datosExcel = new ExtraerDatosExcel();
    static final String LIBRO_REGISTRO = "Registro";
    static final String EXCEL = "DatosReto.xlsx";

InicioSesionPage inicioSesionPage;
@Step
    public  void enviarCorreo() throws IOException {
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtEmail()).sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 0));
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnContinuar()).click();
}

}

