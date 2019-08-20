package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.BusquedaPalabrasGooglePage;
import pages.UtilsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BusquedaPalabrasGoogleStep extends ScenarioSteps {

  private WebDriver driver;

  @Page
  UtilsPage utilsPage = new UtilsPage();
  @Page
  BusquedaPalabrasGooglePage buscarPalabraGoogle;

  @Step
  public void ingresarEnBuscadorGoogle(String pagina){
    driver = utilsPage.abrirnavegador(pagina);
  }

  @Step
  public void realizarBusquedaDePalabra(String palabraBusqueda) {
    buscarPalabraGoogle.buscarPalabraGoogle(palabraBusqueda, driver);
  }

  @Step
  public void VerificarResultadoObtenido(String palabraRecomendada) {
    boolean result = buscarPalabraGoogle.obtenerPalabraRecomendada(palabraRecomendada, driver);
    assertThat("La palabra " + palabraRecomendada + " no fue encontrada", result, is(true));
  }

  @Step
  public void VerificarListaDeResultados(int totalListaResultados) {
    boolean result =  buscarPalabraGoogle.obtenerListaBusqueda(totalListaResultados, driver);
    assertThat("La lista de resultados es menor a  " + totalListaResultados, result, is(true));
    utilsPage.cerrarNavegador();
  }
}
