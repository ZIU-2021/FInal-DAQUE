import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;


public class Final {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1.- Acceder al sitio https://demowebshop.tricentis.com/electronics y dar clic al link de Log in
        driver.get("https://demowebshop.tricentis.com/electronics");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
        //Tomar SS
        Thread.sleep(1000);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss1.jpg"));

        //2.-Ingresar el email, el Password y dar clic en el botón Log in (aldo.ibanez21@gmail.com / Prueba1234)
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("aldo.ibanez21@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prueba1234");
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss2.jpg"));

        //3.- Dar clic al menú APPAREL & SHOES
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[4]/a[1]")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss3.jpg"));

        //4.- Seleccionar el producto Blue Jeans
        driver.findElement(By.xpath("//div[@class='item-box']/following-sibling::div[2]")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss4.jpg"));

        //5.- Agregar la cantidad de 5 pantalones y dr clic en el botón "Add to cart"
        driver.findElement(By.xpath("//input[@id='addtocart_36_EnteredQuantity']")).clear();
        driver.findElement(By.xpath("//input[@id='addtocart_36_EnteredQuantity']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-36']")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss5.jpg"));

        //6.- Validar que apareza el mensaje "The product has been added to your shopping cart", (revisar el video de Assetions)
        Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='bar-notification']")).isEnabled());
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss6.jpg"));

        //7.- Dar clic al Link de Shopping cart
        driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss7.jpg"));

        //8.- Marcar la opción de acuerdo con los terminos y condiciones y dar clic en el botón "checkout"
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss8.jpg"));

        //9.- Billing Addres capturar la información de dirección y dar clic en el botón continuar
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("Capgemini");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Mexico");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Almendros 31");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("Interior 8");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("11111");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("1122334455");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("1234567");
        WebElement WEstaticDropdown = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        Select staticDropdown = new Select(WEstaticDropdown);
        staticDropdown.selectByVisibleText("United States");
        driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button']")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss9.jpg"));


        //10.- Shipping Address dar clic en el botón continiuar
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss10.jpg"));

        //11.-Shipping Method seleccionar la opción de "Ground (10.00)" y dar clic en el botón continuar
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='shippingoption_0']")).click();
        driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss11.jpg"));

        //12.-Payment Method seleccionar la opción de Tarjeta de Crédito y dar clic en el botón continuar
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='paymentmethod_2']")).click();
        driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss12.jpg"));

        //13.-Payment Information capturar todos los datos solicitados y dar clic en el botón continuar
        //(TDC: 5482340924944396)
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='CardholderName']")).sendKeys("Aldo Ibanez");
        driver.findElement(By.xpath("//input[@id='CardNumber']")).sendKeys("5482340924944396");
        driver.findElement(By.xpath("//input[@id='CardCode']")).sendKeys("123");
        driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss13.jpg"));

        //14.-Confirm Order
        //	Validar que los valores que aparecen en el apartado de Paymment method y Shipping methos
        //	sean los mismos que seleccionamos en las secciones anteriores
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[2]")).getText().contentEquals("Aldo Ibanez"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[3]")).getText().contentEquals("Email: aldo.ibanez21@gmail.com"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[4]")).getText().contentEquals("Phone: 1122334455"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[5]")).getText().contentEquals("Fax: 1234567"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[6]")).getText().contentEquals("Capgemini"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[7]")).getText().contentEquals("Almendros 31"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[8]")).getText().contentEquals("Interior 8"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[9]")).getText().contentEquals("Mexico , 11111"));
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='billing-info']/li[10]")).getText().contentEquals("United States"));
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Ground')]")).getText().contentEquals("Ground"));
        //	Validar que la suma del sub-Total + Shipping+ Tax = Total
            Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'15.00')]")).getText().contentEquals("15.00"));
        //	Dar clic al botón "confirm"
        driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']//input")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss14.jpg"));

        //15.-Validar que aparezca el mensaje Your order has been successfully processed!"" y dar clic al botón continuar
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='title']//strong")).getText().contentEquals("Your order has been successfully processed!"));
        driver.findElement(By.xpath("//div[@class='buttons']/input")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss15.jpg"));

        //16.- Dar clic en Log out
        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
        //Tomar SS
        Thread.sleep(1000);
        src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("Screnshots\\ss16.jpg"));
    }
}
