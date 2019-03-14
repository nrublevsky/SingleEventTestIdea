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

import static pages.PageTitles.ExpAboutPageTitle;
import static scenarios.MasterTest.driver;

public class AboutPage {



    public AndroidDriver checkPageTitle() throws NullPointerException{

        String ActAboutPageTitle = new PageTitles().getActAboutPageTitle();

        if (ActAboutPageTitle.equals(ExpAboutPageTitle)){
            System.out.println("About Page Title is correct");
        }
        else{
            System.out.println("!!! Something is wrong");
        }

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
        wait.until(ExpectedConditions.visibilityOf(PageTitles.MapPageTitle));
        String ActMapPageTitle = PageTitles.getActMapPageTitle();
        String ExpMapPageTitle = PageTitles.getExpMapPageTitle();
        if (ActMapPageTitle.equals(ExpMapPageTitle)){
            System.out.println("Map page is opened");
        }
        else {
            System.out.println("!!! Map page isn't opened");
        }

        return driver;
        }



}
