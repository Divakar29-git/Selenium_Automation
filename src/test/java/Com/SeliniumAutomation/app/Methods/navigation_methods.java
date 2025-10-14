package Com.SeliniumAutomation.app.Methods;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class navigation_methods {
    @Test

    @Owner("Divakar Thilak")
    @Link("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    public void testnavigation_methods(){
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        mywait.until(ExpectedConditions.titleIs("OrangeHRM"));
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))); // sync

        // Step 2: Navigate to EspoCRM
        driver.navigate().to("https://demo.us.espocrm.com/");
        mywait.until(ExpectedConditions.titleIs("EspoCRM Demo"));

        // Step 3: Back
        driver.navigate().back();
        System.out.println("After Back: " + driver.getCurrentUrl());

        // Step 4: Forward
        driver.navigate().forward();
        System.out.println("After Forward: " + driver.getCurrentUrl());

        // Step 5: Refresh
        driver.navigate().refresh();
        System.out.println("Page Refreshed");
       String hadles=  driver.getWindowHandles().toString();
        System.out.println( "Window hadles are " + hadles);


        // Step 6: Quit
        driver.quit();

}}
