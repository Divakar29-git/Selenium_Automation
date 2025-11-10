package Com.SeliniumAutomation.app.Screenshots_of_testcases;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.PanelUI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_Screenshots {
    @Test
    public void testScreenshote() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
        //file
        /*File screenshotAs= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destnation = new File("C:\\Users\\JakkaThilak\\IdeaProjects\\Selenium_Automation\\src\\test\\Screenshots\\testscreenshots1.jpg");
        FileUtils.copyFile(screenshotAs , destnation);
        System.out.println("Screensot saved sucessfully");
        driver.quit();*/
        //byteArray
        byte[] byteArray = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        File destnation = new File("C:\\Users\\JakkaThilak\\IdeaProjects\\Selenium_Automation\\src\\test\\Screenshots\\testscreenshots1.jpg");
        FileOutputStream fos = new FileOutputStream(destnation);
        fos.write(byteArray);
        System.out.println("Screensot saved sucessfully");
        driver.quit();



    }
}
