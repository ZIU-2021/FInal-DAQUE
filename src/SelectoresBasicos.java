import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectoresBasicos {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Ingresar a la pagina destino
        driver.get("https://facebook.com");
        //Ingresar campo email
        driver.findElement(By.id("email")).sendKeys("5617355774");
        //Ingresar contraseña
        driver.findElement(By.id("pass")).sendKeys("Darkamex1998*&");
        //Click al boton ¿olvidaste tu contraseña?
        //driver.findElement(By.linkText("¿Olvidaste tu contraseña?")).click();
        driver.findElement(By.name("login")).click();


    }
}
