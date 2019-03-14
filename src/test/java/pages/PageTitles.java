package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static scenarios.MasterTest.driver;

public class PageTitles {

    //___________Schedule page_________________
    public static String ExpSchedulePageTitle = "Schedule";
    public static WebElement SchedulePageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //____________About page_________________
    public static String ExpAboutPageTitle = "About";
    public static WebElement AboutPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    // ___________Map page___________________
    public static String ExpMapPageTitle = "Map";
    public static WebElement MapPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //___________Agenda page_________________
    public static String ExpAgendaPageTitle = "Agenda";
    public static WebElement AgendaPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //___________Speakers page_________________
    public static String ExpSpeakersPageTitle = "Speakers";
    public static WebElement SpeakersPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //___________Exhibitors page_________________
    public static String ExpExhibitorsPageTitle = "Exhibitors";
    public static WebElement ExhibitorsPageTitle = driver.findElement(By.xpath(" "));
    //___________News page_________________
    public static String ExpNewsPageTitle = "News";
    public static WebElement NewsPageTitle = driver.findElement(By.xpath(" "));
    //___________Sponsors page_________________
    public static String ExpSponsorsPageTitle = "Sponsors";
    public static WebElement SponsorsPageTitle = driver.findElement(By.xpath(" "));
    //___________Talks page_________________
    public static String ExpTalksPageTitle = "Talks";
    public static WebElement TalksPageTitle = driver.findElement(By.xpath(" "));

    public static String getExpSchedulePageTitle() {
        return ExpSchedulePageTitle;
    }

    public static String getActSchedulePageTitle() {
        String ActPageTitle = SchedulePageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpAboutPageTitle() {
        return ExpAboutPageTitle;
    }

    public static String getActAboutPageTitle() {
        String ActPageTitle = AboutPageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpMapPageTitle() {
        return ExpMapPageTitle;
    }

    public static String getActMapPageTitle() {
        String ActPageTitle = MapPageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpAgendaPageTitle() {
        return ExpAgendaPageTitle;
    }

    public static String getActAgendaPageTitle() {
        String ActPageTitle = AgendaPageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpSpeakersPageTitle() {
        return ExpSpeakersPageTitle;
    }

    public static String getActSpeakersPageTitle() {
        String ActPageTitle = SpeakersPageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpExhibitorsPageTitle() {
        return ExpExhibitorsPageTitle;
    }

    public static String getActExhibitorsPageTitle() {
        String ActPageTitle = ExhibitorsPageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpNewsPageTitle() {
        return ExpNewsPageTitle;
    }

    public static String getActNewsPageTitle() {
        String ActPageTitle = NewsPageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpSponsorsPageTitle() {
        return ExpSponsorsPageTitle;
    }

    public static String getActSponsorsPageTitle() {
        String ActPageTitle = SponsorsPageTitle.getText();
        return ActPageTitle;
    }

    public static String getExpTalksPageTitle() {
        return ExpTalksPageTitle;
    }

    public static String getActTalksPageTitle() {
        String ActPageTitle = TalksPageTitle.getText();
        return ActPageTitle;
    }

}
