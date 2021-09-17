package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledDisplayedSelected {

    @Test
    public void isElementEnabled() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * To verify if the WebElement is Displayed or not
         * method: isDisplayed()
         * return type: boolean
         */

        // is Login button displayed

        String loginName = "login";
        By loginButtonLocator = By.name(loginName);
        WebElement loginButton = driver.findElement(loginButtonLocator);

        boolean isLoginDisplayed = loginButton.isDisplayed();   // exp: true
        Assert.assertTrue(isLoginDisplayed, "Login button is not displayed");

        /**
         * To verify if the WebElement is Enabled or not
         * method: isEnabled()
         * return type: boolean
         */
        boolean isLoginEnabled = loginButton.isEnabled();   // exp: true
        Assert.assertTrue(isLoginEnabled, "Login button is not enabled");

        /**
         * To verify if the WebElement is Selected or not
         * method: isSelected()
         * return type: boolean
         */



    }
}
