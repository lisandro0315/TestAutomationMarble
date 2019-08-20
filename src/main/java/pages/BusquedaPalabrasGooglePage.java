package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BusquedaPalabrasGooglePage {

  public static void buscarPalabraGoogle(String palabraBusqueda, WebDriver driver) {
    WebElement txtPalabraBusqueda = driver.findElement(By.name("q"));
    txtPalabraBusqueda.sendKeys(palabraBusqueda, Keys.ENTER);
  }

  public static boolean obtenerPalabraRecomendada(String palabraRecomendada, WebDriver driver){
    WebElement lnkPalabraRecomendadaGoogle = driver.findElement(By.xpath("//p[@id='fprs']"));
    return lnkPalabraRecomendadaGoogle.getText().contains(palabraRecomendada);
  }

  public static boolean obtenerListaBusqueda(int totalListaResultados, WebDriver driver){
    WebElement lnkPalabraRecomendadaGoogle = driver.findElement(By.xpath("//p[@id='fprs']"));
    lnkPalabraRecomendadaGoogle.click();
    List<WebElement> lstResultados = driver.findElements(By.xpath("//div[@class='ellip']"));
    if(lstResultados.size()>= totalListaResultados)
      return true;
    else
      return false;
  }
}
