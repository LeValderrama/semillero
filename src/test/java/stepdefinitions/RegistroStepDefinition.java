package stepdefinitions;

import com.alkomprar.steps.HomeStep;
import com.alkomprar.steps.InicioSesionStep;
import com.alkomprar.steps.RegistroStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistroStepDefinition {
    @Steps
    HomeStep homeStep;
    @Steps
    RegistroStep registroStep;

    @Steps
    InicioSesionStep inicioSesionStep;

    @Dado("^que debe abrir el navegador e ingresar a la pagina$")
    public void queDebeAbrirElNavegadorEIngresarALaPagina() {
        homeStep.abrirPagina();
    }


    @Cuando("^el usuario diligencie los datos para el registro$")
    public void elUsuarioDiligencieLosDatosParaElRegistro() throws IOException {
        registroStep.iniciarRegistro();
        inicioSesionStep.enviarCorreo();
        registroStep.diligenciarDatos();
    }

    @Entonces("^se valida que el registro fue exitoso$")
    public void seValidaQueElRegistroFueExitoso() {
        registroStep.validarMensaje();
    }
}
