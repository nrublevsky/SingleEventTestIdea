package pages;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static scenarios.MasterTest.driver;

public class NewsPage {


public static AndroidElement NewsPageTitle = (AndroidElement) driver.findElement(By.xpath(""));

    public static String getActNewsPageTitle () {
        String ActPageTitle = NewsPageTitle.getText();
        return ActPageTitle;
    }



}
