package pages;

import org.openqa.selenium.By;

import static scenarios.MasterTest.driver;

public class PageTitles {


    //___________Schedule page_________________
    public static String ExpSchedulePageTitle = "Schedule";
    //____________About page_________________
    public static String ExpAboutPageTitle = "About";
    // ___________Map page___________________
    public static String ExpMapPageTitle = "Map";
    //___________Agenda page_________________
    public static String ExpAgendaPageTitle = "Agenda";
    //___________Speakers page_________________
    public static String ExpSpeakersPageTitle = "Speakers";
    //___________Exhibitors page_________________
    public static String ExpExhibitorsPageTitle = "Exhibitors";
    //___________News page_________________
    public static String ExpNewsPageTitle = "News";
    //___________Sponsors page_________________
    public static String ExpSponsorsPageTitle = "Sponsors";
    //___________Talks page_________________
    public static String ExpTalksPageTitle = "Talks";


    //_________________________
    public static String getExpSchedulePageTitle() {
        return ExpSchedulePageTitle;
    }

    public static String getActSchedulePageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpAboutPageTitle() {
        return ExpAboutPageTitle;
    }

    public static String getActAboutPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpMapPageTitle() {
        return ExpMapPageTitle;
    }

    public static String getActMapPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpAgendaPageTitle() {
        return ExpAgendaPageTitle;
    }

    public static String getActAgendaPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpSpeakersPageTitle() {
        return ExpSpeakersPageTitle;
    }

    public static String getActSpeakersPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpExhibitorsPageTitle() {
        return ExpExhibitorsPageTitle;
    }

    public static String getActExhibitorsPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpNewsPageTitle() {
        return ExpNewsPageTitle;
    }

    public static String getActNewsPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpSponsorsPageTitle() {
        return ExpSponsorsPageTitle;
    }

    public static String getActSponsorsPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpTalksPageTitle() {
        return ExpTalksPageTitle;
    }

    public static String getActTalksPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

}
