package Com.SeliniumAutomation.app.Alerts_Frames;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alert_withexplicitwait {

    @Description("Verify the checkbox is selected or not")
    @Owner("DivakarThilak")
    @Link("https://the-internet.hackerearth.com/javascript_alerts")
    @Test
    public void Testtoverifycheckbox() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.hackerearth.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        driver.quit();
    }
}
