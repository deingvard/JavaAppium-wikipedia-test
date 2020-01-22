package tests;

import lib.CoreTestCase;
import lib.ui.SearchSteps;
import lib.ui.factories.SearchFactory;
import org.junit.Test;

public class SearchTests extends CoreTestCase {

    private static final String searchLineJava = "Java";

    @Test
    public void testSearch() {
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        searchSteps.typeSearchLine(searchLineJava);
        searchSteps.waitForSearchResult("Object-oriented programming language");
    }

    @Test
    public void testCancel() {
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        searchSteps.typeSearchLine(searchLineJava);
        searchSteps.waitForCancelButtonToAppear();
        searchSteps.clickCancelSearch();
        searchSteps.waitForCancelButtonToDisappear();
    }

    @Test
    public void testAmountOfNotEmptySearch() {
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        String searchLine = "Mobile app development";
        searchSteps.typeSearchLine(searchLine);
        int amountOfSearchResults = searchSteps.getAmountOfFoundArticles();
        assertTrue(
                "We found too few results!",
                amountOfSearchResults > 0
        );
    }

    @Test
    public void testAmountOfEmptySearch() {
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        String searchLine = "vdgsbsfg435425334dvgfbsfnfhjnty";
        searchSteps.typeSearchLine(searchLine);
        searchSteps.waitForEmptyResultsLabel();
        searchSteps.assertThereIsNoResultOfSearch();
    }

    @Test
    public void testCheckSearchInBackgroung(){
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        searchSteps.typeSearchLine(searchLineJava);
        searchSteps.waitForSearchResult("Object-oriented programming language");
        this.backgroundApp(2);
        searchSteps.waitForSearchResult("Object-oriented programming language");
    }

    @Test
    public void testChangeScreenOrientationOnSearchResults() {
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        searchSteps.typeSearchLine(searchLineJava);
        this.rotateAndHideKeyboardScreenLandscape();
        searchSteps.waitForSearchResult("Object-oriented programming language");
        this.rotateAndHideKeyboardScreenPortrait();
        searchSteps.waitForSearchResult("Object-oriented programming language");
    }
}
