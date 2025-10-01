package Com.SeliniumAutomation.app.Demo_Projects.nopcommerce;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nopcommerce_Css_selector {
    @Owner("Divakarthilak")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user is able to login successfully")
    @Test
    public void selectlocatorsusingCssselector(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://demo.nopcommerce.com/login");
        //css selector using tag#id combination
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");

        //css selector using #id combination
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

        driver.findElement(By.cssSelector("button[type='submit']")).click();




    }

}
