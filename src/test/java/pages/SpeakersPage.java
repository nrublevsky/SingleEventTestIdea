package pages;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

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
    public AndroidDriver testSpeakersPage() throws NullPointerException, MalformedURLException, InterruptedException {

        driver = new SearchRoutine().searchSpeakers();

        return driver;
    }





//  check opening speaker

//  check leaving


}
