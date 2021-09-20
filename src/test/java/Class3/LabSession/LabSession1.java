package Class3.LabSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabSession1 {

    @Test
    public void labSession1() {
        /*
            dom (siblings)

            // launch facebook.com  (method --> driver.get())    [driver is connect to Facebook-login]
            // click Facebook Pay   (method --> click())         [driver is connect to Facebook-login]
            // print the pageTitle  (method --> getTitle())      [driver is connect to Facebook-login]

         */

        /*

            TC - Verify error message on empty Forgot Password search

            Steps:
            1. Launch Facebook.com
            2. Click Forgot Password link
            3. Click Search button on Forgot Password page
            4. Verify below error messages displayed.
                Please fill in at least one field
                Fill in at least one field to search for your account

         */
            // 1. Launch Facebook.com
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            String webpageUrl = "https://www.facebook.com/";
            driver.get(webpageUrl);

            // 2. Click Forgot Password link
            String linkText = "Forgot Password?";
            By linkTextLocator = By.linkText(linkText);
            WebElement linkTextField = driver.findElement(linkTextLocator);
            linkTextField.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 3. Click Search button on Forgot Password page
            String searchIdValue = "did_submit";
            By searchButtonLocator = By.id(searchIdValue);
            WebElement searchBox = driver.findElement(searchButtonLocator);
            searchBox.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 4. Verify below error messages displayed.
            //  Please fill in at least one field
            //  Fill in at least one field to search for your account
            String errorMessageClassName = "uiBoxRed";
            By errorMessageClassNameLocator = By.className(errorMessageClassName);
            WebElement errorMessageText = driver.findElement(errorMessageClassNameLocator);

            boolean isErrorMessageDisplayed = errorMessageText.isDisplayed();
            Assert.assertTrue(isErrorMessageDisplayed, "Error message is not displayed");

            // driver.quit();




    }

}
