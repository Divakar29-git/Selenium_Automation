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

public class SVG3 {
    @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void svg3() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> svgShapes = driver.findElements(By.xpath(
                "//*[name()='svg']/*[name()='circle' or name()='rect' or name()='polygon']"
        ));

        System.out.println("Total SVG shapes found: " + svgShapes.size());

        for (WebElement shape : svgShapes) {
            String tag = shape.getTagName();
            String fill = shape.getAttribute("fill"); // color
            String stroke = shape.getAttribute("stroke"); // border color (optional)

            System.out.println("Shape: " + tag + " | Fill Color: " + fill + " | Stroke: " + stroke);


        }
    }

}
