package Com.SeliniumAutomation.app.Practice;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooklogin {
      @Description("to validate auto-suggest dropdown")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void validate_facebook_createaccount() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
          WebDriver driver = new ChromeDriver(options);
          driver.get("https://www.facebook.com/");
          driver.findElement(By.linkText("Create new account")).click();
          Thread.sleep(2000);
          driver.findElement(By.name("firstname")).sendKeys("Jakay");
          driver.findElement(By.name("lastname")).sendKeys("Jakay");
          driver.findElement(By.xpath("//select[@id=\"day\"]//option[25]")).click();
          driver.findElement(By.xpath("//select[@id=\"month\"]//option[12]")).click();
          driver.findElement(By.xpath("//select[@id=\"year\"]")).sendKeys("1998");
          driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@id=\"u_0_h_Bj\"]")).sendKeys("9985614055");
          driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("divakar@123");
          driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}}

