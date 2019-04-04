package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
//    MobileElement MenuButton = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");

    //    check open menu
    public AppiumDriver openMenu() throws NullPointerException, InterruptedException {
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        System.out.println("Opened Menu");
        return driver;
    }

    public AppiumDriver checkEventNamePresent() throws NullPointerException, MalformedURLException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")));
        String ActEventName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        System.out.println(ActEventName);

        if (driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).isDisplayed()) {
            System.out.println("Event name is : " + ActEventName);
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

    public AppiumDriver checkFeedback() throws MalformedURLException, NullPointerException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 15);
        List<MobileElement> alertTitle = driver.findElements(By.id("alertTitle"));
        boolean alertTitlePresent = alertTitle.isEmpty();

        if (!alertTitlePresent) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertTitle")));
            System.out.println("Here's feedback window");
            driver.findElementById("button1").click();

            return driver;
        }
        return driver;
    }

    public AppiumDriver checkMenuNames() throws NullPointerException, InterruptedException {
        TouchAction action = new TouchAction(driver).press(PointOption.point(482, 1700)).moveTo(PointOption.point(442, 1400)).release();

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        action.perform();
        menuButtonsPresentList.addAll(driver.findElements(By.id("textTextView")));
        System.out.println("Here are buttons that are present in menu:");
        for (MobileElement element : menuButtonsPresentList) {
            System.out.println(element.getText());
        }
        System.out.println("Checked Present button names");
        return driver;
    }

    public AppiumDriver openAboutPage() throws NullPointerException, InterruptedException, MalformedURLException, ClassCastException {

        TouchAction action = new TouchAction(driver).press(PointOption.point(482, 1703)).moveTo(PointOption.point(499, 1177)).release();
        action.perform();

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpAboutPageTitle.equals(buttonName)) {
                System.out.println("Opening About page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new AboutPage().checkPageTitle();
                System.out.println("Opened About page");
                break;
            }
        }

        return driver;
    }

    public AppiumDriver checkAboutPage() throws NullPointerException, InterruptedException, MalformedURLException, ClassCastException {

        driver = new AboutPage().testAboutPage();
        System.out.println("Checked About page");

        return driver;
    }

    public AppiumDriver openTalksPage() throws NullPointerException, InterruptedException, MalformedURLException, ClassCastException {
        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpTalksPageTitle.equals(buttonName)) {
                System.out.println("Checking Talks page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new TalksPage().checkPageTitle();
                System.out.println("Opened Talks page");
                break;
            }
        }
        return driver;
    }

    public AppiumDriver checkTalksPage() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new TalksPage().testTalksPage();
        System.out.println("Checked Talks page and Search");

        return driver;
    }

    public AppiumDriver openAgendaPage() throws NullPointerException, InterruptedException, MalformedURLException {
        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpAgendaPageTitle.equals(buttonName)) {
                System.out.println("Checking Agenda page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new AgendaPage().checkPageTitle();
                System.out.println("Opened Agenda page");
                break;
            }
        }

        return driver;
    }

    public AppiumDriver checkAgendaButton() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new SideMenu().openAgendaPage();
        driver = new AgendaPage().testAgendaPage();
        System.out.println("Checked Agenda page");

        return driver;
    }

    public AppiumDriver openExhibitorsPage() throws NullPointerException, InterruptedException, MalformedURLException {

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpExhibitorsPageTitle.equals(buttonName)) {
                System.out.println("Checking Exhibitors page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new ExhibitorsPage().checkPageTitle();
                break;
            }
        }
        return driver;
    }

    public AppiumDriver checkExhibitorsPage() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new SideMenu().openExhibitorsPage();
        driver = new ExhibitorsPage().testExhibitorsPage();
        System.out.println("Checked Exhibitors page and Search");

        return driver;
    }

    public AppiumDriver openSpeakersPage() throws NullPointerException, InterruptedException, ClassCastException, MalformedURLException {

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpSpeakersPageTitle.equals(buttonName)) {
                System.out.println("Checking Speakers page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new SpeakersPage().checkPageTitle();
                break;
            }
        }
        return driver;
    }

    public AppiumDriver checkSpeakersPage() throws NullPointerException, InterruptedException, MalformedURLException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver = new SideMenu().openSpeakersPage();
        driver = new SpeakersPage().testSpeakersPage();
        System.out.println("Checked Speakers page and Search");

        return driver;
    }

    public AppiumDriver openSponsorsPage() throws NullPointerException, MalformedURLException, InterruptedException {

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpSponsorsPageTitle.equals(buttonName)) {
                System.out.println("Checking Sponsors page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new SponsorsPage().checkPageTitle();
                break;
            }
        }
        return driver;
    }

    public AppiumDriver checkSponsorsPage() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new SideMenu().openSponsorsPage();
        driver = new SponsorsPage().testSponsorsPage();
        System.out.println("Checked Speakers page and Search");

        return driver;
    }


    public AppiumDriver openSchedulePage() throws NullPointerException, MalformedURLException, InterruptedException {

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpSchedulePageTitle.equals(buttonName)) {
                System.out.println("Checking Sponsors page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new SchedulePage().checkPageTitle();
                break;
            }
        }
        return driver;
    }

    public AppiumDriver checkSchedulePage() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new SideMenu().openSchedulePage();
        driver = new SchedulePage().testSchedulePage();
        System.out.println("Checked Speakers page and Search");

        return driver;
    }

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

