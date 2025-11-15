package Com.SeliniumAutomation.app.Alerts_Frames;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Alerts_Practice {
     @Description("Verify the alerts ")
        @Owner("DivakarThilak")
        @Link("https://letcode.in/alert")
        @Test
        public void test_alerts() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(chromeOptions);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.navigate().to("https://letcode.in/alert");
            //simple alert
          try{  driver.findElement(By.xpath("//button[@id='accept']")).click();
            driver.switchTo().alert().accept();
            //Dismiss the Alert & print the alert text
            driver.findElement(By.xpath("//button[@id='confirm']")).click();
           Alert alert =  driver.switchTo().alert();
         System.out.println(alert.getText());
         alert.dismiss();
         // promt
         driver.findElement(By.id("prompt")).click();
         Alert promt = driver.switchTo().alert();
         promt.sendKeys("Divakar Thilak");
         promt.accept();
         //sweet alert
         driver.findElement(By.xpath("//button[@id='modern']")).click();
         //driver.switchTo().alert();
         WebElement Sweet = driver.findElement(By.xpath("//p[@class='title']"));

         System.out.println(Sweet.getText()); }
          finally {
              driver.quit();
          }


}
    }

