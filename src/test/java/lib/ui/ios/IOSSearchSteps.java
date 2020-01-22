package lib.ui.ios;
import io.appium.java_client.AppiumDriver;
import lib.ui.SearchSteps;
import org.openqa.selenium.WebElement;

public class IOSSearchSteps extends SearchSteps {

    static {
        SKIP = "xpath://XCUIElementTypeButton[@name='Skip']";
        SEARCH_INIT_ELEMENT = "id:Search Wikipedia";
        SEARCH_INPUT = "xpath://XCUIElementTypeSearchField";
        SEARCH_CANCEL_BUTTON = "xpath://XCUIElementTypeButton[@name='Clear text']";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://XCUIElementTypeLink[contains(@name,'{SUBSTRING}')]";
        SEARCH_RESULT_ELEMENT = "xpath://XCUIElementTypeLink";
        SEARCH_EMPTY_RESULT_ELEMENT = "xpath://XCUIElementTypeStaticText[@name='No results found']";
    }

//    private static final String SKIP1 = "xpath://XCUIElementTypeButton[@name='Skip']";
//
//    public WebElement getSkip1() {
//        return waitForElementPresent();
//    }

    public IOSSearchSteps(AppiumDriver driver) {
        super(driver);
    }

}
