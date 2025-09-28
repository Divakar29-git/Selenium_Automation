package Com.SeliniumAutomation.app;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class vmo_Project_2 {
    @Test

    @Owner("Divakar Thilak")
    @Link("https://app.vwo.com/")
    public void verify_error_message() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://app.vwo.com/");

        driver.findElement(By.id("login-username")).sendKeys("Admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(5000);

       WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message);
        String Actulaerror = error_message.getText();
        Assert.assertEquals("Your email, password, IP address or location did not match", Actulaerror);
driver.quit();



    }




}

