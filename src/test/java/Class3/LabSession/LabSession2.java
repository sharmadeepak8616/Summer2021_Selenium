package Class3.LabSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabSession2 {
    /*
        TC - Verify placeholders values for empty login box

        Steps:
        1. Launch facebook.com
        2. Verify placeholder for empty email box is "Email or Phone Number"
        3. Verify placeholder for empty password box is "Password"

     */
    @Test
    public void verifyPlaceholder() {

        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Verify placeholder for empty email box is "Email or Phone Number"
        String expEmailBoxPlaceholder = "Email or Phone Number";

        String emailId = "email";
        By emailLocator = By.id(emailId);
        WebElement emailBox = driver.findElement(emailLocator);

        // get the placeholder attribute's value
        String actEmailBoxPlaceholder = emailBox.getAttribute("placeholder");

        Assert.assertEquals(actEmailBoxPlaceholder, expEmailBoxPlaceholder, "Email box placeholder is not as expected");


    }

    /*
        WebDriver driver = new ChromeDriver();  // open a blank window

        // Launch facebook.com      [method -> get()]           // driver is connected to "facebook.com"
        // click Facebook Pay       [method -> click()]         // driver is connected to "facebook.com"
                find the Facebook Pay   driver.findElement()
        // print the page title     [method -> getTitle()]      // driver is connected to "facebook.com" Facebook - Log In or Sign up
                driver.getTitle()
     */

    /*
        Launch facebook.com         // driver is connected to window (id=101) "facebook.com"
        Click Messenger             // driver is connected to window (id=101)
        Print the page title        // driver is connected to window (id=101)   // Messenger
     */





}
