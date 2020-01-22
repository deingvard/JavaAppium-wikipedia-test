package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.NavigationSteps;
import lib.ui.android.AndroidNavigationSteps;
import lib.ui.ios.IOSNavigationSteps;

public class NavigationUIFactory {
    public static NavigationSteps get(AppiumDriver driver) {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidNavigationSteps(driver);
        } else {
            return new IOSNavigationSteps(driver);
        }
    }
}
