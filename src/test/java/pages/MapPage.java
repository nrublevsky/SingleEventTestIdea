package pages;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static scenarios.MasterTest.driver;

public class MapPage {

    public static String ExpMapPageTitle = "Map";

    public static String getExpMapPageTitlte(){
        return ExpMapPageTitle;
    }


    public static WebElement MapPageTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));

    public static String getActMapPageTitle () {
        String ActPageTitle = MapPageTitle.getText();
        return ActPageTitle;
    }


}
