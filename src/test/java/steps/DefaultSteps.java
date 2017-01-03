package steps;

import Utilites.SearchResultLinks;
import Utilites.Utilities;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.GoogleMainPage;
import pages.GoogleSearchPage;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DefaultSteps  {

    private WebDriver driver;

    private GoogleMainPage mainPage = new GoogleMainPage(driver);
    private GoogleSearchPage searchPage = new GoogleSearchPage(driver);



    public void initialize(WebDriver driver) {
        this.driver = driver;
        mainPage.setDriver(driver);
        searchPage.setDriver(driver);
        System.out.println("Driver was initialized");
    }

    public void open(String url) {
        mainPage.open(url);
    }

    public void verifyTitle(String expectedTitle) {
        mainPage.verifyTitle(expectedTitle);
    }


    public void typeSearchCriteria(String searchText) {
        mainPage.typeInSearch(searchText);
    }

    public void clickSearch() {
        mainPage.clickSearchButton();
        Utilities.waitABit(2000);
    }

    public void verifyResultsAppears() {
        searchPage.isResultsVisible();

    }

    public void verifyFirstLink(String linkText) {
        assertFalse("There is no search result", searchPage.getAllLinks().isEmpty());
        String firstLinkText = searchPage.getAllLinks().get(0).getText();
        assertTrue("Link doesn't contain: '" + linkText + "'", firstLinkText.contains(linkText));
    }

    public void openFirstLink() {
       // searchPage.clickFirstLink();
//    !!    searchPage.getAllLinks().get(0).click();    //create separated class SearchResultLinks.
        List<WebElement> resultArray = searchPage.getAllLinks();
        SearchResultLinks.getSearcResults(resultArray).click();
        Utilities.waitABit(2000);
        //Create method that will return first link
    }

    public void verifyChangedURL(String previousURL){
       String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals("URL hasn't been changed", previousURL, currentURL);
      // Assert.assertNotEquals("URL hasn't been changed", searchPage.searchURL(), driver.getCurrentUrl());
    }


}
