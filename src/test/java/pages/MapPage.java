package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static pages.PageTitles.ExpMapPageTitle;
import static scenarios.MasterTest.driver;

public class MapPage {


//check opening from menu
//already in Side menu

//check title

    public AppiumDriver checkPageTitle() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("android.widget.TextView"))));
        String ActMapPageTitle = new PageTitles().getActMapPageTitle();

        if (ActMapPageTitle.equals(ExpMapPageTitle)) {
            System.out.println("Map Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

    public AppiumDriver checkMapButtons() throws NullPointerException, MalformedURLException, InterruptedException, NoSuchElementException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<MobileElement> planButton = driver.findElementsById("planButton");
        if (!planButton.isEmpty()) {
            System.out.println("Plan button is present");
//            wait.until(ExpectedConditions.invisibilityOf(driver.findElementById("progressBar")));
            if (driver.findElementById("planTouchImageView").isDisplayed()){
                System.out.println("Here's plan view");
            } else {
                System.out.println("!!! Plan didn't load");
                driver.quit();
            }
        }if (planButton.isEmpty()){
            System.out.println("Plan button is missing");
        }
        List<MobileElement> mapButton = driver.findElementsById("mapButton");
        if (!mapButton.isEmpty()) {
            System.out.println("Map button present");
            driver.findElementById("mapButton").click();
            List<MobileElement> mapMessage = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
            if (!mapMessage.isEmpty()){
                System.out.println("Map isn't working");
            }else {
                driver.findElementById("mapTypeSpinner").click();
                List<MobileElement> mapTypes = driver.findElements(By.id("text1"));
                for (MobileElement element : mapTypes) {
                    String mapTypeName = element.getText();
                    element.click();
                    String mapTypeDisplayed = driver.findElement(By.id("text1")).getText();
                    if (mapTypeName.equals(mapTypeDisplayed)) {
                        System.out.println("Selected " + mapTypeName);
                    } else {
                        System.out.println("!!! Something is wrong");
                    }
                    driver.findElementById("mapTypeSpinner").click();
                }
            }
        }if (mapButton.isEmpty()){
            System.out.println("!!! Something is wrong");
            driver.quit();
        }
        return driver;
    }

    public AppiumDriver testMapPage() throws MalformedURLException, InterruptedException {

        driver = checkMapButtons();

        return driver;
    }
//check menu (highlight)

//check switching to plan/map if avail

//check leaving


}
