package pages;

import io.appium.java_client.AppiumDriver;

import static pages.PageTitles.ExpNewsPageTitle;
import static scenarios.MasterTest.driver;

public class NewsPage {


//check opening from menu
//already in Side Menu

    //check title
    public AppiumDriver checkPageTitle() throws NullPointerException {

        String ActNewsPageTitle = new PageTitles().getActNewsPageTitle();

        if (ActNewsPageTitle.equals(ExpNewsPageTitle)) {
            System.out.println("News Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }
//check search

//check menu (highlight)

//check opening news

//check leaving


}
