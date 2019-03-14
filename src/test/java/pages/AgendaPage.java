package pages;

import io.appium.java_client.android.AndroidDriver;

import static pages.PageTitles.ExpAgendaPageTitle;
import static scenarios.MasterTest.driver;

public class AgendaPage {

//check opening from menu
//already in Side menu

//check page title
public AndroidDriver checkPageTitle() throws NullPointerException {

    String ActAgendaPageTitle = new PageTitles().getActAgendaPageTitle();

    if (ActAgendaPageTitle.equals(ExpAgendaPageTitle)) {
        System.out.println("Agenda Page Title is correct");
    } else {
        System.out.println("!!! Something is wrong");
    }

    return driver;
}






}
