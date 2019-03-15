package pages.Items;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static scenarios.MasterTest.driver;

public class Talk {

    public static String TalkName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]")).getText();

    public AndroidDriver checkTalkName() throws NullPointerException {

        WebDriverWait wait = new WebDriverWait(driver,30);



        return driver;
    }


}
