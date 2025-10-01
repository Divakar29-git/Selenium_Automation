package Com.SeliniumAutomation.app.Demo_Projects.VWO;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VWO_Practice1 {
    @Test
    public void to_Verify_the_Wrongmail_text() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/");

        WebElement Linktext = driver.findElement(By.linkText("Start a free trial"));
        Linktext.click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
        WebElement fill = driver.findElement(By.id("page-v1-step1-email"));
        fill.sendKeys("112334");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
        driver.findElement(By.tagName("button")).click();
        WebElement errormeassage = driver.findElement(By.className("invalid-reason"));
        System.out.println(errormeassage);
        Assert.assertEquals(errormeassage.getText(), "The email address you entered is incorrect.");
        Thread.sleep(5000);
        driver.close();




    }


    }

