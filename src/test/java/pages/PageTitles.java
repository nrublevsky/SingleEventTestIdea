package pages;

import org.openqa.selenium.By;

import static scenarios.MasterTest.driver;

public class PageTitles {


//        ArrayList<MobileElement> pageTitlesList = new ArrayList<MobileElement>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<MobileElement> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(MobileElement mobileElement) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends MobileElement> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends MobileElement> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public MobileElement get(int index) {
//                return null;
//            }
//
//            @Override
//            public MobileElement set(int index, MobileElement element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, MobileElement element) {
//
//            }
//
//            @Override
//            public MobileElement remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<MobileElement> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<MobileElement> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<MobileElement> subList(int fromIndex, int toIndex) {
//                return null;
//            }
//        };
//        MobileElement SchedulePageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
//        pageTitlesList.add(0,SchedulePageTitle);
//        MobileElement AboutPageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
//        pageTitlesList.add(1,AboutPageTitle);
//        MobileElement MapPageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
//        pageTitlesList.add(2,MapPageTitle);
//        MobileElement AgendaPageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
//        pageTitlesList.add(3,AgendaPageTitle);
//        MobileElement SpeakersPageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
//        pageTitlesList.add(4,SpeakersPageTitle);
//        MobileElement ExhibitorsPageTitle = (MobileElement) driver.findElement(By.xpath(" "));
//        pageTitlesList.add(5,ExhibitorsPageTitle);
//        MobileElement NewsPageTitle = (MobileElement) driver.findElement(By.xpath(" "));
//        pageTitlesList.add(6,NewsPageTitle);
//        MobileElement SponsorsPageTitle = (MobileElement) driver.findElement(By.xpath(" "));
//        pageTitlesList.add(7,SponsorsPageTitle);
//        MobileElement TalksPageTitle = (MobileElement) driver.findElement(By.xpath(" "));
//        pageTitlesList.add(8,TalksPageTitle);


    //___________Schedule page_________________
    public static String ExpSchedulePageTitle = "Schedule";
//    public static MobileElement SchedulePageTitle = (MobileElement) driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //____________About page_________________
    public static String ExpAboutPageTitle = "About";
//    public static WebElement AboutPageTitle = (MobileElement) driver.findElement(By.className("android.widget.TextView"));
    // ___________Map page___________________
    public static String ExpMapPageTitle = "Map";
//    public static MobileElement MapPageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //___________Agenda page_________________
    public static String ExpAgendaPageTitle = "Agenda";
//    public static MobileElement AgendaPageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //___________Speakers page_________________
    public static String ExpSpeakersPageTitle = "Speakers";
//    public static MobileElement SpeakersPageTitle = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));
    //___________Exhibitors page_________________
    public static String ExpExhibitorsPageTitle = "Exhibitors";
//    public static MobileElement ExhibitorsPageTitle = (MobileElement) driver.findElement(By.xpath(" "));
    //___________News page_________________
    public static String ExpNewsPageTitle = "News";
//    public static MobileElement NewsPageTitle = (MobileElement) driver.findElement(By.xpath(" "));
    //___________Sponsors page_________________
    public static String ExpSponsorsPageTitle = "Sponsors";
//    public static MobileElement SponsorsPageTitle = (MobileElement) driver.findElement(By.xpath(" "));
    //___________Talks page_________________
    public static String ExpTalksPageTitle = "Talks";
//    public static MobileElement TalksPageTitle = (MobileElement) driver.findElement(By.xpath(" "));


//_________________________
    public static String getExpSchedulePageTitle() {
        return ExpSchedulePageTitle;
    }

    public static String getActSchedulePageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpAboutPageTitle() {
        return ExpAboutPageTitle;
    }

    public static String getActAboutPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpMapPageTitle() {
        return ExpMapPageTitle;
    }

    public static String getActMapPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpAgendaPageTitle() {
        return ExpAgendaPageTitle;
    }

    public static String getActAgendaPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpSpeakersPageTitle() {
        return ExpSpeakersPageTitle;
    }

    public static String getActSpeakersPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpExhibitorsPageTitle() {
        return ExpExhibitorsPageTitle;
    }

    public static String getActExhibitorsPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpNewsPageTitle() {
        return ExpNewsPageTitle;
    }

    public static String getActNewsPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpSponsorsPageTitle() {
        return ExpSponsorsPageTitle;
    }

    public static String getActSponsorsPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

    public static String getExpTalksPageTitle() {
        return ExpTalksPageTitle;
    }

    public static String getActTalksPageTitle() {
        String ActPageTitle = driver.findElement(By.className("android.widget.TextView")).getText();
        return ActPageTitle;
    }

}
