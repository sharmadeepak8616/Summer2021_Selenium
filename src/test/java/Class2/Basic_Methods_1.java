package Class2;

import com.sun.tools.javac.code.Types;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic_Methods_1 {

    // TC: Verify page title

    // Test Methods
    @Test
    public void verifyPageTitle() {
        // path of the driver (chrome)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");      // Mac
        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");   // Windows

        WebDriver driver = new ChromeDriver();
        /**
         * WebDriver driver = new ChromeDriver();
         *
         * WebDriver driver --> driver is a variable of WebDriver Interface
         * new ChromeDriver(); --> object of ChromeDriver class
         *
         * Storing object of ChromeDriver class into a WebDriver variable.
         *
         * ChromeDriver(C) extends RemoteWebDriver(C) ; RemoteWebDriver(C) implements WebDriver(I)
         *
         *
         */

        /**
         * To launch a webpage
         *
         * Method 1 : get()
         *
         * Method 2 : navigate().to()
         *
         */

        String url = "https://www.facebook.com/";
        driver.get(url);
        // OR
        // driver.navigate().to(url);

        /**
         * get() vs navigate().to()
         *
         * get() -> launches the webpage and waits for few seconds (for webpage to load)
         *          before executing to the next command in code.
         *
         * navigate().to() -> launches the webpage,
         *          and goes to execute the next command in the code.
         *
         */

        /**
         * To maximize the webpage
         *
         * Method: maximize()
         */
        // driver.manage().window().maximize();

        /**
         * To get page title of window associated with driver
         *
         * Method: getTitle()
         */
        String pageTitle = driver.getTitle();
        System.out.println("page title -> " + pageTitle);

        String expPageTitle = "Facebook - Log In or Sign Up";

        // For Verification, we use Assert library from TestNG
        Assert.assertEquals(pageTitle, expPageTitle, "Page title is not as expected");

        /**
         * Assert class contains multiple methods, which we can use to implement the verification.
         *
         * assertEquals - when we need to verify actualValue against expectedValue
         *      Sample: Assert.assertEquals(value1, value2, "This error msg will print if Assertion fails");
         *
         * assertTrue - when we need to verify if a boolean value is true
         *      Sample: Assert.assertTrue(booleanValue, "This error msg will print if assertion fails");
         *
         * assertFalse - when we need to verify if a boolean value is false
         *      Sample: Assert.assertFalse(booleanValue, "This error msg will print if assertion fails");
         */

        driver.quit();
    }

    @Test
    public void verifyUrl() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";
        driver.get(url);

        /**
         * To get url of the window associated with driver
         *
         * Method: getCurrentUrl()
         */
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(url, actualUrl, "Page url is not as expected");

        /**
         * To close a webpage
         *
         * Method 1: close()
         *      will close only the web-window associated with driver
         *
         * Method 2: quit()
         *      will close ALL web-windows opened due to automation code/script.
         */
        driver.quit();

    }

    @Test
    public void verifyBackForwardFunctionality() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";
        driver.get(url);

        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://www.amazon.com");

        try {
            Thread.sleep(5000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * To move back and forward
         *
         * method: back()
         *
         * method: forward()
         */

        // Go Backward
        driver.navigate().back();   // <-- to go back once

        try {
            Thread.sleep(5000);         // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Go Forward
        driver.navigate().forward();    // <-- to go forward once

        try {
            Thread.sleep(5000);         // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    @Test
    public void refreshWebPage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";
        driver.get(url);

        try {
            Thread.sleep(5000);         // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * To refresh the webpage
         *
         * 1. Method: navigate().refresh()
         *
         * 2. Go backward and then forward
         *
         * 3. Launch the current url
         */

        // 1
        driver.navigate().refresh();

        // 2
        driver.navigate().back();
        driver.navigate().forward();

        // 3
        /*
            1. get the current url -> getCurrentUrl() method
            2. launch the result of step-1 with get()
         */
        String myCurrentUrl = driver.getCurrentUrl();
        driver.get(myCurrentUrl);


    }








}
