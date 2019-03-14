package pages;

import io.appium.java_client.android.AndroidDriver;

import static pages.PageTitles.ExpSpeakersPageTitle;
import static scenarios.MasterTest.driver;

public class SpeakersPage {


//  check opening from menu
//already in Side Menu

//  check title

    public AndroidDriver checkPageTitle() throws NullPointerException {

        String ActSpeakersPageTitle = new PageTitles().getActSpeakersPageTitle();

        if (ActSpeakersPageTitle.equals(ExpSpeakersPageTitle)) {
            System.out.println("Speakers Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

//  check search

//  check menu (highlight)
//    public AndroidDriver checkMenuHighlight() throws NullPointerException{
//
//        driver.findElement((By)SideMenu.MenuButton).click();
//
//        return driver;
//    }

//  check opening speaker

//  check leaving


}
