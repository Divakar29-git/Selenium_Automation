package Com.SeliniumAutomation.app.Alerts_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    WebDriver driver = new ChromeDriver();

    @Test
    public void testAddressVerificationPopup() {
        // Step 1: Enter a valid address
        driver.get(""); // Replace with your application URL
        WebElement addressInput = driver.findElement(By.xpath("//input[@id='address']")); // Replace with actual XPath
        addressInput.sendKeys("123 Main St, Anytown, USA"); // Replace with a valid address

        // Step 2: Attempt to continue
        WebElement continueButton = driver.findElement(By.xpath("//button[@id='continue']")); // Replace with actual XPath
        continueButton.click();

        // Step 3: Verify the Address Verification popup is displayed
        WebElement addressVerificationPopup = driver.findElement(By.xpath("//div[@id='address-verification-popup']")); // Replace with actual XPath
        Assert.assertTrue(addressVerificationPopup.isDisplayed());

        // Verify the "Address Entered" and "Verified Address" fields are displayed
        WebElement addressEnteredField = driver.findElement(By.xpath("//input[@id='address-entered']")); // Replace with actual XPath
        WebElement verifiedAddressField = driver.findElement(By.xpath("//input[@id='verified-address']")); // Replace with actual XPath
        Assert.assertTrue(addressEnteredField.isDisplayed());
        Assert.assertTrue(verifiedAddressField.isDisplayed());
    }
}

