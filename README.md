# TestAutomationMarble

Precondiciones:
- Gradle versión 5.5 o superior
- Java 1.8 o superior
- IntelliJ IDEA (Opcional)
- El Proyecto fue implementado en un ambiente linux (Ubuntu) por lo cual la versión del chromedriver es para linux en la versión del navegador google 76, si se va a ejecutar en un ambiente windows es necesario descargar el chromedriver correspondiente a la versión de google chrome instalada, adicionalmente es muy importante ir a al archivo de la clase src/main/java/pages/UtilsPage.java y adicional el .exe al chromedriver, quedando así  *System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

1- Luego de descargar el proyecto se realiza la importación mediante el archivo gradle.
2- Cuando el proyecto ha cargado el Ide de desarrollo se ejecuta mendiante terminal con el comando Gradle clean test aggregate, esto con el fin de que se ejecuten el runner y cree el reporte de SerenityBBD.
3- En la el directorio target/site/serenity se encuentra un archivo llamado index.html el cual se abre con el navegador preferido y muestra el reporte de SerenityBDD
