package pages;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import static pages.PageTitles.ExpSchedulePageTitle;
import static scenarios.MasterTest.driver;

public class SchedulePage {

//check opening from menu
//already in Side menu

    //check title
    public AppiumDriver checkPageTitle() throws NullPointerException {

        String ActSchedulePageTitle = new PageTitles().getActSchedulePageTitle();

        if (ActSchedulePageTitle.equals(ExpSchedulePageTitle)) {
            System.out.println("Schedule Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }
//check menu (highlight)

//check swiping?

//check dates (switching)

//check opening talk


    public AppiumDriver testSchedulePage() throws NullPointerException, MalformedURLException {

        return driver;
    }


}
