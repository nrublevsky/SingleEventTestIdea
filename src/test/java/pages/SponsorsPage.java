package pages;

import io.appium.java_client.android.AndroidDriver;

import static pages.PageTitles.ExpSponsorsPageTitle;
import static scenarios.MasterTest.driver;

public class SponsorsPage {


//check opening from menu
//already in side menu

//check title

    public AndroidDriver checkPageTitle() throws NullPointerException {

        String ActSponsorsPageTitle = new PageTitles().getActSponsorsPageTitle();

        if (ActSponsorsPageTitle.equals(ExpSponsorsPageTitle)) {
            System.out.println("Sponsors Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }
//check search

//check menu (highlight)

//check opening sponsor

//check leaving


}
