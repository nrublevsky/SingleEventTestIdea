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
//    public void TCase() throws MalformedURLException, InterruptedException, NullPointerException {
//
//
//        WebDriverWait wait = new WebDriverWait(driver, 60);
//        String EventNameExp = "Atlassian Summit | San Jose, CA";
//
//        System.out.println("Hola! Starting a Name Check Test");
//        System.out.println("Waiting till Menu button becomes active" + "Waiting for 60 sec (because this PC is slooooooooow)");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")));
//        System.out.println("Clicking Menu button");
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
//        System.out.println("Obtaining Event Name");
//        String EventNameAct = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
//
//        System.out.println("Comparing Expected and Actual Names");
//        if (EventNameAct.equals(EventNameExp)) {
//            System.out.println("Yep, names is correct " +
//                    EventNameAct + " = " + EventNameExp);
//        } else {
//            System.out.println("No, something is wrong here: " +
//                    EventNameAct + " != " + EventNameExp);
//        }
//        System.out.println("This was last step of the test");
//    }
//
    @Test
    public void TCase1() throws MalformedURLException, NullPointerException,InterruptedException {
        System.out.println("Testing About page");
        driver = new AboutPage().openAboutPage();
        driver = new AboutPage().checkAboutPageInfo();
        driver = new AboutPage().checkLocationLink();
    }



    @After
    public void tear() throws MalformedURLException {
        driver = new AndroidSetupHelper().tearDown();
    }

}
