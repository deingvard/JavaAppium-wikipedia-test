package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.NavigationSteps;

public class IOSNavigationSteps extends NavigationSteps {

    static {
        MY_LISTS_LINK = "id:Saved";
    }

    public IOSNavigationSteps(AppiumDriver driver) {
        super(driver);
    }
}
