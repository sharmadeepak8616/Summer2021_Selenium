package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTextAttribute {

    @Test
    public void getTextAttribute() {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String loginTag = "button";
        By loginLocator = By.tagName(loginTag);
        WebElement loginButton = driver.findElement(loginLocator);

        /**
         * To get the text of a webElement
         * method: getText()
         * Return Type: String
         */
        String loginButtonText = loginButton.getText();

        System.out.println("Login button text --> " + loginButtonText);

        // verify the text on Login button
        String expLoginButtonText = "Log In";

        Assert.assertEquals(loginButtonText, expLoginButtonText, "Login button text is not as expected");


        /**
         * To get the value of any attribute of a webElement
         * method: getAttribute()
         * input: String (attrName)
         * Return Type: String (attribute's value)
         */
        String login_DataTestId_value = loginButton.getAttribute("data-testid");

        System.out.println("Login button (data-testid value) --> " + login_DataTestId_value);

    }





}
