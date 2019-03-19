package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import scenarios.ConfigsAndTexts;

import static pages.PageTitles.ExpAboutPageTitle;
import static scenarios.MasterTest.driver;

public class AboutPage {


    public AndroidDriver checkPageTitle() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")));
        String ActAboutPageTitle = new PageTitles().getActAboutPageTitle();

        if (ActAboutPageTitle.equals(ExpAboutPageTitle)) {
            System.out.println("About Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

    public AndroidDriver checkAboutPageInfo() throws NullPointerException {

        String ExpEventName = new ConfigsAndTexts().setExpEventName();
        String ExpEventDate = new ConfigsAndTexts().setExpEventDate();
        String ExpEventDescription = new ConfigsAndTexts().setExpEventDescription();
        String ExpEventLocation = new ConfigsAndTexts().setExpEventLocation();

        String ActEventName = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/titleTextView")).getText();
        String ActEventDate = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/datesTextView")).getText();
        String ActEventDescription = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/descriptionTextView")).getText();
        String ActEventLocation = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/addressTextView")).getText();


        System.out.println("1) Comparing Expected and Actual Names");
        if (ActEventName.equals(ExpEventName)) {
            System.out.println("Event name is correct");
        } else {
            System.out.println("!!! Something wrong with Event Name");
        }

        System.out.println("2) Comparing Expected and Actual Date");
        if (ActEventDate.equals(ExpEventDate)) {
            System.out.println("Event date is correct");
        } else {
            System.out.println("!!! Something wrong with Event Date");
        }

        System.out.println("3) Comparing Expected and Actual Location");
        if (ActEventLocation.equals(ExpEventLocation)) {
            System.out.println("Event location is correct");
        } else {
            System.out.println("!!! Something wrong with Event Location");
        }

        System.out.println("4) Comparing Expected and Actual Description");
        if (ActEventDescription.equals(ExpEventDescription)) {
            System.out.println("Event description is correct");
        } else {
            System.out.println("!!! Something wrong with Event Description");
        }

        return driver;
    }

    public AndroidDriver checkLocationLink() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        System.out.println("Checking Location link redirect");
        driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/addressTextView")).click();
        driver = new MapPage().checkPageTitle();
        System.out.println("Going back to About Page");
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver = new AboutPage().checkPageTitle();

        return driver;
    }


}
