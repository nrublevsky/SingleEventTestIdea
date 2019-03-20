package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.AboutPage;

import java.net.MalformedURLException;

public class MasterTest {

    public static AndroidDriver driver;

    @Before
    public void init() throws MalformedURLException {
        driver = new AndroidSetupHelper().initSetup();

    }


//    @Test
//    public void TCaseMenu() throws MalformedURLException, NullPointerException {
//        System.out.println("Testing Menu");
//        driver = new SideMenu().openMenu();
//        driver = new SideMenu().openAboutPage();
////        driver = new SideMenu().checkMenuButtonsPresent();
////        driver = new SideMenu().checkMenuRedirects();
//    }

    @Test
    public void TCaseAboutPage() throws MalformedURLException, NullPointerException {
        System.out.println("Testing About page");
        driver = new AboutPage().testAboutPage();
    }

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
