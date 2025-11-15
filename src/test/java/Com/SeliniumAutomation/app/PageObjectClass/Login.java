package Com.SeliniumAutomation.app.PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    //the page objet class mainly need below 3 things.
    //Constructors

    //ActionMethods
    WebDriver driver;
    Login(WebDriver driver){
        this.driver=driver;

    }
    //locators
   By Usernameloc = By.xpath("//input[@name='username']");
    By Passwordloc = By.xpath("//input[@name='password']");
    By Login = By.xpath("//button[@type='submit']");

    public void username(String username){
        driver.findElement(Usernameloc).sendKeys(username);
    }
    public void Pwd (String password){
        driver.findElement(Passwordloc).sendKeys(password);
    }
    public void Login(){
        driver.findElement(Login).click();
    }


}
