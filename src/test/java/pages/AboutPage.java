package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.PageTitles.ExpAboutPageTitle;
import static scenarios.MasterTest.driver;

public class AboutPage {


    public AppiumDriver checkPageTitle() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")));
        String ActAboutPageTitle = new PageTitles().getActAboutPageTitle();

        if (ActAboutPageTitle.equals(ExpAboutPageTitle)) {
            System.out.println("About Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

    public AppiumDriver checkAboutPageInfo() throws NullPointerException {


        String ActEventName = driver.findElement(By.id("titleTextView")).getText();
        String ActEventDate = driver.findElement(By.id("datesTextView")).getText();
        String ActEventDescription = driver.findElement(By.id("descriptionTextView")).getText();
        String ActEventLocation = driver.findElement(By.id("addressTextView")).getText();


        System.out.println("1) Checking Event name is present");
        if (driver.findElement(By.id("titleTextView")).isDisplayed()) {
            System.out.println("Here's event name: " + ActEventName);
        } else {
            System.out.println("!!! Can't find Event Name");
        }

        System.out.println("2) Checking Event Date is present");
        if (driver.findElement(By.id("datesTextView")).isDisplayed()) {
            System.out.println("Here's event date: " + ActEventDate);
        } else {
            System.out.println("!!! Can't find Event Date");
        }

        System.out.println("3) Checking Event Location is present");
        if (driver.findElement(By.id("addressTextView")).isDisplayed()) {
            System.out.println("Here's event location: "+ActEventLocation);
        } else {
            System.out.println("!!! Can't find Event Location");
        }

        System.out.println("4) Checking Event Description is present");
        if (driver.findElement(By.id("descriptionTextView")).isDisplayed()) {
            System.out.println("Here's event description: " + ActEventDescription);
        } else {
            System.out.println("!!! Can't find Event Description");
        }

        return driver;
    }

    public AppiumDriver checkLocationLink() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        System.out.println("Checking Location link redirect");
        driver.findElement(By.id("addressTextView")).click();
        driver = new MapPage().checkPageTitle();
        System.out.println("Going back to About Page");
        driver.navigate().back();
        driver = new AboutPage().checkPageTitle();

        return driver;
    }

    public AppiumDriver testAboutPage() throws NullPointerException, InterruptedException {

        driver = new AboutPage().checkAboutPageInfo();
        driver = new AboutPage().checkLocationLink();
        return driver;
    }

    //    //__________About__________
//   static MobileElement AboutButton = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]"));
}
