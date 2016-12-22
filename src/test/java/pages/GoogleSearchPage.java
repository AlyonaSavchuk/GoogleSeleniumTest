package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSearchPage extends BasicPage{

    public GoogleSearchPage(WebDriver driver) {

    }

    @FindBy(xpath = "//*[@id='rso']")
    public WebElement resulArea;

    public boolean isResultsVisible() {
        return resulArea.isDisplayed();
    }

    public List<WebElement> getAllLinks() {
        return driver.findElements(By.xpath("/descendant::div[@id=\"rso\"]/descendant::a[1]"));
    }

}
