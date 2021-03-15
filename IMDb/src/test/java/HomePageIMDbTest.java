import objectrepo.HomePageIMDbObjects;
import utilities.Constants;
import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import utilities.FileManager;

import java.io.IOException;


public class HomePageIMDbTest  {

    public WebDriver driver;
    private HomePageIMDbObjects hpObj;
    private String[] movieDetails ;
    private WebDriverWait wait;
    private FileManager fileManager;


    public HomePageIMDbTest() throws IOException {
        driver =  Driver.sharedInstance.driver;
        hpObj = new HomePageIMDbObjects (driver);
        wait = new WebDriverWait(driver,5000);
        fileManager = new FileManager();
    }

    @Test
    private void validateListOfSearchResults()
    {
        wait.until(ExpectedConditions.visibilityOf(hpObj.getSearchBox()));
        hpObj.getSearchBox().sendKeys(fileManager.getProperty("movieToSelect"));
        wait.until(ExpectedConditions.visibilityOf(hpObj.getSearchList()));
        Assert.assertTrue(hpObj.getSearchList().isDisplayed());
        movieDetails = hpObj.getMovieText();
        hpObj.getFirstSearchItem().click();


    }


    @AfterClass
    private void insertValueIntoAttribute(ITestContext ctx) {
        ctx.setAttribute(Constants.Key.MOVIE_NAME, movieDetails[0]);
        ctx.setAttribute(Constants.Key.MOVIE_YEAR, movieDetails[1]);
    }

    @AfterSuite
    private void quitBrowser()
    {
        driver.quit();
    }



}
