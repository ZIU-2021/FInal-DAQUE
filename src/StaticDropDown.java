import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.sql.SQLOutput;

public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        WebElement WEstaticDropdown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select staticDropdown = new Select(WEstaticDropdown);
        driver.manage().window().maximize();

        staticDropdown.selectByVisibleText("USD");
        Thread.sleep(2000);
        staticDropdown.selectByIndex(2);

    }
}
