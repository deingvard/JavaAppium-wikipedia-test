package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class AndroidArticlePageObject extends ArticlePageObject {

    static {
        TITLE = "xpath://*[@resource-id='pagelib_edit_section_title_description']";
        OPTIONS_BUTTON = "xpath://android.widget.ImageView[@content-desc='More options']";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "id:org.wikipedia:id/article_menu_bookmark";
        ADD_TO_MY_LIST_OVERLAY = "id:org.wikipedia:id/onboarding_button";
        MY_LIST_NAME_INPUT = "id:org.wikipedia:id/text_input";
        MY_LIST_OK_BUTTON = "id:android:id/button1";
        OPTION_CREATE_NEW_BUTTON = "xpath://*[contains(@text,'Create new')]";
        FOOTER_ELEMENT = "xpath://*[@text='View page in browser']";
    }

    public AndroidArticlePageObject(AppiumDriver driver) {
        super(driver);
    }
}
