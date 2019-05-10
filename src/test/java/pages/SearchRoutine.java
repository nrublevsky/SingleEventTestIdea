package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import static scenarios.MasterTest.driver;


public class SearchRoutine {

    public AppiumDriver openSearch()throws NullPointerException{
        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("action_search")));
        driver.findElement(By.id("action_search")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("search_src_text")));
        driver.findElement(By.id("search_src_text")).click();

        return driver;
    }

    public AppiumDriver searchTalks() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 15);


        List<MobileElement> talkItems = driver.findElements(By.id("talkContainer"));
        Random rand = new Random();
        int i = rand.nextInt(talkItems.size());
        talkItems.get(i).click();

//wait till talk opened
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("titleTextView")));

//take talk title and create TalkTitleCorrect
        String titleCorrect = driver.findElement(By.id("titleTextView")).getText();
        System.out.println("Search routine for '" + titleCorrect + "'");

//create TalkTitleCut and TalkTitleWrong
        String titleCut = titleCorrect.substring(0, (titleCorrect.length() / 2));
        String mess = "iu3h4iuth";
        String titleIncorrect = titleCut.concat(mess);

//get back
        driver.findElement(By.id("closeDetailsButton")).click();

//tap search field
        driver = new SearchRoutine().openSearch();

//__________Checking_with_Title_Correct___________________________________
        System.out.println("Checking search with correct query");
//enter TalkTitle
        driver.findElement(By.id("search_src_text")).sendKeys(titleCorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults1 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults1) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Cut_____________________________________
        System.out.println("Checking search with shortened correct query. Should be at least one correct result");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleCut);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults2 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults2) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Incorrect_____________________________________
        System.out.println("Checking search with incorrect search query");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleIncorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults3 = driver.findElements(By.id("titleTextView"));

//check results
        if (searchResults3.isEmpty()) {
            System.out.println("Correct results for incorrect search query");
        } else {
            System.out.println("!!! Something is wrong");
        }

//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();
        driver.navigate().back();

        return driver;
    }


    public AppiumDriver searchSpeakers() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 15);


        List<MobileElement> speakerItems = driver.findElements(By.id("titleTextView"));
        Random rand = new Random();
        int i = rand.nextInt(speakerItems.size());
        speakerItems.get(i).click();

//wait till talk opened
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameTextView")));

//take talk title and create TalkTitleCorrect
        String titleCorrect = driver.findElement(By.id("nameTextView")).getText();
        System.out.println("Search routine for '" + titleCorrect + "'");

//create TalkTitleCut and TalkTitleWrong
        String titleCut = titleCorrect.substring(0, (titleCorrect.length() / 2));
        String mess = "iu3h4iuth";
        String titleIncorrect = titleCut.concat(mess);

//get back
        driver.findElement(By.id("closeDetailsButton")).click();

//tap search field
        driver = new SearchRoutine().openSearch();

//__________Checking_with_Title_Correct___________________________________
        System.out.println("Checking search with correct query");
//enter TalkTitle
        driver.findElement(By.id("search_src_text")).sendKeys(titleCorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults1 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults1) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Cut_____________________________________
        System.out.println("Checking search with shortened correct query. Should be at least one correct result");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleCut);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults2 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults2) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Incorrect_____________________________________
        System.out.println("Checking search with incorrect search query");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleIncorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults3 = driver.findElements(By.id("titleTextView"));

//check results
        if (searchResults3.isEmpty()) {
            System.out.println("Correct results for incorrect search query");
        } else {
            System.out.println("!!! Seomething is wrong");
        }

//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();
        driver.navigate().back();

        return driver;
    }

    public AppiumDriver searchSponsors() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 15);


        List<MobileElement> speakerItems = driver.findElements(By.id("titleTextView"));
        Random rand = new Random();
        int i = rand.nextInt(speakerItems.size());
        speakerItems.get(i).click();

//wait till talk opened
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("titleTextView")));

//take talk title and create TalkTitleCorrect
        String titleCorrect = driver.findElement(By.id("titleTextView")).getText();
        System.out.println("Search routine for '" + titleCorrect + "'");

//create TalkTitleCut and TalkTitleWrong
        String titleCut = titleCorrect.substring(0, (titleCorrect.length() / 2));
        String mess = "iu3h4iuth";
        String titleIncorrect = titleCut.concat(mess);

//get back
        driver.findElement(By.id("closeDetailsButton")).click();

//tap search field
        driver = new SearchRoutine().openSearch();

//__________Checking_with_Title_Correct___________________________________
        System.out.println("Checking search with correct query");
