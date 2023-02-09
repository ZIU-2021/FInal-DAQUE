import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownButtons {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

    }
}
