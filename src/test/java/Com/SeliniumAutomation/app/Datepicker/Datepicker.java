package Com.SeliniumAutomation.app.Datepicker;

import org.apache.xmlbeans.SchemaTypeLoader;
import org.codehaus.groovy.ast.stmt.WhileStatement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class Datepicker {
    static void selectFutureDate(WebDriver driver,String year,String month,String date)
    {
        while(true)
        {
            String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actutal month
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year

            if(currentMonth.equals(month) && currentYear.equals(year))
            {
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous
        }

        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

        for(WebElement dt:allDates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }

    }


    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
        String year = "2027";
        String month = "May";
        String date="10";
        selectFutureDate(driver,year,month,date);

       WebElement dateenterd=  driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
        System.out.println(dateenterd.getAttribute("value"));
     driver.quit();
    }
}
