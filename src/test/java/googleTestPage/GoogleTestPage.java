package googleTestPage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchPage;
import steps.DefaultSteps;

import java.util.concurrent.TimeUnit;

public class GoogleTestPage {
    private WebDriver driver;

    private DefaultSteps steps = new DefaultSteps();

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","C:\\3rdpartyresources\\FireFoxDriver\\GekoDrive\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
        steps.initialize(driver);
    }

  /*  @After
    public void tearDown(){
        driver.quit();
    }
    */

    @Test
    public void testSearch(){
      steps.typeSearchCriteria("Selenium");
     //   steps.clickSearch();
     //   steps.verifyResaults("Selenium - Web Browser");


/*
        HomePage home = new HomePage(driver);
        ResultPage result = home.search("Selenium");
        Assert.assertTrue(result.getFirstLink().contains("Selenium"));

        driver.findElement(By.xpath("/descendant::div[@id=\"rso\"]/descendant::a[1]")).click();
//        Assert.assertNotEquals("Something went wrong", 2, 1);
*/
    }
}
