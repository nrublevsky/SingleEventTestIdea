package pages;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import static pages.PageTitles.ExpSponsorsPageTitle;
import static scenarios.MasterTest.driver;

public class SponsorsPage {


//check opening from menu
//already in side menu

//check feedback screen



//check title

    public AppiumDriver checkPageTitle() throws NullPointerException {

        String ActSponsorsPageTitle = new PageTitles().getActSponsorsPageTitle();

        if (ActSponsorsPageTitle.equals(ExpSponsorsPageTitle)) {
            System.out.println("Sponsors Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }


//check search
public AppiumDriver testSponsorsPage() throws NullPointerException, MalformedURLException, InterruptedException {

    driver = new SearchRoutine().searchSponsors();

    return driver;
}
//check menu (highlight)

//check opening sponsor

//check leaving


}
