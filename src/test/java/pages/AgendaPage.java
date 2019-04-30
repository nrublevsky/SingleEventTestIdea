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
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static pages.PageTitles.ExpAgendaPageTitle;
import static scenarios.MasterTest.driver;

public class AgendaPage {

//check opening from menu
//already in Side menu

    //check page title
    public AppiumDriver checkPageTitle() throws NullPointerException {

        String ActAgendaPageTitle = new PageTitles().getActAgendaPageTitle();

        if (ActAgendaPageTitle.equals(ExpAgendaPageTitle)) {
            System.out.println("Agenda Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }
        return driver;
    }

    public AppiumDriver checkAgendaPlaceholder() throws MalformedURLException, NullPointerException {


        List<MobileElement> agendaTalks = driver.findElements(By.id("talkView"));
        if (agendaTalks.isEmpty()) {
            System.out.println(driver.findElement(By.id("emptyAgendaTextView")).getText());
        }
        return driver;
    }

    public AppiumDriver checkTalkPresentInAgenda(String talkName) throws MalformedURLException, NullPointerException {
        TouchAction action = new TouchAction(driver).press(PointOption.point(482, 1703)).moveTo(PointOption.point(499, 1177)).release();

        System.out.println("Checking talk is present in Agenda page");
        List<MobileElement> talkItems = driver.findElements(By.id("talkTitle"));
        boolean talkPresent = false;
        while (!talkPresent) {
            for (MobileElement element : talkItems) {
                if (element.getText().equals(talkName)) {
                    talkPresent = true;
                    System.out.println("Found " + talkName);
                    break;
                }
            }
            if (!talkPresent){
                    action.perform();
                    talkItems.clear();
                    talkItems = driver.findElements(By.id("talkTitle"));
            }
        }
        return driver;
    }

    public AppiumDriver checkAddingTalkViaTalk() throws MalformedURLException, NullPointerException, InterruptedException {
        TouchAction action = new TouchAction(driver).press(PointOption.point(482, 1703)).moveTo(PointOption.point(499, 1177)).release();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        System.out.println("Adding talk to Agenda using Talk");
//open menu
        driver = new SideMenu().openMenu();
//open Talks page
        driver = new SideMenu().openTalksPage();
    //open talk
        List<MobileElement> talkItems = driver.findElements(By.id("talkContainer"));
        int i = new Random().nextInt(talkItems.size() - 1);
        talkItems.get(i).click();
    //get Talk name
        String talkName = driver.findElement(By.id("titleTextView")).getText();
    //click Add to agenda
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addToAgendaSwitchCompat")));
        driver.findElement(By.id("addToAgendaSwitchCompat")).click();
    //open menu
        driver = new SideMenu().openMenu();
    //open agenda page
        driver = new SideMenu().openAgendaPage();
    //check talk name present in Agenda
        driver = new AgendaPage().checkTalkPresentInAgenda(talkName);
    //check Add to agenda slider status
        driver.navigate().back();
        return driver;
    }

    public AppiumDriver checkAgendaEnabledSpeakers()  throws MalformedURLException, NullPointerException, InterruptedException {

        String agendaSwitcherState = driver.findElement(By.id("addToAgendaSwitchCompat")).getText();
        String agendaSwitcherEnabled = "Add to Agenda ON";

        while (agendaSwitcherState.equals(agendaSwitcherEnabled)){
//            driver.navigate().back();
//            driver = new AgendaPage().openSpeakerWithTalk();
//            driver = new AgendaPage().checkAgendaEnabledSpeakers();
        }
        return driver;
    }

    private AppiumDriver subToTalkInSpeaker(int speakerNum ,List<MobileElement> speakerItems, List<MobileElement> talksPresent) throws MalformedURLException, NullPointerException, InterruptedException {
        int talkNum = 0;
        if (talksPresent.size() > 1) {
            while (talkNum < talksPresent.size()-1 ) {
                talksPresent.get(talkNum).click();
                String agendaSwitcherState = driver.findElement(By.id("addToAgendaSwitchCompat")).getText();
                String agendaSwitcherEnabled = "Add to Agenda ON";
                if (!agendaSwitcherState.equals(agendaSwitcherEnabled)) {
                    driver.findElement(By.id("addToAgendaSwitchCompat")).click();
                    break;
                } else {
                    driver.navigate().back();
                    talkNum++;
                }
            }
        }
        if (talksPresent.size() == 1) {
            talksPresent.get(0).click();
            String agendaSwitcherState = driver.findElement(By.id("addToAgendaSwitchCompat")).getText();
            String agendaSwitcherEnabled = "Add to Agenda ON";
            if (!agendaSwitcherState.equals(agendaSwitcherEnabled)) {
                driver.findElement(By.id("addToAgendaSwitchCompat")).click();
            } else {
                driver.navigate().back();
                driver.navigate().back();
                speakerNum++;
            }
        }

        return driver;
    }

    public AppiumDriver openSpeakerWithTalk() throws MalformedURLException, NullPointerException, InterruptedException {
        TouchAction action = new TouchAction(driver).press(PointOption.point(482, 1703)).moveTo(PointOption.point(499, 1500)).release();
        int speakerNum = 0;
            //gather speakers and create speakersList
            List<MobileElement> speakerItems = driver.findElements(By.id("titleTextView"));
            //open speaker from list
        while (speakerNum < speakerItems.size()-1) {
            speakerItems.get(speakerNum).click();
            //create talks list
            List<MobileElement> talksPresent = driver.findElements(By.id("talkContainer"));
            if (!talksPresent.isEmpty()) {
                driver = new AgendaPage().subToTalkInSpeaker(speakerNum, speakerItems, talksPresent);
                break;
            }
            if (talksPresent.isEmpty()) {
                driver.navigate().back();
                speakerNum++;
            }
        }



//        List<MobileElement> speakerItems = driver.findElements(By.id("titleTextView"));
//        int i = new Random().nextInt(speakerItems.size()-1);
//        speakerItems.get(i).click();
//        List<MobileElement> talksPresent = driver.findElements(By.id("talkContainer"));
//        if (!talksPresent.isEmpty()){
//            i = new Random().nextInt(talksPresent.size());
//            talksPresent.get(i).click();
//        }else {
//            driver.navigate().back();
//            action.perform();
//            driver = new AgendaPage().openSpeakerWithTalk();
//        }

        return driver;
    }

    public AppiumDriver checkAddingTalkViaSpeaker() throws MalformedURLException, NullPointerException, InterruptedException {

        TouchAction action = new TouchAction(driver).press(PointOption.point(482, 1703)).moveTo(PointOption.point(499, 1177)).release();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        System.out.println("Adding talk to Agenda using Speaker");
    //open menu
        driver = new SideMenu().openMenu();
    //open Speakers page
        driver = new SideMenu().openSpeakersPage();
    //open speaker
        driver = new AgendaPage().openSpeakerWithTalk();
//        driver = new AgendaPage().checkAgendaEnabledSpeakers();
//    //click Add to Agenda
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addToAgendaSwitchCompat")));
//        driver.findElement(By.id("addToAgendaSwitchCompat")).click();
    //get Talk name
        String talkName = driver.findElement(By.id("titleTextView")).getText();
    //open menu
        driver = new SideMenu().openMenu();
    //open agenda page
        driver = new SideMenu().openAgendaPage();
    //check talk name present
        driver = new AgendaPage().checkTalkPresentInAgenda(talkName);
        driver.navigate().back();
        return driver;
    }



    public AppiumDriver openTalkInSchedule()  throws MalformedURLException, NullPointerException, InterruptedException{
        TouchAction actionV = new TouchAction(driver).press(PointOption.point(482, 1703)).moveTo(PointOption.point(499, 1177)).release();
        TouchAction actionH = new TouchAction(driver).press(PointOption.point(682, 1703)).moveTo(PointOption.point(450, 1703)).release();
//find talk
        List<MobileElement> talkItems = driver.findElements(By.id("talkView"));
        int i = new Random().nextInt(talkItems.size());
        talkItems.get(i).click();
        String agendaSwitcherState = driver.findElement(By.id("addToAgendaSwitchCompat")).getText();
        String agendaSwitcherEnabled = "Add to Agenda ON";
        System.out.println();
//check if already subscribed
        while (agendaSwitcherState.equals(agendaSwitcherEnabled)){
            driver.navigate().back();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            actionV.perform();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            talkItems.clear();
            talkItems = driver.findElements(By.id("talkView"));
            i = new Random().nextInt(talkItems.size());
            talkItems.get(i).click();
            agendaSwitcherState = driver.findElement(By.id("addToAgendaSwitchCompat")).getText();
        }

        return driver;
    }

    public AppiumDriver checkAgendaEnabledSchedule()  throws MalformedURLException, NullPointerException, InterruptedException {

        String agendaSwitcherEnabled = driver.findElement(By.id("addToAgendaSwitchCompat")).getAttribute("checked");

        while (agendaSwitcherEnabled == "true"){
            driver.navigate().back();

            driver = new AgendaPage().openTalkInSchedule();
            driver = new AgendaPage().checkAgendaEnabledSchedule();
        }
        return driver;
    }

    public AppiumDriver checkAddingTalkViaSchedule() throws MalformedURLException, NullPointerException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        System.out.println("Adding talk to Agenda using Schedule");

    //open menu
        driver = new SideMenu().openMenu();
    //open Schedule page
       driver = new SideMenu().openSchedulePage();
    //open talk
        driver = new AgendaPage().openTalkInSchedule();
    //get Talk name
        String talkName = driver.findElement(By.id("titleTextView")).getText();
    //click Add to agenda
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addToAgendaSwitchCompat")));
        driver.findElement(By.id("addToAgendaSwitchCompat")).click();
    //open menu
        driver = new SideMenu().openMenu();
    //open agenda page
        driver = new SideMenu().openAgendaPage();
    //check talk name present in Agenda
        System.out.println("Checking talk is present in Agenda page");
        driver = new AgendaPage().checkTalkPresentInAgenda(talkName);
        driver.navigate().back();
        return driver;
    }

    public AppiumDriver checkClearingAgenda() throws MalformedURLException, NullPointerException, InterruptedException {
        TouchAction action = new TouchAction(driver).press(PointOption.point(482, 1703)).moveTo(PointOption.point(499, 1503)).release();
        WebDriverWait wait = new WebDriverWait(driver, 5);

    //open menu
        driver = new SideMenu().openMenu();

    //open Agenda page
        driver = new SideMenu().openAgendaPage();
        System.out.println("Unsubscribing from all Talks in Agenda");
    //unsubscribe talks until placeholder is displayed
        List<MobileElement> agendaTalks = driver.findElements(By.id("talkView"));
        while (!agendaTalks.isEmpty()) {
            agendaTalks.get(0).click();
            driver.findElement(By.id("addToAgendaSwitchCompat")).click();
            driver.findElement(By.id("closeDetailsButton")).click();
            agendaTalks = driver.findElements(By.id("talkView"));
        }
        driver = new AgendaPage().checkAgendaPlaceholder();
        return driver;
    }

    public AppiumDriver testAgendaPage() throws MalformedURLException, NullPointerException, InterruptedException {

        driver = new AgendaPage().checkAgendaPlaceholder();
        driver = new AgendaPage().checkAddingTalkViaTalk();
        driver = new AgendaPage().checkAddingTalkViaSpeaker();
        driver = new AgendaPage().checkAddingTalkViaSchedule();
        driver = new AgendaPage().checkClearingAgenda();

        return driver;
    }


}
