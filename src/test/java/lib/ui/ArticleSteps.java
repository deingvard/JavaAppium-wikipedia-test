package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.WebElement;


abstract public class ArticleSteps extends CommonHelper {

    protected static String
            TITLE,
            OPTIONS_BUTTON,
            OPTIONS_ADD_TO_MY_LIST_BUTTON,
            ADD_TO_MY_LIST_OVERLAY,
            MY_LIST_NAME_INPUT,
            MY_LIST_OK_BUTTON,
            OPTION_CREATE_NEW_BUTTON,
            FOOTER_ELEMENT;

    public ArticleSteps(AppiumDriver driver) {
        super(driver);
    }

    public void addArticleToMyList(String nameOfFolder) {
        this.waitForElementAndClick(OPTIONS_ADD_TO_MY_LIST_BUTTON,
                "Cannot find button to add article to reading list",
                15
        );

        this.waitForElementAndClick(ADD_TO_MY_LIST_OVERLAY,
                "Cannot find 'add...' overlay with button",
                15
        );

        this.waitForElementAndClick(OPTION_CREATE_NEW_BUTTON,
                "Cannot find 'Create new' button",
                10
        );

        this.waitForElementAndSendKeys(MY_LIST_NAME_INPUT,
                nameOfFolder,
                "Cannot find input to set name of articles folder",
                10
        );

        this.waitForElementAndClick(MY_LIST_OK_BUTTON,
                "Cannot press 'OK' button",
                10
        );

        this.waitForElementAndClick(OPTIONS_BUTTON,
                "Cannot find more options in menu",
                15
        );
    }

    public WebElement waitForTitleElement() {
        return this.waitForElementPresent(TITLE,
                "Cannot find article title on the page",
                15);
    }

    public String getArticleTitle() {
        WebElement titleElement = waitForTitleElement();
        return titleElement.getAttribute("text");
    }

    public void swipeToFooter() {
        if (Platform.getInstance().isAndroid()){
            swipeUpToFindElement(FOOTER_ELEMENT,
                    "Cannot find the end of the article",
                    20);
        } else {
            this.swipeUpTillElementAppear(FOOTER_ELEMENT,
                    "Cannot find article title on the page",
                    20);
        }
    }

}
