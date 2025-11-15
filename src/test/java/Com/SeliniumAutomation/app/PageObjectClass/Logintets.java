package Com.SeliniumAutomation.app.PageObjectClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Logintets {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void Logintets(){
        Login_PageFactory lp = new Login_PageFactory(driver);
        lp.username("Admin");
        lp.Pwd("admin123");
        lp.Login();


    }
    @AfterClass
    public static void tearDown(){
        driver.quit();

    }
}
