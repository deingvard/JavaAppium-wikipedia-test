package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListsSteps;

public class AndroidMyListsSteps extends MyListsSteps {

    static {
        FOLDER_BY_NAME_TPL = "xpath://*[@text='{FOLDER_NAME}']";
        ARTICLE_BY_TITLE_TPL = "xpath://*[@text='{TITLE}']";
        NO_THANKS_BUTTON = "id:android:id/button2";
    }

    public AndroidMyListsSteps(AppiumDriver driver) {
        super(driver);
    }

}
