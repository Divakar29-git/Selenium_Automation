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

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.List;

public class EX_Alerts_frames {
    @Description("Verify the checkbox is selected or not ")
    @Owner("DivakarThilak")
    @Link("https://the-internet.hackerearth.com/javascript_alerts")
    @Test
    public void Testtoverifycheckbox() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.navigate().to("https://the-internet.hackerearth.com/javascript_alerts");
      driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
      driver.switchTo().alert().accept();
        WebElement messge = driver.findElement(By.id("result"));
        String text = messge.getText();
        System.out.println(text);
      //if alerts has 2 buttons
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        //giving promt in allert
        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
        Alert  promt = driver.switchTo().alert();
        promt.sendKeys("Divakar thilak");
        promt.accept();
        WebElement promtmessage  = driver.findElement(By.id("result"));
        String message  = promtmessage.getText();
        System.out.println(message);
       if(message.contains("Divakar thilak")) {
           System.out.println("test case is passed");
       }
       else {
           System.out.println("test case is failed");
       }

       }


        }




