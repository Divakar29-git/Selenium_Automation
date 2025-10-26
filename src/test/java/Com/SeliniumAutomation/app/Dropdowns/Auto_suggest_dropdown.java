package Com.SeliniumAutomation.app.Dropdowns;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Auto_suggest_dropdown {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void validate_auto_suggest_dropdown() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
        driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        By resultsLocator = By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(resultsLocator));

        // Get all the result elements
        List<WebElement> searchList = driver.findElements(resultsLocator);
        System.out.println("Number of search results: " + searchList.size());

        for (WebElement webElement : searchList) {
            System.out.println(webElement.getText());
            if (webElement.getText().equals("Selenium dioxide")) {
                System.out.println(webElement.getText());
                System.out.println("123455");
                Thread.sleep(2000);
                webElement.click();
                //driver.webElement.click();
                Thread.sleep(2000);
                break;
            }
        }
       // driver.findElement(By.xpath("//a[contains(text(), 'Selenium dioxide')]")).click();

    }

}
