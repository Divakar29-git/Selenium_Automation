package Com.SeliniumAutomation.app.Mouse_Actions;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Test_MouseActions {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://www.spicejet.com/")
    @Test
    public void test_MouseActions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.spicejet.com/");
       WebElement source = driver.findElement(By.xpath("//*[@data-testid=\"to-testID-origin\"]/div/div/input"));
       WebElement destination = driver.findElement(By.xpath("//*[@data-testid=\"to-testID-destination\"]/div/div/input"));
        Actions action = new Actions(driver);
        action.moveToElement(source).click().sendKeys("BLR").moveToElement(destination).click().sendKeys("Del").build().perform();




    }
}
