package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.SideMenu;

import java.net.MalformedURLException;

public class MasterTest {

    public static AndroidDriver driver;

    @Before
    public void init() throws MalformedURLException {
        driver = new AndroidSetupHelper().initSetup();

    }


    @Test
    public void TCaseMenu() throws MalformedURLException, NullPointerException, InterruptedException {
        System.out.println("Testing Menu");
        driver = new SideMenu().openMenu();
        System.out.println("Checking Menu buttons present");
        driver = new SideMenu().checkMenuNames();
    }

    @Test
    public void TCaseAboutPage() throws NullPointerException, InterruptedException {
        System.out.println("Checking About page");
        driver = new SideMenu().openMenu();
        driver = new SideMenu().checkAboutButton();
    }

    @Test
    public void TCaseTalksPage() throws MalformedURLException, NullPointerException, InterruptedException {
        System.out.println("Testing Talks page");
        driver = new SideMenu().openMenu();
        driver = new SideMenu().checkTalksButton();


    }


//    @Test
//    public void TCaseAboutPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing About page");
//        driver = new AboutPage().testAboutPage();
//    }

//    @Test
//    public void TCaseMapPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }

//    @Test
//    public void TCaseNewsPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }

//    @Test
//    public void TCaseAgendaPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }

//    @Test
//    public void TCaseExhibitorsPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }

//    @Test
//    public void TCaseMapPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }

//    @Test
//    public void TCaseMapPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }

//    @Test
//    public void TCaseMapPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }

//    @Test
//    public void TCaseMapPage() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Map page");
//        driver = new SideMenu().openMapPage();
//        driver = new MapPage().checkPageTitle();
//
//    }


    @After
    public void tear() throws MalformedURLException {
        driver = new AndroidSetupHelper().tearDown();
    }

}
