package tests;

import lib.CoreTestCase;
import lib.ui.WelcomeSteps;
import lib.ui.factories.WelcomePageObjectFactory;
import org.junit.Test;

public class GetStartedTest extends CoreTestCase {

    @Test
    public void testPassThroughWelcome() {
        WelcomeSteps welcomeSteps = WelcomePageObjectFactory.get(driver);
        welcomeSteps.waitForLearnMoreLink();
        welcomeSteps.clickNextButton();

        welcomeSteps.waitForNewWayToExploreText();
        welcomeSteps.clickNextButton();

        welcomeSteps.waitForAddOrEditPreferredLangText();
        welcomeSteps.clickNextButton();

        welcomeSteps.waitForLearnMoreAboutDataCollectedText();
        welcomeSteps.clickGetStartedButton();
    }

}
