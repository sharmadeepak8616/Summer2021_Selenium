package Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sun.nio.ch.SelectorImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Homework6_Discussion {

    /**
     * Task1: (darksky.net)
     *
     * 1. Launch darksky.net
     * 2. Scroll to Today's timeline
     * 3. Click the + button
     * 4. Verify tempValues (low and high) on timeline is same as tempValues in Today's detail
     *
     */


    /**
     * Task 2: (darksky.net)
     *
     * 1. Launch darksky.net
     * 2. Verify the timeline on home is rightly generated
     *
     */

    @Test
    public void task2() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net/");

        try {
            Thread.sleep(2000);     // 1 sec = 1000milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // grab timeline form web
        By timelineHoursLocator = By.xpath("(//div[@class='hours'])[1]//span[not(@class='hour') and not(@class='hour first')]");
        List<WebElement> webTimelineHours = driver.findElements(timelineHoursLocator);

        List<String> webHours = new ArrayList<>();

        for (WebElement timelineHour : webTimelineHours) {
            webHours.add(timelineHour.getText());
        }

        System.out.println(webHours);

        // creating expected timeline using java
        List<String> expHours = new ArrayList<>();
        expHours.add("Now");

        SimpleDateFormat df = new SimpleDateFormat("ha");


        Calendar cal = Calendar.getInstance();

        for (int i=1 ; i < 12 ; i++) {
            cal.add(Calendar.HOUR, 2);
            expHours.add(df.format(cal.getTime()).toLowerCase());
        }

        System.out.println(expHours);

    }



    /**
     * Task3: (https://classroomessentialsonline.com/)
     *
     * 1. Open classroom essentials
     * 2. Verify 'School Furniture' contains 'Classroom Storage' as one of the options
     *
     */


    /**
     * Task 4: (hotels.com)
     *
     * 1. Open hotels.com
     * 2. Enter "paris" in Search box
     * 3. Select "Playa del Carmen" from Auto suggestion
     * 4. Select tomorrow's date as check-in date
     * 5. Select 10-days from tomorrow as check-out date
     * 6. Verify room is getting booked for 10 nights
     * 7. Click the Search button
     * 8. Verify right check-in and Check-out date is displayed
     *
     */







}
