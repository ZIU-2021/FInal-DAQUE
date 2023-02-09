import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Selectores_xpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Ingresar a la pagina destino
        driver.get("https://rahulshettyacademy.com/#/index");

        System.out.println(driver.findElement(By.xpath("//*[text()='Wide coverage of topics like Selenium, Appium, Cucumber BDD, Cypress, Protractor, RestAPI, SoapUI and JMeter etc.']")));



/*
        //Encontrando por xpath
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("5617355774");
        //Encontrando por CSS Selector
        //driver.findElement(By.cssSelector("#email")).sendKeys("5617355774 Nuevo");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Prueba123");

        //*[@id="content"]/div/div/div/div[1]/h2
        //*[@id="content"]/div/div/div/div[1]/h2/text()
        //h2[@class='_8eso']
        System.out.println("El texto es: "+driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());

        //Hacer click en un boton con un xpath dinamico
        //driver.findElement(By.xpath("//*[contains(@id, 'u_0_5')]")).click();

        //driver.close();
 */


    }
}
