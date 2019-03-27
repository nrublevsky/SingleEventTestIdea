package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.List;

import static pages.PageTitles.*;
import static scenarios.MasterTest.driver;

public class SideMenu {
//    check which buttons are present

//    check event name

//    check event logo

//    check menu closing


    public boolean AboutPagePresent = false;
    public boolean AgendaPagePresent = false;
    public boolean ExhibitorsPagePresent = false;
    public boolean MapPagePresent = false;
    public boolean NewsPagePresent = false;
    public boolean SchedulePagePresent = false;
    public boolean SpeakersPagePresent = false;
    public boolean SponsorsPagePresent = false;
    public boolean TalksPagePresent = false;
    public boolean TwitterPagePresent = false;

    //__________Menu___________
    MobileElement MenuButton = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));

    //    check open menu
    public AndroidDriver openMenu() throws NullPointerException, InterruptedException {

        MenuButton.click();
        System.out.println("Opened Menu");
//        Thread.sleep(15000);
        return driver;
    }

    public AndroidDriver checkMenuNames() throws NullPointerException, InterruptedException {
        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        System.out.println("Here are buttons that are present in menu:");
        for (MobileElement element : menuButtonsPresentList) {
            System.out.println(element.getText());
        }
        System.out.println("Checked Present button names");
        return driver;
    }

    public AndroidDriver checkAboutButton() throws NullPointerException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpAboutPageTitle.equals(buttonName)) {
                System.out.println("Checking About page");
                element.click();
                driver = new AboutPage().checkPageTitle();
                driver = new AboutPage().testAboutPage();
                System.out.println("Checked About page");
                break;
            }
        }
        return driver;
    }

    public AndroidDriver checkTalksButton() throws NullPointerException, InterruptedException, MalformedURLException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpTalksPageTitle.equals(buttonName)) {
                System.out.println("Checking Talks page");
                element.click();
                driver = new TalksPage().checkPageTitle();
                driver = new TalksPage().testTalksPage();
                System.out.println("Checked Talks page and Search");
                break;
            }

        }
        return driver;
    }

    public AndroidDriver checkAgendaButton() throws NullPointerException, InterruptedException, MalformedURLException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpAgendaPageTitle.equals(buttonName)) {
                System.out.println("Checking Agenda page");
                element.click();
                driver = new AgendaPage().checkPageTitle();
                // _________Fill in_____________
                System.out.println("Checked Agenda page");
                break;
            }

        }
        return driver;
    }


    public AndroidDriver checkExhibitorsButton() throws NullPointerException, InterruptedException, MalformedURLException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpExhibitorsPageTitle.equals(buttonName)) {
                System.out.println("Checking Exhibitors page");
                element.click();
                driver = new ExhibitorsPage().checkPageTitle();
                driver = new TalksPage().testTalksPage();
                System.out.println("Checked Talks page and Search");
                break;
            }

        }
        return driver;
    }
//
//    //exhibitors
//    public AndroidDriver openExhibitorsPage() throws NullPointerException {
//
//        driver.findElement(By.xpath("0")).click();
//        System.out.println("Opened Exhibitors Page");
//
//        return driver;
//    }
//
//    //map
//    public AndroidDriver openMapPage() throws NullPointerException {
//
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[5]")).click();
//        System.out.println("Opened Map Page");
//
//        return driver;
//    }
//
//    //news
//    public AndroidDriver openNewsPage() throws NullPointerException {
//
//        driver.findElement(By.xpath(" ")).click();
//        System.out.println("Opened News Page");
//
//        return driver;
//    }
//
//    //schedule
//    public AndroidDriver openSchedulePage() throws NullPointerException {
//
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]")).click();
//        System.out.println("Opened Schedule Page");
//
//        return driver;
//    }
//
//    //speakers
//    public AndroidDriver openSpeakersPage() throws NullPointerException {
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]")).click();
//        System.out.println("Opened Speakers Page");
//        return driver;
//    }
//
//    //sponsors
//    public AndroidDriver openSponsorsPage() throws NullPointerException {
//        driver.findElement(By.xpath(" ")).click();
//        System.out.println("Opened Sponsors Page");
//        return driver;
//    }
//
//    //talks
//    public AndroidDriver openTalksPage() throws NullPointerException {
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[3]")).click();
//        System.out.println("Opened Talks Page");
//        return driver;
//    }
//
//    //twitter
//    public AndroidDriver openTwitterPage() throws NullPointerException {
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[6]")).click();
//        System.out.println("Opened Twitter Page");
//        return driver;
//    }

