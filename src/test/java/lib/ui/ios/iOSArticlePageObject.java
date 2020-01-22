package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class iOSArticlePageObject extends ArticlePageObject {

    static {
        TITLE = "xpath://XCUIElementTypeStaticText[@name='Funter Bay']";
        OPTIONS_BUTTON = "xpath:(//*[@content-desc='More options'])[2]";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "id:Save for later";
        ADD_TO_MY_LIST_OVERLAY = "id:Add “Java (programming language)” to a reading list?";
        MY_LIST_NAME_INPUT = "id:reading list title";
        MY_LIST_OK_BUTTON = "id:Create reading list";
        OPTION_CREATE_NEW_BUTTON = "xpath://XCUIElementTypeButton[@name=\"Create a new list\"]";
        FOOTER_ELEMENT = "id:View article in browser";
    }

    public iOSArticlePageObject(AppiumDriver driver) {
        super(driver);
    }
}
