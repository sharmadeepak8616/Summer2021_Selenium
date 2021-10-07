package Class8;

import apple.laf.JRSUIConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

    @Test
    public void multipleWindows() {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * method to get the windowHandle of window linked with driver
         * Method: getWindowHandle
         * Return: String
         */
        String myHandle = driver.getWindowHandle(); // h2
        System.out.println(myHandle);


        // Clicking Facebook pay
        driver.findElement(By.linkText("Facebook Pay")).click();

        /**
         * method to get all windowHandles of windows launched by (or due to) automation
         * Method: getWindowHandles
         * Return: Set<String>
         */

        Set<String> allHandles = driver.getWindowHandles(); // [h1, h2]
        System.out.println(allHandles);

        // getting handle linked with driver
        String afterClick = driver.getWindowHandle();

        Assert.assertEquals(myHandle, afterClick, "Handle in driver is not same");


        /**
         * To change/switch the handle in driver
         * method: switchTo().window()
         * input: String (windowHandle)
         */
        for (String handle : allHandles) {      // allHandles -> ["h1", "h2"]    myHandle = "h2"
            if (!handle.equals(myHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Print the title of Facebook Pay webpage
        System.out.println(driver.getTitle());



    }

    @Test
    public void closeAdvertisements() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * Launch website
         * Website and 4 advertisements are launched
         *
         * task is to close 4-ads windows and keep primary window open
         *
         * grab the windowHandle -> website's windowHandle ("w1")
         *
         * grab all windowHandles -> 5 handles ("w1", "a1", "a2", "a3", "a4")
         *
         * if handle != w1
         * switch to a1
         * close
         *
         * switch to a2
         * close
         *
         *
         *
         *
         */

        String mainWindow = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();

        for (String handle : allHandles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }


    }

    @Test
    public void clickLearnMoreOnPay() {

        /**
         * Launch facebook.com
         * Click on Facebook Pay
         * Click the Learn More button on Facebook Pay
         * Verify below msg is displayed
         *      "Speed through online checkout with Facebook Pay"
         */

        // Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click on Facebook pay
        driver.findElement(By.linkText("Facebook Pay")).click();

        /**
         * method to get the windowHandle of window linked with driver
         * Method: getWindowHandle
         * Return: String
         */
        String myHandle = driver.getWindowHandle(); // h2
        System.out.println(myHandle);


        /**
         * method to get all windowHandles of windows launched by (or due to) automation
         * Method: getWindowHandles
         * Return: Set<String>
         */
        Set<String> allHandles = driver.getWindowHandles(); // [h1, h2]
        System.out.println(allHandles);

        for (String handle : allHandles) {
            if (!handle.equals(myHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        try {
            Thread.sleep(2000);         // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll and click to Learn More button on Facebook Pay
        // JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("scrollBy(0,1000)");

        for (int i=0 ; i < 20 ; i++) {
            try {
                WebElement learnMoreButton = driver.findElement(By.xpath("(//a[text()='Learn More'])[1]"));
                learnMoreButton.click();
                break;
            } catch (NoSuchElementException | ElementNotInteractableException e1) {
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("scrollBy(0,500)");
            }
        }








    }

}
