package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
    public static void main(String[] args) {

        // path of the driver (chrome)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");      // Mac
        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");   // Windows

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");



    }
}
