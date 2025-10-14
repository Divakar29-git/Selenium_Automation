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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test_selectdropdown {
    @Description("Verify the dropdown is selected or not ")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void TesttocheckAutheticate_URL() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        WebElement dropdown = driver.findElement(By.xpath("(//select[@id='country'])"));
      try {
          Select country = new Select(dropdown);

          //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          // country.selectByVisibleText("France");
          // country.selectByContainsVisibleText("Kingdom");
          country.selectByValue("germany");
          List<WebElement> options = country.getOptions();
          System.out.println(options.size());
          /*for (int i = 0; i < options.size(); i++) {
              System.out.println(options.get(i).getText());
          }*/
          // enhanced for loop
          for(WebElement option:options){
              System.out.println(option.getText());
          }
      }
      finally {
          driver.quit();
      }

}
}
