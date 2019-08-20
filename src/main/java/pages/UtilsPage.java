package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilsPage {
    private WebDriver driver;

    public  WebDriver abrirnavegador(String pagina){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(pagina);
        return driver;
    }

    public void cerrarNavegador(){
        driver.close();
    }
}
