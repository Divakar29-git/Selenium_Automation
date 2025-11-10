package Com.SeliniumAutomation.app.SVG;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class test_SVG {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void testSVG()
    {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to ("https://www.flipkart.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Search product
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("macbook air m4");

        // Click the SVG search icon
        WebElement svgSearch = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")));
        //normal //button//svg won’t work properly with SVGs,
       // so using *[name()='svg'] is the correct and standard way to select SVG tags in XPath.
        svgSearch.click();

        // Wait for product results
        List<WebElement> macbooks = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//div[contains(@class, 'KzDlHZ')]")));

        System.out.println("Total MacBooks found: " + macbooks.size());

        for (WebElement item : macbooks) {
            System.out.println(item.getText());
        }

    }



    }

