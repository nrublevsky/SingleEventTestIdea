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


    public AppiumDriver openMenu() throws NullPointerException, InterruptedException {
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        System.out.println("Opened Menu");
        return driver;
    }


    public AppiumDriver checkFeedback() throws MalformedURLException, NullPointerException, InterruptedException {
        TouchAction tapOutside = new TouchAction(driver).tap(PointOption.point(300,500)).release();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        List<MobileElement> alertTitle = driver.findElements(By.id("alertTitle"));
        boolean alertTitlePresent = alertTitle.isEmpty();

        if (!alertTitlePresent) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertTitle")));
            System.out.println("Here's feedback window");
            tapOutside.perform();
        }

        return driver;
    }

    public AppiumDriver checkMenuNames() throws NullPointerException, InterruptedException {
        TouchAction action = new TouchAction(driver).press(PointOption.point(200, 1700)).moveTo(PointOption.point(200, 1500)).release();
        WebDriverWait wait = new WebDriverWait(driver,5);

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        String lastElementPresent = menuButtonsPresentList.get(menuButtonsPresentList.size()-1).getText();
        System.out.println("Here are buttons that are present in menu:");
        for (MobileElement element : menuButtonsPresentList) {
            System.out.println(element.getText());
        }
        if (!lastElementPresent.equals("About")) {
            action.perform();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textTextView")));
            List<MobileElement> menuButtonsPresentList1 = driver.findElements(By.id("textTextView"));
            System.out.println(menuButtonsPresentList1.get(menuButtonsPresentList1.size() - 1).getText());
        }
        System.out.println("Checked Present button names");
        return driver;
    }

    public AppiumDriver openAboutPage() throws NullPointerException, InterruptedException, MalformedURLException, ClassCastException {

        TouchAction action = new TouchAction(driver).press(PointOption.point(300, 1703)).moveTo(PointOption.point(300, 1177)).release();

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        if (!menuButtonsPresentList.get(menuButtonsPresentList.size()-1).getText().equals("About")){
            action.perform();
            menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        }
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
        boolean buttonPresent = false;
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpTalksPageTitle.equals(buttonName)) {
                buttonPresent = true;
                System.out.println("Opening Talks page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new TalksPage().checkPageTitle();
                System.out.println("Opened Talks page");
                break;
            }
        }if (!buttonPresent) {
            System.out.println("There's no Talks page");
            driver.quit();
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
        boolean buttonPresent = false;
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpAgendaPageTitle.equals(buttonName)) {
                buttonPresent = true;
                System.out.println("Opening Agenda page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new AgendaPage().checkPageTitle();
                System.out.println("Opened Agenda page");
                break;
            }
        }if (!buttonPresent) {
            System.out.println("There's no Agenda page");
            driver.quit();
        }

        return driver;
    }

    public AppiumDriver checkAgendaPage() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new SideMenu().openAgendaPage();
        driver = new AgendaPage().testAgendaPage();
        System.out.println("Checked Agenda page");

        return driver;
    }

    public AppiumDriver openExhibitorsPage() throws NullPointerException, InterruptedException, MalformedURLException {

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        boolean buttonPresent = false;
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpExhibitorsPageTitle.equals(buttonName)) {
                buttonPresent = true;
                System.out.println("Opening Exhibitors page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new ExhibitorsPage().checkPageTitle();
                System.out.println("Opened Exhibitors page");
                break;
            }
        }if (!buttonPresent) {
            System.out.println("There's no Exhibitors page");
            driver.quit();
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
        boolean buttonPresent = false;
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpSpeakersPageTitle.equals(buttonName)) {
                buttonPresent = true;
                System.out.println("Opening Speakers page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new SpeakersPage().checkPageTitle();
                System.out.println("Opened Speakers page");
                break;
            }
        }if (!buttonPresent) {
            System.out.println("There's no Speakers page");
            driver.quit();
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
        boolean buttonPresent = false;
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpSponsorsPageTitle.equals(buttonName)) {
                buttonPresent = true;
                System.out.println("Opening Sponsors page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new SponsorsPage().checkPageTitle();
                System.out.println("Opened Sponsors page");
                break;
            }
        }if (!buttonPresent) {
            System.out.println("There's no Talks page");
            driver.quit();
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
        boolean buttonPresent = false;
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpSchedulePageTitle.equals(buttonName)) {
                buttonPresent = true;
                System.out.println("Opening Schedule page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new SchedulePage().checkPageTitle();
                System.out.println("Opened Schedule page");
                break;
            }
        }if (!buttonPresent) {
            System.out.println("There's no Talks page");
            driver.quit();
        }
        return driver;
    }

    public AppiumDriver checkSchedulePage() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new SideMenu().openSchedulePage();
        driver = new SchedulePage().testSchedulePage();
        System.out.println("Checked Speakers page and Search");

        return driver;
    }


    public AppiumDriver openMapPage() throws NullPointerException, MalformedURLException, InterruptedException {

        List<MobileElement> menuButtonsPresentList = driver.findElements(By.id("textTextView"));
        boolean buttonPresent = false;
        for (MobileElement element : menuButtonsPresentList) {
            String buttonName = element.getText();
            if (ExpMapPageTitle.equals(buttonName)) {
                buttonPresent = true;
                System.out.println("Opening Map page");
                element.click();
                driver = new SideMenu().checkFeedback();
                driver = new MapPage().checkPageTitle();
                System.out.println("Opened Map page");
                break;
            }
        }if (!buttonPresent) {
            System.out.println("There's no Map page");
            driver.quit();
        }
        return driver;
    }

    public AppiumDriver checkMapPage() throws NullPointerException, InterruptedException, MalformedURLException {

        driver = new SideMenu().openMapPage();
        driver = new MapPage().testMapPage();
        System.out.println("Checked Map page and Search");

        return driver;
    }


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

