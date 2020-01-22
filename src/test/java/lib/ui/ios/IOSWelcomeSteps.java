package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.WelcomeSteps;

public class IOSWelcomeSteps extends WelcomeSteps {

    static {
        STEP_LEARN_MORE_LINK = "id:Learn more about Wikipedia";
        STEP_NEW_WAYS_TO_EXPLORE_TEXT = "id:New ways to explore";
        STEP_ADD_OR_EDIT_PREFERRED_LANG_LINK = "id:Add or edit preferred languages";
        STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK = "id:Learn more about data collected";
        NEXT_LINK = "id:Next";
        GET_STARTED_BUTTON = "id:Get started";
    }

    public IOSWelcomeSteps(AppiumDriver driver){
        super(driver);
    }

}
