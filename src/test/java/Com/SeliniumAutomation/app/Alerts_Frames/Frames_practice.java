package Com.SeliniumAutomation.app.Alerts_Frames;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Frames_practice {


    @Description("Verify the checkbox is selected or not ")
    @Owner("DivakarThilak")
    @Link("https://the-internet.hackerearth.com/basic_auth")
    @Test
    public void Frames_practice() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://letcode.in/frame");
       WebElement Frame1= driver.findElement(By.xpath("//iframe[@src='frameui']"));
        driver.switchTo().frame(Frame1);
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Divakar");

       WebElement InnFrame = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
       driver.switchTo().frame(InnFrame);
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Divakarthilak334@");
        driver.switchTo().defaultContent();
    }
}