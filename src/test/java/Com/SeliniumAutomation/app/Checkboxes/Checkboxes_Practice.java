package Com.SeliniumAutomation.app.Checkboxes;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.List;

public class Checkboxes_Practice {
    @Description("Verify the checkbox is selected or not ")
    @Owner("DivakarThilak")
    @Link("https://testautomationpractice.blogspot.com/")
    @Test
    public void Testtoverifycheckbox() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-Maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        //WebElement Checkbox=driver.findElement(By.cssSelector("#sunday"));
        //System.out.println("Checkbox is selected?"+ Checkbox.isSelected());
        //Checkbox.click();
        //boolean Checkbookselected = Checkbox.isSelected();
        // Assert.assertTrue(String.valueOf(Checkbookselected), true);
        //System.out.println("Checkbox is selected?"+ Checkbox.isSelected());
        //capturng all checkboxes
        List<WebElement> Checkboxs = driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));

        System.out.println("No.of Checkboxes" + Checkboxs.size());
        /*//Selecting all the check boxes
        for(int i = 0; i<Checkboxs.size(); i++ ){
            Checkboxs.get(i).click();
        }*/
        //enhanced for loop
       /* for(WebElement Check:Checkboxs){
            Check.click();


            System.out.println(Check.isDisplayed());

        }*/
        // select last 3 checkboxes
        //total no.of checkboxes- how many check boxes we need to select == starting index
        //Selecting all the check boxes
        for (int i =0; i<3;i++ ){
         WebElement checkbox =    Checkboxs.get(i);
         checkbox.click();
            System.out.println(i);
            String checkboxId = checkbox.getAttribute("id");
            WebElement label = driver.findElement(By.xpath("//label[@for='" + checkboxId + "']"));
            String checkboxName = label.getText();
            System.out.println("Selected Checkbox is " + checkboxName);

        }



    }
}


