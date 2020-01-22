package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.MyListsSteps;
import lib.ui.android.AndroidMyListsSteps;
import lib.ui.ios.IOSMyListsSteps;

public class MyListsFactory {
    public static MyListsSteps get(AppiumDriver driver) {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidMyListsSteps(driver);
        } else {
            return new IOSMyListsSteps(driver);
        }
    }
}
