package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static scenarios.MasterTest.driver;

public class SideMenu {
//    check which buttons are present

//    check event name

//    check event logo

//    check menu closing

    //__________Menu___________
    public static WebElement MenuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
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
    public static WebElement SpeakersButton = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]"));
    //__________Sponsors_______
    public static WebElement SponsorsButton = (AndroidElement) driver.findElement(By.xpath(" "));
    //__________Talks__________
    public static WebElement TalksButton = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[3]"));
    //__________Twitter________
    public static WebElement TwitterButton = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[6]"));


    //    check open menu
    public AndroidDriver openMenu() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
        return driver;
    }

    //    check every button
    public AndroidDriver openAboutPage() throws NullPointerException {

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]")).click();
        System.out.println("Opened About Page");

        return driver;
    }

    public AndroidDriver openAgendaPage() throws NullPointerException {

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[2]")).click();
        System.out.println("Opened Agenda Page");

        return driver;
    }

    //exhibitors
    public AndroidDriver openExhibitorsPage() throws NullPointerException {

        driver.findElement(By.xpath(" ")).click();
        System.out.println("Opened Exhibitors Page");

        return driver;
    }

    //map
    public AndroidDriver openMapPage() throws NullPointerException {

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[5]")).click();
        System.out.println("Opened Map Page");

        return driver;
    }

    //news
    public AndroidDriver openNewsPage() throws NullPointerException {

        driver.findElement(By.xpath(" ")).click();
        System.out.println("Opened News Page");

        return driver;
    }

    //schedule
    public AndroidDriver openSchedulePage() throws NullPointerException {

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]")).click();
        System.out.println("Opened Schedule Page");

        return driver;
    }

    //speakers
    public AndroidDriver openSpeakersPage() throws NullPointerException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]")).click();
        System.out.println("Opened Speakers Page");
        return driver;
    }

    //sponsors
    public AndroidDriver openSponsorsPage() throws NullPointerException {
        driver.findElement(By.xpath(" ")).click();
        System.out.println("Opened Sponsors Page");
        return driver;
    }

    //talks
    public AndroidDriver openTalksPage() throws NullPointerException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[3]")).click();
        System.out.println("Opened Talks Page");
        return driver;
    }

    //twitter
    public AndroidDriver openTwitterPage() throws NullPointerException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[6]")).click();
        System.out.println("Opened Twitter Page");
        return driver;
    }

    public AndroidDriver checkMenuButtonsPresent() throws NullPointerException {
        boolean AboutPagePresent = false;
        boolean AgendaPagePresent = false;
        boolean ExhibitorsPagePresent = false;
        boolean MapPagePresent = false;
        boolean NewsPagePresent = false;
        boolean SchedulePagePresent = false;
        boolean SpeakersPagePresent = false;
        boolean SponsorsPagePresent = false;
        boolean TalksPagePresent = false;
        boolean TwitterPagePresent = false;

        //driver check for button name
        //if(Button name present){
        //  PagePresent = true
        // }


        return driver;
    }


    public AndroidDriver checkMenuRedirects() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 60);

//Speakers
//if (SpeakersPagePresent = true){
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openSpeakersPage();
        driver = new SpeakersPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//}else{
//  System.out.println("Speakers Page is missing")
// }

//About

        driver = new SideMenu().openMenu();
        driver = new SideMenu().openAboutPage();
        driver = new AboutPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//Agenda
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openAgendaPage();
        driver = new AgendaPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//Exhibitors
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openExhibitorsPage();
        driver = new ExhibitorsPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//Map
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openMapPage();
        driver = new MapPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//News
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openNewsPage();
        driver = new NewsPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//Schedule
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openSchedulePage();
        driver = new SchedulePage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//Sponsors
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openSponsorsPage();
        driver = new SponsorsPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//Talks
        driver = new SideMenu().openMenu();
        driver = new SideMenu().openTalksPage();
        driver = new TalksPage().checkPageTitle();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));


        return driver;
    }
}

