package Com.SeliniumAutomation.app.Demo_Projects.Katlon_Orange;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Katalon_Practice2 {
    @Owner("DivakarThila")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verfy the text of displayed on website")
    @Link("https://katalon-demo-cura.herokuapp.com/profile.php#login")
    @Test
    public void verify_text() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.findElement(By.cssSelector("input[name= 'username']")).sendKeys("John Doe");

        driver.findElement(By.cssSelector("#txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.cssSelector("#btn-login")).click();
        Thread.sleep(3000);
        WebElement h2 = driver.findElement(By.xpath("//h2[text()= 'Make Appointment']"));
        System.out.println(h2.getText());
        Assert.assertEquals("Make Appointment",h2.getText());


    }
}
