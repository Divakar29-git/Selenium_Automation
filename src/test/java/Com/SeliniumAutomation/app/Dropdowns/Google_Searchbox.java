package Com.SeliniumAutomation.app.Dropdowns;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Google_Searchbox {
    @Description("Verify the dropdown is selected or not ")
        @Owner("DivakarThilak")
        @Link("https://testautomationpractice.blogspot.com/")
        @Test
        public <list> void test_Google_Searchbox() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selinium");
        Thread.sleep(2000);
       List<WebElement> list =  driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));

     System.out.println(list.size());
        for (WebElement webElement : list) {
            System.out.printf(webElement.getText());
            if (webElement.getText().equals("Selinium")) {
                webElement.click();
                break;
            }
        }


        }
    }

