package tests;

import objectrepo.SelectedMoviePageObjects;
import utilities.Constants;
import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectedMovieIMDbTest {

    public String movieName,movieYear;
    public WebDriver driver;
    private SelectedMoviePageObjects smObj;

    @BeforeClass
    public void fetchData(ITestContext ctx) {
        movieName = (String) ctx.getAttribute(Constants.Key.MOVIE_NAME);
        movieYear = (String) ctx.getAttribute(Constants.Key.MOVIE_YEAR);
    }


    public SelectedMovieIMDbTest()  {
        driver = Driver.sharedInstance.driver;
        smObj = new SelectedMoviePageObjects(driver);
    }

    @Test
    public void verifyMovieTitle()
    {
        String pageTitle = smObj.getMovieTitle().getText();
        Assert.assertEquals(pageTitle,movieName + " (" + movieYear + ")");
    }
}
