package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindElementsMethod {

    @Test
    public void findElementsTest() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://classroomessentialsonline.com/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Church Chairs locator
        By churchChairsLocator = By.xpath("(//a[contains(text(), 'Church Chairs')])[1]");
        WebElement churchChairs = driver.findElement(churchChairsLocator);
        Actions act = new Actions(driver);
        act.moveToElement(churchChairs).build().perform();

        try {
            Thread.sleep(1000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        By churchChairsOptionsLocator = By.xpath("(//a[contains(text(), 'Church Chairs')])[1]/following-sibling::div//a");
        List<WebElement> options = driver.findElements(churchChairsOptionsLocator);

        for (WebElement option : options) {
            System.out.println(option.getText());
        }



    }


}
