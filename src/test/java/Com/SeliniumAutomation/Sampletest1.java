package Com.SeliniumAutomation;

import Utills.Commont_o_all;
import com.google.common.base.Verify;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sampletest1 extends Commont_o_all {

    @Test
    public void test_login_VWO() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        openbrowser(driver,"https://app.vwo.com/");



        driver.findElement(By.id("login-username")).sendKeys("Divakarthilak334@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Divakar123");
        closebrowser(driver);
    }

    }

