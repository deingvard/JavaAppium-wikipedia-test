package lib.ui;

import io.appium.java_client.AppiumDriver;

abstract public class MyListsSteps extends MainPageObject {

    protected static String
            FOLDER_BY_NAME_TPL,
            ARTICLE_BY_TITLE_TPL,
            NO_THANKS_BUTTON;

    public MyListsSteps(AppiumDriver driver) {
        super(driver);
    }

    private static String getFolderXpathByName(String nameOfFolder) {
        return FOLDER_BY_NAME_TPL.replace("{FOLDER_NAME}", nameOfFolder);
    }

    private static String getSavedArticleXpathByTitle(String articleTitle) {
        return ARTICLE_BY_TITLE_TPL.replace("{TITLE}", articleTitle);
    }

    public void openFolderByName(String nameOfFolder) {
        this.waitForElementAndClick(NO_THANKS_BUTTON,
                "Cannot find 'No thanks' button",
                10
        );

        String folderNameXpath = getFolderXpathByName(nameOfFolder);
        this.waitForElementAndClick(folderNameXpath,
                "Cannot find folder by name " + nameOfFolder,
                35
        );
    }

    public void waitForArticleToAppearByTitle(String articleTitle) {
        String articleXpath = getFolderXpathByName(articleTitle);
        this.waitForElementPresent(articleXpath,
                "Cannot find saved article by title " + articleTitle,
                15);
    }

    public void waitForArticleToDisappearByTitle(String articleTitle) {
        String articleXpath = getFolderXpathByName(articleTitle);
        this.waitForElementNotPresent(articleXpath,
                "Saved article still present with title " + articleTitle,
                15);
    }

    public void swipeByArticleToDelete(String articleTitle) {
        this.waitForArticleToAppearByTitle(articleTitle);
        String articleXpath = getSavedArticleXpathByTitle(articleTitle);
        this.swipeElementToLeft(
                articleXpath,
                "Cannot find saved article");
        this.waitForArticleToDisappearByTitle(articleTitle);
    }

}
