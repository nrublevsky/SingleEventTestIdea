package pages;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import static pages.PageTitles.ExpExhibitorsPageTitle;
import static scenarios.MasterTest.driver;

public class ExhibitorsPage {


//check opening from menu
//already is Side menu

    //check title
    public AppiumDriver checkPageTitle() throws NullPointerException {

        String ActExhibitorsPageTitle = new PageTitles().getActExhibitorsPageTitle();

        if (ActExhibitorsPageTitle.equals(ExpExhibitorsPageTitle)) {
            System.out.println("Exhibitors Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }
        return driver;
    }
    //check search

    public AppiumDriver testExhibitorsPage() throws NullPointerException, MalformedURLException, InterruptedException {

        driver = new SearchRoutine().searchExhibitors();

        return driver;
    }

//check menu (highlight)

//check opening exhibitor

//check leaving


}
