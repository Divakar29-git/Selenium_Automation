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

public class Frames {


        @Description("Verify the checkbox is selected or not ")
        @Owner("DivakarThilak")
        @Link("https://the-internet.hackerearth.com/basic_auth")
        @Test
        public void Frames() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(chromeOptions);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //frame1
            driver.navigate().to("https://ui.vision/demo/webtest/frames/");
            try{
            WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
            driver.switchTo().frame( frame1);
            driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
            driver.switchTo().defaultContent();
            //frame2
            WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");
            driver.switchTo().defaultContent();
            //frame3
            WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
            driver.switchTo().frame(frame3);
            driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome");
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();}
            finally {
                driver.quit();
            }


        }
}

