package pages;

import io.appium.java_client.android.AndroidDriver;

import static pages.PageTitles.ExpMapPageTitle;
import static scenarios.MasterTest.driver;

public class MapPage {


//check opening from menu
//already in Side menu

//check title

    public AndroidDriver checkPageTitle() throws NullPointerException {

        String ActSpeakersPageTitle = new PageTitles().getActMapPageTitle();

        if (ActSpeakersPageTitle.equals(ExpMapPageTitle)) {
            System.out.println("Speakers Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

//check menu (highlight)

//check switching to plan/map if avail

//check leaving


}
