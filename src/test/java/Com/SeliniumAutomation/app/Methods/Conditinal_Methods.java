package Com.SeliniumAutomation.app.Methods;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conditinal_Methods {
    @Test

    @Owner("Divakar Thilak")
    @Link("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    public void verify_error_message() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        boolean staatus = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println(staatus);

}
}
