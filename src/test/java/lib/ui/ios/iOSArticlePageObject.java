package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class iOSArticlePageObject extends ArticlePageObject {

    static {
        OPTIONS_BUTTON = "xpath:(//*[@content-desc='More options'])[2]";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "id:Save for later";
        ADD_TO_MY_LIST_OVERLAY = "xpath://*[contains(@text,'Add \"Java (programming language)\" to a reading list?')]";
        MY_LIST_NAME_INPUT = "id:org.wikipedia:id/text_input";
        MY_LIST_OK_BUTTON = "id:button1";
        OPTION_CREATE_NEW_BUTTON = "xpath://*[contains(@text,'Create new')]";
    }

    public iOSArticlePageObject(AppiumDriver driver) {
        super(driver);
    }
}
