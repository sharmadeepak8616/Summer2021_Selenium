package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestions {

    @Test
    public void autoSuggestion() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.name("q-destination")).sendKeys("New");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // #2, 3
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[contains(@class, 'typeahead')]//span[not(@class)]"));


        String selectThis = "Newport Beach";
        // #4
        for (WebElement suggestion : suggestions) {
            String webText = suggestion.getText();
            if (webText.equalsIgnoreCase(selectThis)) {
                suggestion.click();
                break;
            }
        }



        /**
         * 1. Analyse if auto-suggestions are present in dom as text or attribute's value
         * 2. Create a locator that will point to all the auto-suggestion webElements
         * 3. using findElements method to find all auto-suggestion webElements
         * 4. using loop
         *      pick auto-suggestion webElement
         *      get text value (or attribute value) [depends on step#1]
         *      if (above value == what user want to select)
         *          click webElement
         *          and break the loop
         *
         */

    }

}
