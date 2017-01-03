package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GoogleSearchPage extends BasicPage{

    public GoogleSearchPage(){

    }

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void isResultsVisible() {
        Assert.assertTrue("No search result is shown", driver.findElement(By.xpath("//*[@id='rso']")).isDisplayed());
    }

    public List<WebElement> getAllLinks() {
        return driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
    }

//    public void clickFirstLink() {
//        driver.findElement(By.xpath("/descendant::div[@id=\"rso\"]/descendant::a[1]")).click();
//
//    }





}
