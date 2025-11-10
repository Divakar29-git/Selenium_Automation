package Com.SeliniumAutomation.app.Mouse_Actions;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Tese_Keyboard_events {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://awesomeqa.com/practice.html")
    @Test
    public void test_keyboard_events(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
      driver.navigate().to("https://awesomeqa.com/practice.html");
        WebElement input= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(input,"divakar").keyUp(Keys.SHIFT).build().perform();
driver.close();


    }
}
