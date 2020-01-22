package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListsSteps;

public class IOSMyListsSteps extends MyListsSteps {

    static {
        FOLDER_BY_NAME_TPL = "xpath://*[@text='{FOLDER_NAME}']";
        ARTICLE_BY_TITLE_TPL = "xpath://*[@text='Remove from {TITLE}']";
        NO_THANKS_BUTTON = "id:android:id/button2";
    }

    public IOSMyListsSteps(AppiumDriver driver) {
        super(driver);
    }

}
