package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;
import steps.BusquedaPalabrasGoogleStep;

public class BusquedaPalabrasGoogleDefinition {

  @Steps
  BusquedaPalabrasGoogleStep busquedaPalabrasGoogleStep;

  @Dado("^que ingrese al motor de búsqueda Google (.*)$")
  public void ingresarEnMotorDeBusquedaGoogle(String url) throws Exception{
    busquedaPalabrasGoogleStep.ingresarEnBuscadorGoogle(url);
  }

  @Cuando("^cuando ejecuto la búsqueda de la palabra (.*)$")
  public void realizarBusquedaDePalabraEnGoogle(String palabraBusqueda){
    busquedaPalabrasGoogleStep.realizarBusquedaDePalabra(palabraBusqueda);
  }

  @Entonces("el motor de búsqueda  google me muestra la palabra correcta (.*)")
  public void ObtenerPalabraCorrectaDeBusqueda(String palabraRecomendada) {
    busquedaPalabrasGoogleStep.VerificarResultadoObtenido(palabraRecomendada);
  }

  @Y("^el link de la palabra correcta carga la búsqueda con una cantidad de resultados mayor a (.*)$")
  public void ObtenerResultadosDeBusqueda(int totalListaResultados){
    busquedaPalabrasGoogleStep.VerificarListaDeResultados(totalListaResultados);
  }
}