//    public AndroidDriver checkMenuButtonsPresent() throws NullPointerException {
////__________About_____
//        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]")).isDisplayed()) {
//            AboutPagePresent = true;
//            System.out.println("Found About button");
//        } else {
//            System.out.println("!!! About button is missing");
//        }
////__________Agenda____
//        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[2]")).isDisplayed()) {
//            AgendaPagePresent = true;
//            System.out.println("Found Agenda button");
//        } else {
//            System.out.println("Agenda button is missing");
//        }
////__________Exhibitors
//        if (driver.findElement(By.xpath("0")).isDisplayed()) {
//            ExhibitorsPagePresent = true;
//            System.out.println("Found Exhibitors button");
//        } else {
//            System.out.println("Exhibitors button is missing");
//        }
////__________Map______
//        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[5]")).isDisplayed()) {
//            MapPagePresent = true;
//            System.out.println("Found Map button");
//        } else {
//            System.out.println("Map button is missing");
//        }
////__________News_____
//        if (driver.findElement(By.xpath("0")).isDisplayed()) {
//            NewsPagePresent = true;
//            System.out.println("Found News button");
//        } else {
//            System.out.println("News button is missing");
//        }
////__________Schedule_
//        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]")).isDisplayed()) {
//            SchedulePagePresent = true;
//            System.out.println("Found Schedule button");
//        } else {
//            System.out.println("Schedule button is missing");
//        }
////__________Speakers_
//        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]")).isDisplayed()) {
//            SpeakersPagePresent = true;
//            System.out.println("Found Speakers button");
//        } else {
//            System.out.println("Speakers button is missing");
//        }
////__________Sponsors_
//        if (driver.findElement(By.xpath("0")).isDisplayed()) {
//            SponsorsPagePresent = true;
//            System.out.println("Found Sponsors button");
//        } else {
//            System.out.println("Sponsors button is missing");
//        }
////__________Talks____
//        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[3]")).isDisplayed()) {
//            TalksPagePresent = true;
//            System.out.println("Found Talks button");
//        } else {
//            System.out.println("Talks button is missing");
//        }
////__________Twitter__
//        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[6]")).isDisplayed()) {
//            TwitterPagePresent = true;
//            System.out.println("Found Twitter button");
//        } else {
//            System.out.println("Twitter button is missing");
//        }
//        System.out.println("All checked");
//        return driver;
//    }

    //    check every button
//    public AndroidDriver openAboutPage() throws NullPointerException {
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]")).click();
////        AboutPage.AboutButton.click();
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("android.widget.TextView"))));
//        System.out.println("Opened About Page");
//        return driver;
//    }

//    public AndroidDriver checkMenuRedirects() throws NullPointerException, InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 60);
//
////Speakers
//        if (SpeakersPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openSpeakersPage();
//            driver = new SpeakersPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Speakers Page is missing");
//        }
//
//////About
////        if (AboutPagePresent = true) {
////            driver = new SideMenu().openMenu();
////            driver = new SideMenu().openAboutPage();
////            driver = new AboutPage().checkPageTitle();
////            driver.pressKeyCode(AndroidKeyCode.BACK);
////            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
////        } else {
////            System.out.println("About page is missing");
////        }
////Agenda
//        if (AgendaPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openAgendaPage();
//            driver = new AgendaPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Agenda page is missing");
//        }
////Exhibitors
//        if (ExhibitorsPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openExhibitorsPage();
//            driver = new ExhibitorsPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Exhibitors page is missing");
//        }
////Map
//        if (MapPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openMapPage();
//            driver = new MapPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Map page is missing");
//        }
////News
//        if (NewsPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openNewsPage();
//            driver = new NewsPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("News page is missing");
//        }
////Schedule
//        if (SchedulePagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openSchedulePage();
//            driver = new SchedulePage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Schedule page is missing");
//        }
////Sponsors
//        if (SponsorsPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openSponsorsPage();
//            driver = new SponsorsPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Sponsors page is missing");
//        }
////Talks
//        if (TalksPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openTalksPage();
//            driver = new TalksPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Talks page is missing");
//        }
////Twitter
//        if (TwitterPagePresent = true) {
//            driver = new SideMenu().openMenu();
//            driver = new SideMenu().openTwitterPage();
//            driver = new TalksPage().checkPageTitle();
//            driver.pressKeyCode(AndroidKeyCode.BACK);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        } else {
//            System.out.println("Twitter page is missing");
//        }
//        return driver;
//    }
//    //__________About__________
//    MobileElement AboutButton = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[7]"));
//    //__________Agenda_________
//    public static WebElement AgendaButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[2]"));
//    //__________Exhibitors_____
//    public static WebElement ExhibitorsButton = driver.findElement(By.xpath(""));
//    //__________Map____________
//    public static WebElement MapButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[5]"));
//    //__________News___________
//    public static WebElement NewsButton = driver.findElement(By.xpath(""));
//    //__________Schedule_______.
//    public static WebElement ScheduleButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]"));
//    //__________Speakers_______
//    public static WebElement SpeakersButton = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[4]"));
//    //__________Sponsors_______
//    public static WebElement SponsorsButton = (AndroidElement) driver.findElement(By.xpath(" "));
//    //__________Talks__________
//    public static WebElement TalksButton = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[3]"));
//    //__________Twitter________
//    public static WebElement TwitterButton = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[6]"));

}

