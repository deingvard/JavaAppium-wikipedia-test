package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.WelcomeSteps;
import lib.ui.android.AndroidWelcomeSteps;
import lib.ui.ios.IOSWelcomeSteps;

public class WelcomePageObjectFactory {
    public static WelcomeSteps get(AppiumDriver driver){
        if (Platform.getInstance().isAndroid()){
            return new AndroidWelcomeSteps(driver);
        }else {
            return new IOSWelcomeSteps(driver);
        }
    }
}
