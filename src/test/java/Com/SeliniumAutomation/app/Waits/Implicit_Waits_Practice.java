package Com.SeliniumAutomation.app.Waits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class Implicit_Waits_Practice {
    public static void main(String[] args) {
        ChromiumDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://app.vwo.com/");

    }
}
