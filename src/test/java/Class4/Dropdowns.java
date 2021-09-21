package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowns {

    @Test
    public void dropdowns() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click on 'Create New Account' button
        driver.findElement(By.linkText("Create New Account")).click();

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * Dropdown with select tag --> Select class
         *
         * 1. find the locator of dropdown webElement (or select tag)
         * 2. find the dropdown-webElement using the step-1 locator
         * 3. Create an Object of Select class and pass dropdown-WebElement found on step-2
         * 4. Use relevant method form the Select class to select the desired value from dropdown
         *      selectByVisibleText     |   selectByValue   |   selectByIndex
         *
         */

        By monthLocator = By.id("month");   // 1
        WebElement monthDropdown = driver.findElement(monthLocator);    // 2
        Select month = new Select(monthDropdown);   // 3
        month.selectByVisibleText("Feb");   // 4


        By dayLocator = By.xpath("//select[@title='Day']");
        WebElement dayDropdown = driver.findElement(dayLocator);
        Select day = new Select(dayDropdown);
        day.selectByValue("10");

        By yearLocator = By.name("birthday_year");
        WebElement yearDropdown = driver.findElement(yearLocator);
        Select year = new Select(yearDropdown);
        year.selectByIndex(10);














    }



}
