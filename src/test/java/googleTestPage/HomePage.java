package googleTestPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }


    public ResultPage search(String text) {
        driver.findElement(By.id("hplogo"));
        driver.findElement(By.id("gs_htif0")).sendKeys(text);
        driver.findElement(By.id("_fZl")).click();
        return new ResultPage(driver);
    }
}
