package Com.SeliniumAutomation.app.PageObjectClass;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageFactory {
    //the page objet class mainly need below 3 things.
    //Constructors

    //ActionMethods
    WebDriver driver;
    Login_PageFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    //locators
    @FindBy(xpath= "//input[@name='username']")
    WebElement Username;
    @FindBy(xpath= "//input[@name='password']")
    WebElement pwd;
    @FindBy(xpath= "//button[@type='submit']")
    WebElement Login;
  /* By Usernameloc = By.xpath("//input[@name='username']");
    By Passwordloc = By.xpath("//input[@name='password']");
    By Login = By.xpath("//button[@type='submit']");*/

    public void username(String username){
        Username.sendKeys(username);
    }
    public void Pwd (String password){
        pwd.sendKeys(password);
    }
    public void Login(){
        Login.click();
    }


}
