package Com.SeliniumAutomation.app.Demo_Projects.Katlon_Orange;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class katalon_demo_Practice {
    @Test
    public  void Verifytitle() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/", driver.getCurrentUrl());
        System.out.println("----------------");

        System.out.println(driver.getTitle());
        Assert.assertEquals("CURA Healthcare Service", driver.getTitle());

        System.out.println("----------------");
        System.out.println(driver.getPageSource());

       if (driver.getPageSource().contains("CURA Healthcare Services")) {
            System.out.println("test is passed");
            Assert.assertTrue(true);
        } else {
            {
                System.out.println("test is failed");
                Assert.assertFalse(false);
            }
            driver.quit();


        }
    }}


