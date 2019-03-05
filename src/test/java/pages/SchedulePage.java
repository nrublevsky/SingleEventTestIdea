package pages;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static scenarios.MasterTest.driver;

public class SchedulePage {

/*    Menu Button
      SchedulePage Title
      Dates selector {
        Stage Name
        Timeline
        Talk Item{
             Talk Header {
                    Menu Button
                    Talk Title
                    Share Button
                    }
             Talk Name
             Close Button
             Talk Date
             Stage Name
             Add to Agenda Title
             Add to Agenda Slider
             Talk Description
             Rate The Talk Section
        }
      }
*/



//Reusable stuff! Add correct XPATH and edit names
public static AndroidElement SchedulePageTitle = (AndroidElement) driver.findElement(By.xpath(""));

    public static String getActSchedulePageTitle () {
        String ActPageTitle = SchedulePageTitle.getText();
        return ActPageTitle;
    }



}
