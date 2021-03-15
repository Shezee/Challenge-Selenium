package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedMoviePageObjects {
    private WebDriver driver ;

    //Objects
    @FindBy(css = "div.title_wrapper h1")
    private WebElement movieTitle;

    //Methods
    public SelectedMoviePageObjects(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getMovieTitle(){return movieTitle;}
}
