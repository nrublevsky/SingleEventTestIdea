package pages;

import io.appium.java_client.android.AndroidDriver;

import static pages.PageTitles.ExpTalksPageTitle;
import static scenarios.MasterTest.driver;

public class TalksPage {


//check opening from menu
//already in Side Menu

//check title

    public AndroidDriver checkPageTitle() throws NullPointerException {

        String ActTalksPageTitle = new PageTitles().getActTalksPageTitle();

        if (ActTalksPageTitle.equals(ExpTalksPageTitle)) {
            System.out.println("Talks Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }
//check search

//check menu (highlight)

//check opening talk

//check leaving


}
