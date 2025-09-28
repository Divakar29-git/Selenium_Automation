package Com.SeliniumAutomation.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_path {
    @Test
    public void Dp(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://awesomeqa.com/webtable.html");
       String firstpart = "//table[@id=\"customers\"]/tbody/tr[";
       String secondpart = "]/td[";
       String Thirdpart  = "]";

       int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
       int clo = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

       for (int i=2;i<=row;i++){
           for(int j=1;j<=clo;j++){
               String Dynamicpath = firstpart + i+ secondpart+j+Thirdpart;
               System.out.println(Dynamicpath);
               String data = driver.findElement(By.xpath(Dynamicpath)).getText();
               System.out.println(data);
           }


       }
        driver.quit();
    }
}
