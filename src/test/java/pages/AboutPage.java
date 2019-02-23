package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import scenarios.ConfigsAndTexts;

import java.net.MalformedURLException;

import static scenarios.MasterTest.driver;

public class AboutPage {





    public AndroidDriver openAboutPage() throws MalformedURLException, NullPointerException {

//        AndroidElement AboutPage = (AndroidElement) driver.findElement(By.xpath("\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]"));
        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
        driver.findElement(By.xpath("\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]")).click();
        System.out.println("Opened About Page");

        return driver;
    }

    public AndroidDriver checkAboutPageInfo() throws NullPointerException{

        String ExpEventName = new ConfigsAndTexts().setExpEventName();
        String ExpEventDate = new ConfigsAndTexts().setExpEventDate();
        String ExpEventDescription = new ConfigsAndTexts().setExpEventDescription();
        String ExpEventLocation = new ConfigsAndTexts().setExpEventLocation();

        String ActEventName = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/titleTextView")).getText();
        String ActEventDate = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/datesTextView")).getText();
        String ActEventDescription = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/descriptionTextView")).getText();
        String ActEventLocation = driver.findElement(By.id("com.rozdoum.eventor.lpmd2018:id/addressTextView")).getText();


        System.out.println("Comparing Expected and Actual Names");
        if (ActEventName.equals(ExpEventName)) {
            System.out.println("Event name is correct ");
        } else {
            System.out.println("!!! Event Name is incorrect ");
        }

        System.out.println("Comparing Expected and Actual Date");
        if (ActEventDate.equals(ExpEventDate)) {
            System.out.println("Event date is correct ");
        } else {
            System.out.println("!!! Event Date is incorrect ");
        }

        System.out.println("Comparing Expected and Actual Location");
        if (ActEventLocation.equals(ExpEventLocation)) {
            System.out.println("Event location is correct ");
        } else {
            System.out.println("!!! Event Location is incorrect ");
        }

        System.out.println("Comparing Expected and Actual Description");
        if (ActEventDescription.equals(ExpEventDescription)) {
            System.out.println("Event description is correct ");
        } else {
            System.out.println("!!! Event Description is incorrect ");
        }

        return driver;
    }


}
