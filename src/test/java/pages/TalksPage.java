package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

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

    public AndroidDriver checkSearchTalks() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
//scroll page
//        TouchActions action = new TouchActions(driver);
//        action.scroll(10, 100);
//        action.perform();
        driver = new SearchRoutine().searchRoutineTalks();
        return driver;
    }

//check menu (highlight)

//check opening talk

//check leaving

    public AndroidDriver testTalksPage() throws NullPointerException, MalformedURLException {


        driver = new TalksPage().checkSearchTalks();


        return driver;
    }

}
