package Com.SeliniumAutomation.app.Webtables;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Static_Webtable {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void validate_ststic_webtable() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath(""));


}
}
