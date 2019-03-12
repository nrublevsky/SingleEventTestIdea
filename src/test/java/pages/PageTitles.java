package pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static scenarios.MasterTest.driver;

public class PageTitles {

//___________Schedule page_________________
    public static String ExpSchedulePageTitle = "Schedule";

    public static String getExpSchedulePageTitle() {
        return ExpSchedulePageTitle;
    }

    public static WebElement SchedulePageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));

    public static String getActSchedulePageTitle () {
        String ActPageTitle = SchedulePageTitle.getText();
        return ActPageTitle;
    }

//____________About page_________________
    public static String ExpAboutPageTitle = "About";

    public static String getExpAboutPageTitle(){
        return ExpAboutPageTitle;
    }

    public static WebElement AboutPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));

    public static String getActAboutPageTitle() {
        String ActPageTitle = AboutPageTitle.getText();
        return ActPageTitle;
    }

// ___________Map page___________________
    public static String ExpMapPageTitle = "Map";

    public static String getExpMapPageTitle(){
        return ExpMapPageTitle;
    }

    public static WebElement MapPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));

    public static String getActMapPageTitle () {
        String ActPageTitle = MapPageTitle.getText();
        return ActPageTitle;
    }

//___________Agenda page_________________
    public static String ExpAgendaPageTitle = "Agenda";

    public static String getExpAgendaPageTitle() {
        return ExpAgendaPageTitle;
    }

    public static WebElement AgendaPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));

    public static String getActAgendaPageTitle () {
        String ActPageTitle = AgendaPageTitle.getText();
        return ActPageTitle;
    }

//___________Speakers page_________________
    public static String ExpSpeakersPageTitle = "Speakers";

    public static String getExpSpeakersPageTitle() {
        return ExpSpeakersPageTitle;
    }

    public static WebElement SpeakersPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));

    public static String getActSpeakersPageTitle () {
        String ActPageTitle = SpeakersPageTitle.getText();
        return ActPageTitle;
    }
//___________Exhibitors page_________________
    public static String ExpExhibitorsPageTitle = "Exhibitors";

    public static String getExpExhibitorsPageTitle() {
        return ExpExhibitorsPageTitle;
    }

    public static WebElement ExhibitorsPageTitle = driver.findElement(By.xpath(" "));

    public static String getActExhibitorsPageTitle () {
        String ActPageTitle = ExhibitorsPageTitle.getText();
        return ActPageTitle;
    }
//___________News page_________________
    public static String ExpNewsPageTitle = "News";

    public static String getExpNewsPageTitle() {
        return ExpNewsPageTitle;
    }

    public static WebElement NewsPageTitle = driver.findElement(By.xpath(" "));

    public static String getActNewsPageTitle () {
        String ActPageTitle = NewsPageTitle.getText();
        return ActPageTitle;
    }
//___________Sponsors page_________________
    public static String ExpSponsorsPageTitle = "Sponsors";

    public static String getExpSponsorsPageTitle() {
        return ExpSponsorsPageTitle;
    }

    public static WebElement SponsorsPageTitle = driver.findElement(By.xpath(" "));

    public static String getActSponsorsPageTitle () {
        String ActPageTitle = SponsorsPageTitle.getText();
        return ActPageTitle;
    }
//___________Talks page_________________
    public static String ExpTalksPageTitle = "Talks";

    public static String getExpTalksPageTitle() {
        return ExpTalksPageTitle;
    }

    public static WebElement TalksPageTitle = driver.findElement(By.xpath(" "));

    public static String getActTalksPageTitle () {
        String ActPageTitle = TalksPageTitle.getText();
        return ActPageTitle;
    }

}
