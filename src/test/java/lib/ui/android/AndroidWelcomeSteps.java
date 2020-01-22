package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.WelcomeSteps;

public class AndroidWelcomeSteps extends WelcomeSteps {

    static {
        STEP_LEARN_MORE_LINK = "id:org.wikipedia:id/fragment_onboarding_skip_button";
        STEP_NEW_WAYS_TO_EXPLORE_TEXT = "xpath://*[@text='New ways to explore']";
        STEP_ADD_OR_EDIT_PREFERRED_LANG_LINK = "xpath://*[@text='Reading lists with sync']";
        STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK = "xpath://*[@text='Send anonymous data']";
        NEXT_LINK = "id:org.wikipedia:id/fragment_onboarding_forward_button";
        GET_STARTED_BUTTON = "xpath://*[@text='GET STARTED']";
    }

    public AndroidWelcomeSteps(AppiumDriver driver){
        super(driver);
    }

}
