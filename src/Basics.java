import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Basics {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Abrir URL ingresada
        driver.get("http://google.com");

        //Obtener el nombre de la pagina
        System.out.print("El titulo de la pagina es: "+driver.getTitle());

        //Validar que la URL que abrio sea la correcta
        System.out.println("La URL mostrada es: "+driver.getCurrentUrl());

        //Obtener código fuente de la pagina
        System.out.println(driver.getPageSource());

    }
}