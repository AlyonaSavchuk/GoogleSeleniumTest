package steps;

import org.openqa.selenium.WebDriver;
import pages.GoogleMainPage;
import pages.GoogleSearchPage;

import static org.junit.Assert.assertTrue;

public class DefaultSteps {

    private WebDriver driver;

    private GoogleMainPage mainPage = new GoogleMainPage(driver);
    private GoogleSearchPage searchPage = new GoogleSearchPage(driver);

    public void initialize(WebDriver driver) {
        this.driver = driver;
        mainPage.setDriver(driver);
        System.out.println("Driver was initialized");
    }

    public void open(String url) {
        mainPage.open(url);
    }

  /*  public void verifyTitle(String stringTitle) {
        mainPage.verifyTitle(stringTitle);
    }
*/

    public void typeSearchCriteria(String searchText) {
        mainPage.typeInSearch(searchText);
    }

    public void clickSearch() {
        mainPage.clickSearchButton();
        waitUntilLoaded();
    }

    public void verifyResaults(String linkText) {
        String firstLinkText = searchPage.getAllLinks().get(0).getText();
        assertTrue(firstLinkText.contains(linkText));
    }

    public void openFirstLink() {

    }


    private void waitUntilLoaded() {
        try {
            driver.wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(searchPage.isResultsVisible());
    }
}
