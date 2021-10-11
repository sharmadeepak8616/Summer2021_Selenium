package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

    @Test
    public void frames() {

        /**
         * Frames: is a web-page on web-page.
         *      Frames are always going to have "iframe" tag
         *      One web-page can have multiple frames.
         *
         * To interact with frame
         *  1. switch on the frame
         *  2. then we interact with frame (or any specific element in the frame)
         *
         * Switch to frame:
         *  1. using the id with iframe tag
         *  2. using the frame-webElement
         *  3. using frame index
         *
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.yahoo.com/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // switch to frame - using the id with iframe tag
        driver.switchTo().frame("my-adsLREC-iframe");

        // switch to frame - using the frame-webElement
        WebElement myFrame = driver.findElement(By.xpath("//iframe[@id='my-adsLREC-iframe']"));
        driver.switchTo().frame(myFrame);

        // switch to frame - using frame index
        driver.switchTo().frame(2);






    }


}
