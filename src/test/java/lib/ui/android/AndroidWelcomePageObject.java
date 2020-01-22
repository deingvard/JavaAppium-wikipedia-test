package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.WelcomePageObject;

public class AndroidWelcomePageObject extends WelcomePageObject {

    static {
        STEP_LEARN_MORE_LINK = "id:org.wikipedia:id/fragment_onboarding_skip_button";
        STEP_NEW_WAYS_TO_EXPLORE_TEXT = "xpath://*[@text='New ways to explore']";
        STEP_ADD_OR_EDIT_PREFERREAD_LANG_LINK = "xpath://*[@text='Reading lists with sync']";
        STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK = "xpath://*[@text='Send anonymous data']";
        NEXT_LINK = "id:org.wikipedia:id/fragment_onboarding_forward_button";
        GET_STARTED_BUTTON = "xpath://*[@text='GET STARTED']";
        SKIP = "xpath://*[contains(@text,'Skip')]";
    }

    public AndroidWelcomePageObject(AppiumDriver driver){
        super(driver);
    }

}
