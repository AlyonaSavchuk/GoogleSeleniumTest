package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleMainPage extends BasicPage {

    public GoogleMainPage() {
    }

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public void verifyTitle(String expectedTitle){
        Assert.assertEquals("Title is not correct" , expectedTitle , driver.getTitle());
        }

    public void typeInSearch(String searchText) {
        driver.findElement(By.id("lst-ib")).sendKeys(searchText);
    }

    public void clickSearchButton() {
        driver.findElement(By.cssSelector("#_fZl")).click();
    }

    }




