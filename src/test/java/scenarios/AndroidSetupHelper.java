package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetupHelper {

    public AndroidDriver initSetup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus 6");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("appPackage", "com.rozdoum.eventor.lpmd2018");
        caps.setCapability("appActivity", "com.rozdoum.eventor.activities.SchedulerActivity");
//        caps.setCapability("noReset", "true");


        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, caps);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        String SyncMsgExp = "Synchronisation with server, please wait";
        String SyncMsgAct = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).getText();


        driver.launchApp();
        System.out.println("This is routine before each test");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"))));
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
        if (SyncMsgExp.equals(SyncMsgAct)) {
            System.out.println("Synchronisation is going good");
        } else {
            System.out.println("Ooops, Synchronization isn't going anywhere");
        }
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.rozdoum.eventor.lpmd2018:id/alertTitle")));
        System.out.println("Ok, and now to the Tests");

        return driver;
    }

    public AndroidDriver tearDown() throws MalformedURLException {
        AndroidDriver driver = MasterTest.driver;

        System.out.println("This is routine after each test");
        System.out.println("Closing app");
        driver.closeApp();
        return driver;
    }
}