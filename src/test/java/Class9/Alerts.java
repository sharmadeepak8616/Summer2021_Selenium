package Class9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {

    @Test
    public void alerts() {

        /**
         * Alert -> there will always be one alert at a time.
         * User has to interact with Alert, otherwise cannot use the webpage.
         *
         * To interact with alert, we need to switchTo the alert.
         *  driver.switchTo().alert();
         *
         * If alert is present, driver will switch to Alert
         * else throw NoAlertPresentException
         *
         */


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.name("cusid")).sendKeys("11");

        driver.findElement(By.name("submit")).click();

        try {
            Thread.sleep(1000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Alert myAlert = driver.switchTo().alert();

        String alertText = myAlert.getText();
        System.out.println("Alert text -> " + alertText);

        // to type something on alert input section
        // myAlert.sendKeys("10001");

        // to click the +ve action button
        myAlert.accept();

        // to click the -ve action button
        // myAlert.dismiss();


        try {
            Thread.sleep(1000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myAlert.accept();

    }



}
