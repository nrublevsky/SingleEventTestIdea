package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static scenarios.MasterTest.driver;
public class SideMenu {


    //    check open menu
    public AndroidDriver openMenu()throws NullPointerException{

        MenuButton.click();
        return driver;
    }
//    check which buttons are present

//    check event name

//    check event logo

//    check menu closing

//    check every button
    public AndroidDriver openAboutPage() throws NullPointerException {

    WebDriverWait wait = new WebDriverWait(driver, 60);

    wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
    driver.findElement((By) SideMenu.MenuButton).click();
    driver.findElement((By)SideMenu.AboutButton).click();
    System.out.println("Opened About Page");

    return driver;
}

    public AndroidDriver openAgendaPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.AgendaButton).click();
        System.out.println("Opened Agenda Page");

        return driver;
    }

    //exhibitors
    public AndroidDriver openExhibotorsPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.ExhibitorsButton).click();
        System.out.println("Opened Exhibitors Page");

        return driver;
    }
    //map
    public AndroidDriver openMapPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.MapButton).click();
        System.out.println("Opened Map Page");

        return driver;
    }
    //news
    public AndroidDriver openNewsPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.NewsButton).click();
        System.out.println("Opened News Page");

        return driver;
    }
    //schedule
    public AndroidDriver openSchedulePage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.ScheduleButton).click();
        System.out.println("Opened Schedule Page");

        return driver;
    }
    //speakers
    public AndroidDriver openSpeakersPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.SpeakersButton).click();
        System.out.println("Opened Speakers Page");

        return driver;
    }
    //sponsors
    public AndroidDriver openSponsorsPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.SponsorsButton).click();
        System.out.println("Opened Sponsors Page");

        return driver;
    }
    //talks
    public AndroidDriver openTalksPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.TalksButton).click();
        System.out.println("Opened Talks Page");

        return driver;
    }
    //twitter
    public AndroidDriver openTwitterPage() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(SideMenu.MenuButton));
        driver.findElement((By) SideMenu.MenuButton).click();
        driver.findElement((By)SideMenu.TwitterButton).click();
        System.out.println("Opened Twitter Page");

        return driver;
    }
//__________About__________
public static WebElement AboutButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]"));
//__________Agenda_________
public static WebElement AgendaButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[2]"));
//__________Exhibitors_____
public static WebElement ExhibitorsButton = driver.findElement(By.xpath(""));
//__________Map____________
public static WebElement MapButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[5]"));
//__________News___________
public static WebElement NewsButton = driver.findElement(By.xpath(""));
//__________Schedule_______.
public static WebElement ScheduleButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]"));
//__________Speakers_______
public static WebElement SpeakersButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]"));
//__________Sponsors_______
public static WebElement SponsorsButton = driver.findElement(By.xpath(" "));
//__________Talks__________
public static WebElement TalksButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[3]"));
//__________Twitter________
public static WebElement TwitterButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[6]"));
//__________Menu___________
public static WebElement MenuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));



}

