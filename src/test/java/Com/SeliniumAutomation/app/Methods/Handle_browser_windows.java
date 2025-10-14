package Com.SeliniumAutomation.app.Methods;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Handle_browser_windows {
    @Test

    @Owner("Divakar Thilak")
    @Link("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    @Description("verify the Window hadles")
    public void test_to_windowHandles(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-Maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        mywait.until(ExpectedConditions.titleIs("OrangeHRM"));
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.xpath("//a[text() = \"OrangeHRM, Inc\"]")).click();

       Set<String> handles = driver.getWindowHandles();

        List<String> windowlist = new ArrayList<>(handles);
        String  parentwindow= windowlist.get(0);
        String childwindow = windowlist.get(1);



      //  System.out.println(parentwindow + "-----" + childwindow);


    }
}
