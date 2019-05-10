package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static pages.PageTitles.ExpNewsPageTitle;
import static scenarios.MasterTest.driver;

public class NewsPage {


//check opening from menu
//already in Side Menu

    //check title
    public AppiumDriver checkPageTitle() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("android.widget.TextView"))));
        String ActNewsPageTitle = new PageTitles().getActNewsPageTitle();

        if (ActNewsPageTitle.equals(ExpNewsPageTitle)) {
            System.out.println("News Page Title is correct");
        } else {
            System.out.println("!!! Something is wrong");
        }

        return driver;
    }

    public AppiumDriver testNewsPage() throws MalformedURLException, InterruptedException {

        driver = new SearchRoutine().searchNews();

        return driver;
    }
//check search

//check menu (highlight)

//check opening news

//check leaving


}
