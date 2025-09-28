package Utills;

import org.openqa.selenium.WebDriver;

public class Commont_o_all {
    public WebDriver driver;
    public void openbrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();

    }
    public void closebrowser(WebDriver driver){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        this.driver.quit();
    }
}
