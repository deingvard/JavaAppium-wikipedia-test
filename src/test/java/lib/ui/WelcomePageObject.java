package lib.ui;

import io.appium.java_client.AppiumDriver;

abstract public class WelcomePageObject extends MainPageObject {

    protected static String
            STEP_LEARN_MORE_LINK,
            STEP_NEW_WAYS_TO_EXPLORE_TEXT,
            STEP_ADD_OR_EDIT_PREFERRED_LANG_LINK,
            STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK,
            NEXT_LINK,
            GET_STARTED_BUTTON;

    public WelcomePageObject(AppiumDriver driver) {
        super(driver);
    }

    public void waitForLearnMoreLink() {
        this.waitForElementPresent(STEP_LEARN_MORE_LINK,
                "Cannot find 'Learn more about Wikipedia' link", 10);
    }

    public void waitForNewWayToExploreText() {
        this.waitForElementPresent(STEP_NEW_WAYS_TO_EXPLORE_TEXT,
                "Cannot find 'New ways to explore' text", 10);
    }

    public void clickNextButton() {
        this.waitForElementAndClick(NEXT_LINK,
                "Cannot find and click 'Next' link", 10);
    }

    public void waitForAddOrEditPreferredLangText() {
        this.waitForElementPresent(STEP_ADD_OR_EDIT_PREFERRED_LANG_LINK,
                "Cannot find 'Reading lists with sync' text", 10);
    }

    public void clickGetStartedButton() {
        this.waitForElementAndClick(GET_STARTED_BUTTON,
                "Cannot find and click 'Get started' link", 10);
    }

    public void waitForLearnMoreAboutDataCollectedText() {
        this.waitForElementPresent(STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK,
                "Cannot find 'Send anonymous data' text", 10);
    }
}
