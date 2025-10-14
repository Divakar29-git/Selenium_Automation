package Com.SeliniumAutomation.app.Methods;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Handle_browser_windows_1 {
    @Test

    @Owner("Divakar Thilak")
    @Link("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    @Description("verify the Window hadles")
    public void test_to_windowHandles(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-Maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        driver.findElement(By.xpath("//a[text() = \"OrangeHRM, Inc\"]")).click();

       Set<String> handles = driver.getWindowHandles();

       /* List<String> windowlist = new ArrayList<>(handles);
        String  parentwindow= windowlist.get(0);
        String childwindow = windowlist.get(1);



      System.out.println(parentwindow + "-----" + childwindow);
      driver.switchTo().window(childwindow);
        System.out.println("child window title is " + driver.getTitle());
        driver.switchTo().window("parent window title is " + parentwindow);
        System.out.println(driver.getTitle());*/
        //approch2
      for(String windid : handles){
          String title =driver.switchTo().window(windid).getTitle();

          if(title.equals("OrangeHRM")){
              System.out.println(driver.getCurrentUrl());
          }
      }

    }
}
