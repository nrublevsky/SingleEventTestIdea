package pages;

import io.appium.java_client.android.AndroidDriver;

import static pages.PageTitles.ExpExhibitorsPageTitle;
import static scenarios.MasterTest.driver;

public class ExhibitorsPage {


//check opening from menu
//already is Side menu

    //check title
    public AndroidDriver checkPageTitle() throws NullPointerException {

        String ActSpeakersPageTitle = new PageTitles().getActExhibitorsPageTitle();

        if (ActSpeakersPageTitle.equals(ExpExhibitorsPageTitle)) {
            System.out.println("Speakers Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }
//check search

//check menu (highlight)

//check opening exhibitor

//check leaving


}
