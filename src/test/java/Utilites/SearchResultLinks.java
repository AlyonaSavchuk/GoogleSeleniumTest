package Utilites;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.GoogleSearchPage;

import java.util.List;



public class SearchResultLinks {

    protected WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


    public static WebElement getSearcResults(List<WebElement> searchResultList ){
        WebElement firstLink = searchResultList.get(0);
        return firstLink;
    }

    }




