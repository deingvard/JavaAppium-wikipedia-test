package tests;

import lib.CoreTestCase;
import lib.Platform;
import lib.ui.ArticleSteps;
import lib.ui.MyListsSteps;
import lib.ui.NavigationSteps;
import lib.ui.SearchSteps;
import lib.ui.factories.ArticleFactory;
import lib.ui.factories.MyListsFactory;
import lib.ui.factories.NavigationUIFactory;
import lib.ui.factories.SearchFactory;
import org.junit.Test;

public class ArticleTests extends CoreTestCase {

    private static final String nameOfFolder = "Learning programming";
    private static final String searchLine = "Java";
    private static final String articleText = "Object-oriented programming language";

    @Test
    public void testSaveFirstArticleToMyList() {
        if (Platform.getInstance().isIOS()) {
            return;
        }
        SearchSteps searchSteps = SearchFactory.get(driver);

        searchSteps.initSearchInput();
        searchSteps.typeSearchLine(searchLine);
        searchSteps.clickByArticleWithSubstring(articleText);

        ArticleSteps articleSteps = ArticleFactory.get(driver);
        articleSteps.addArticleToMyList(nameOfFolder);

        NavigationSteps navigationSteps = NavigationUIFactory.get(driver);
        navigationSteps.clickMyListsOnPopUp();

        MyListsSteps myListsSteps = MyListsFactory.get(driver);
        myListsSteps.openFolderByName(nameOfFolder);
        myListsSteps.swipeByArticleToDelete("Java (programming language)");
    }

    @Test
    public void testCompareArticleTitle() {
        if (Platform.getInstance().isIOS()) {
            return;
        }
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        searchSteps.typeSearchLine(searchLine);
        searchSteps.clickByArticleWithSubstring(articleText);

        ArticleSteps articleSteps = ArticleFactory.get(driver);
        String articleTitle = articleSteps.getArticleTitle();

        assertEquals(
                "We see unexpected title",
                articleText,
                articleTitle);
    }

    @Test
    public void testSwipeArticle() {
        SearchSteps searchSteps = SearchFactory.get(driver);
        searchSteps.initSearchInput();
        searchSteps.typeSearchLine("Funter Bay");
        searchSteps.clickByArticleWithSubstring("Bay in Alaska");

        ArticleSteps articleSteps = ArticleFactory.get(driver);
        articleSteps.waitForTitleElement();
        articleSteps.swipeToFooter();
    }
}