//enter TalkTitle
        driver.findElement(By.id("search_src_text")).sendKeys(titleCorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults1 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults1) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Cut_____________________________________
        System.out.println("Checking search with shortened correct query. Should be at least one correct result");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleCut);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults2 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults2) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Incorrect_____________________________________
        System.out.println("Checking search with incorrect search query");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleIncorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults3 = driver.findElements(By.id("titleTextView"));

//check results
        if (searchResults3.isEmpty()) {
            System.out.println("Correct results for incorrect search query");
        } else {
            System.out.println("!!! Seomething is wrong");
        }

//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();
        driver.navigate().back();

        return driver;
    }

    public AppiumDriver searchExhibitors() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 15);


        List<MobileElement> speakerItems = driver.findElements(By.id("titleTextView"));
        Random rand = new Random();
        int i = rand.nextInt(speakerItems.size());
        speakerItems.get(i).click();

//wait till talk opened
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("titleTextView")));

//take talk title and create TalkTitleCorrect
        String titleCorrect = driver.findElement(By.id("titleTextView")).getText();
        System.out.println("Search routine for '" + titleCorrect + "'");

//create TalkTitleCut and TalkTitleWrong
        String titleCut = titleCorrect.substring(0, (titleCorrect.length() / 2));
        String mess = "iu3h4iuth";
        String titleIncorrect = titleCut.concat(mess);

//get back
        driver.findElement(By.id("closeDetailsButton")).click();

//tap search field
        driver = new SearchRoutine().openSearch();

//__________Checking_with_Title_Correct___________________________________
        System.out.println("Checking search with correct query");
//enter TalkTitle
        driver.findElement(By.id("search_src_text")).sendKeys(titleCorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults1 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults1) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Cut_____________________________________
        System.out.println("Checking search with shortened correct query. Should be at least one correct result");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleCut);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults2 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults2) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Incorrect_____________________________________
        System.out.println("Checking search with incorrect search query");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleIncorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults3 = driver.findElements(By.id("titleTextView"));

//check results
        if (searchResults3.isEmpty()) {
            System.out.println("Correct results for incorrect search query");
        } else {
            System.out.println("!!! Seomething is wrong");
        }

//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();
        driver.navigate().back();

        return driver;
    }

    public AppiumDriver searchNews() throws NullPointerException {
        WebDriverWait wait = new WebDriverWait(driver, 15);


        List<MobileElement> newsItems = driver.findElements(By.id("titleTextView"));
        Random rand = new Random();
        int i = rand.nextInt(newsItems.size());
        newsItems.get(i).click();

//wait till talk opened
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("titleTextView")));

//take talk title and create TalkTitleCorrect
        String titleCorrect = driver.findElement(By.id("titleTextView")).getText();
        System.out.println("Search routine for '" + titleCorrect + "'");

//create TalkTitleCut and TalkTitleWrong
        String titleCut = titleCorrect.substring(0, (titleCorrect.length() / 2));
        String mess = "iu3h4iuth";
        String titleIncorrect = titleCut.concat(mess);

//get back
        driver.findElement(By.id("closeDetailsButton")).click();

//tap search field
        driver = new SearchRoutine().openSearch();

//__________Checking_with_Title_Correct___________________________________
        System.out.println("Checking search with correct query");
//enter TalkTitle
        driver.findElement(By.id("search_src_text")).sendKeys(titleCorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults1 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults1) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Cut_____________________________________
        System.out.println("Checking search with shortened correct query. Should be at least one correct result");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleCut);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults2 = driver.findElements(By.id("titleTextView"));

//check results
        for (MobileElement element : searchResults2) {
            if (element.getText().equals(titleCorrect)) {
                System.out.println("Found what was looking for");
            } else {
                System.out.println("!!! Something is wrong");
            }
        }
//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();

//__________Checking_with_Title_Incorrect_____________________________________
        System.out.println("Checking search with incorrect search query");
//enter TalkTitleCut
        driver.findElement(By.id("search_src_text")).sendKeys(titleIncorrect);
        driver.hideKeyboard();

//create list of results
        List<MobileElement> searchResults3 = driver.findElements(By.id("titleTextView"));

//check results
        if (searchResults3.isEmpty()) {
            System.out.println("Correct results for incorrect search query");
        } else {
            System.out.println("!!! Something is wrong");
        }

//tap search field
        driver.findElement(By.id("search_src_text")).click();

//clear search field
        driver.findElement(By.id("search_src_text")).clear();
        driver.navigate().back();

        return driver;
    }
}