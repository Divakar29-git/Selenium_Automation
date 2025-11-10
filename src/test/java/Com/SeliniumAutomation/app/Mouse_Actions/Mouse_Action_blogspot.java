package Com.SeliniumAutomation.app.Mouse_Actions;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_blogspot {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void test_blogspot() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        Actions action = new Actions(driver);
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
      WebElement hover = driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
      WebElement double_click = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction1()\"]"));
        WebElement comboBox = driver.findElement(By.id("comboBox"));

        // Step 1: Scroll down to make all elements visible
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        // Step 2: Hover on the dropdown button
        action.moveToElement(hover).perform();
        Thread.sleep(1000);

        // Step 3: Click to open dropdown
        action.click(hover).perform();
        Thread.sleep(1000);

        // Step 4: Double click action
        action.moveToElement(double_click).doubleClick().perform();
        Thread.sleep(1000);

        // Step 5: Scroll to bottom input using keyboard + click inside
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comboBox);
        action.moveToElement(comboBox).click().perform();
        action.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
