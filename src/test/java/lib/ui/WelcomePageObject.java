package lib.ui;

import io.appium.java_client.AppiumDriver;

public class WelcomePageObject extends MainPageObject {

    private static final String
            STEP_LEARN_MORE_LINK = "id:Learn more about Wikipedia",
            STEP_NEW_WAYS_TO_EXPLORE_TEXT = "id:New ways to explore",
            STEP_ADD_OR_EDIT_PREFERREAD_LANG_LINK = "id:Add or edit preferred languages",
            STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK = "id:Learn more about data collected",
            NEXT_LINK = "id:Next",
            GET_STARTED_BUTTON = "id:Get started",
            SKIP = "xpath://*[contains(@text,'Skip')]";

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

    public void waitForAddOrEditPrefferedLangText() {
        this.waitForElementPresent(STEP_ADD_OR_EDIT_PREFERREAD_LANG_LINK,
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

    public void clickSkip() {
        this.waitForElementAndClick(SKIP,
                "Cannot find and click 'Skip' button", 5);
        this.waitForElementPresent(SKIP,
                "Cannot find search 'Skip' button");
    }
}
