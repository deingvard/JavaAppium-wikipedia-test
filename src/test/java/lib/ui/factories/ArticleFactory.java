package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.ArticleSteps;
import lib.ui.android.AndroidArticleSteps;
import lib.ui.ios.IOSArticleSteps;

public class ArticleFactory {
    public static ArticleSteps get(AppiumDriver driver) {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidArticleSteps(driver);
        } else {
            return new IOSArticleSteps(driver);
        }
    }

}
