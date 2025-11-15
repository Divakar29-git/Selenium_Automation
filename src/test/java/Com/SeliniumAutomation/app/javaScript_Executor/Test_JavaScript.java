package Com.SeliniumAutomation.app.javaScript_Executor;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_JavaScript {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void testjavaScript_Executor() {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://www.google.com/'");
        WebElement element = driver.findElement(By.xpath("//input[@class=\"gNO89b\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
