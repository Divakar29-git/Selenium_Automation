package Com.SeliniumAutomation.app.Methods;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Methods {


        @Test

        @Owner("Divakar Thilak")
        @Link("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        public void verify_error_message() throws InterruptedException {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
           String title= driver.getTitle();
            System.out.println(title);

            //Assert.assertEquals(title,"Login - VWO");
           // String pagesource = driver.getPageSource();
            //System.out.println(pagesource);
            String handle = driver.getWindowHandle();
            System.out.println(handle);
           // Assert.assertEquals(handle,"ED78173BB1771CB1B609B537580A41C1");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[text() =\"OrangeHRM, Inc\"]")).click();
           String windows = driver.getWindowHandles().toString();
            System.out.println(windows);


        }
}

