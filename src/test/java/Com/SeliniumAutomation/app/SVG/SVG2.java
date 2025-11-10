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

import java.util.List;
import java.util.Objects;

public class SVG2 {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://www.amcharts.com/svg-maps/?map=india")
    @Test
    public void svg2() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        List<WebElement> state = driver.findElements(By.xpath("//div[@class=\"amcharts-chart-div\"]//*[name()= 'svg']//*[name()= 'g']//*[name()= 'g']//*[name()= 'g']//*[name()= 'path']"));
        System.out.println(state.size());
        for (WebElement states : state) {
            String label = states.getDomAttribute("aria-label");
            if (label != null) { // ✅ Null check added
                System.out.println(label);

                if (label.contains("West Bengal")) {
                    System.out.println("✅ Clicking on: " + label);
                    states.click();
                    break; //


                }

            }

        }
        driver.quit();
    }
}


