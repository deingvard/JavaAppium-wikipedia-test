package lib.ui;

import io.appium.java_client.AppiumDriver;

abstract public class NavigationUI extends MainPageObject {

    protected static String MY_LISTS_LINK;

    public NavigationUI(AppiumDriver driver) {
        super(driver);
    }

    public void clickMyListsOnPopUp() {
        this.waitForElementAndClick(MY_LISTS_LINK,
                "Cannot find navigation to 'My list'",
                15
        );
    }

}
