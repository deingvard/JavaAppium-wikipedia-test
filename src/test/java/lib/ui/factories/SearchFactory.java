package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SearchSteps;
import lib.ui.android.AndroidSearchSteps;
import lib.ui.ios.IOSSearchSteps;

public class SearchFactory {
    public static SearchSteps get(AppiumDriver driver) {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidSearchSteps(driver);
        } else {
            return new IOSSearchSteps(driver);
        }
    }

}
