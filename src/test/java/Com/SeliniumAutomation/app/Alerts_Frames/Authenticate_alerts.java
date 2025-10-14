package Com.SeliniumAutomation.app.Alerts_Frames;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Authenticate_alerts {

    @Description("Verify the checkbox is selected or not ")
    @Owner("DivakarThilak")
    @Link("https://the-internet.hackerearth.com/basic_auth")
    @Test
    public void TesttocheckAutheticate_URL() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //syntax for Authenticate Users
        //https://username:password@the-internet.hackerearth.com/basic_auth
        try{driver.navigate().to("https://admin:admin@the-internet.hackerearth.com/basic_auth");
            By text =By.xpath("//p[contains(text(), 'Congratulations! You must have the')]");
         wait.until(ExpectedConditions.visibilityOfElementLocated(text));

         String actualText = text.toString().trim();

        Assert.assertTrue("Expected success message to contain correct text",
                actualText.contains("Congratulations! You must have the proper credentials"));
        } finally {
            driver.quit();
        }

    }
}

