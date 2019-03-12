package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.PageTitles.ExpSpeakersPageTitle;
import static scenarios.MasterTest.driver;

public class SpeakersPage {


//  check opening from menu

    public AndroidDriver openSpeakersPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]")).click();
        System.out.println("Opened Speakers Page");

        return driver;
    }

//  check title

    public AndroidDriver checkPageTitle() throws NullPointerException{

        String ActSpeakersPageTitle = new PageTitles().getActSpeakersPageTitle();

        if (ActSpeakersPageTitle.equals(ExpSpeakersPageTitle)){
            System.out.println("Speakers Page Title is correct");
        }
        else{
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

//  check search

//  check menu (highlight)

//  check opening speaker

//  check leaving


}
