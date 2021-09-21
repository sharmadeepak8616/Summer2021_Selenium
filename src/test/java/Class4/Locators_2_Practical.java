package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_2_Practical {

        /**
         * To find a WebElement
         * method: findElement()
         * input: locator (by datatype)
         * output:
         *      if the element is found, WebElement will be returned
         *      else NoSuchElement exception
         *
         */

        /**
         * To type in a WebElement
         * method: sendKeys()
         * input: String (data that we want to type in WebElement)
         */

        /**
         * To click on a WebElement
         * method: click()
         *
         */
        @Test
        public void verifyInvalidCredentials() {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");

            try {
                Thread.sleep(2000);     // 1 sec = 1000milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // enter login-id as "abcd@test.com"
            String emailXpath = "//input[@type='text']";
            By emailLocator = By.xpath(emailXpath);
            WebElement emailBox = driver.findElement(emailLocator);
            emailBox.sendKeys("abcd@test.com");

            /*
            By emailLocator_1 = By.xpath("//input[@type='text']");
            WebElement emailBox_1 = driver.findElement(emailLocator_1);
            emailBox_1.sendKeys("abcd@test.com");

            WebElement emailBox_2 = driver.findElement(By.xpath("//input[@type='text']"));
            emailBox_2.sendKeys("abcd@test.com");


            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd@test.com");
             */

            // enter "test@1234" as password
            String passwordXpath = "//input[contains(@data-testid, 'royal_p')]";
            By passwordLocator = By.xpath(passwordXpath);
            WebElement passwordBox = driver.findElement(passwordLocator);
            passwordBox.sendKeys("abcd@1234");

            // click Log In button
            String loginXpath = "//*[text()='Log In' and @type='submit']";
            By loginLocator = By.xpath(loginXpath);
            WebElement loginButton = driver.findElement(loginLocator);
            loginButton.click();





















        }




}
