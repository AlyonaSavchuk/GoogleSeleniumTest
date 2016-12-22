package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;

public class GoogleMainPage extends BasicPage{

    public GoogleMainPage() {

    }

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "gs_htif0")
    private WebElement search;


    @FindBy(css = "#_fZl")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='hplogo']")
    public WebElement googleTitle;

    public void open(String url) {
        driver.get(url);
    }
/*
    public void verifyTitle(String title){
        String googleMainTitle = googleTitle.getAttribute(title);

    }
*/
    public void typeInSearch(String searchText) {
        driver.findElement(By.id("gs_htif0")).sendKeys(searchText);
        //search.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
