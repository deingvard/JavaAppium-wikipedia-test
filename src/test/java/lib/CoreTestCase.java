package lib;

import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;
import org.openqa.selenium.ScreenOrientation;

// defining the platform
public class CoreTestCase extends TestCase {

    protected AppiumDriver driver;

    // call the driver
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        driver = Platform.getInstance().getDriver();
        this.rotateAndHideKeyboardScreenPortrait();
    }

    @Override
    protected void tearDown() throws Exception {
        driver.quit();
        super.tearDown();
    }

    protected void rotateAndHideKeyboardScreenPortrait() {
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.hideKeyboard();
    }

    protected void rotateAndHideKeyboardScreenLandscape() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
        driver.hideKeyboard();
    }

    protected void backgroundApp(int seconds){
        driver.runAppInBackground(seconds);
    }

}
