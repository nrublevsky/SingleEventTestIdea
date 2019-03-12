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


    @Test
    public void TCase1() throws MalformedURLException, NullPointerException {
        System.out.println("Testing About page");
        driver = new AboutPage().openAboutPage();
        driver = new AboutPage().checkPageTitle();
        driver = new AboutPage().checkAboutPageInfo();
        driver = new AboutPage().checkLocationLink();
    }



    @After
    public void tear() throws MalformedURLException {
        driver = new AndroidSetupHelper().tearDown();
    }

}
