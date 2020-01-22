package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.NavigationSteps;

public class AndroidNavigationSteps extends NavigationSteps {

    static {
        MY_LISTS_LINK = "id:page_action_overflow_reading_lists";
    }

    public AndroidNavigationSteps(AppiumDriver driver) {
        super(driver);
    }
}
