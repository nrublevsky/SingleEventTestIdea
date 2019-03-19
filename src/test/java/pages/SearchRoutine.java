package pages;

import io.appium.java_client.android.AndroidDriver;

import static scenarios.MasterTest.driver;


public class SearchRoutine {


    public AndroidDriver searchRoutine() throws NullPointerException{

//        TouchAction action = new TouchAction(driver);
//        action.press(100, 100).moveTo((100 - 100), (200-100)).release().perform();
//        driver.swipe(100,100,100,200,10);

        return driver;
    }
    //swipe screen
    //tap in the middle
    //take text from title to TalkTitle String
    //create TalkTitle+mess / TalkTitle cut
    //go back to talks page
    //open search
    //search for TalkTitle {
    // open talk
    //compare talk name with TalkTitle
    // }
    //search for TalkTitle+mess {
    // check nothing appeared
    // }
    //search for TalkTitle cut{
    // as  in TalkTitle
    // }
    //repeat with other talk x2


// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]

// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]

}
