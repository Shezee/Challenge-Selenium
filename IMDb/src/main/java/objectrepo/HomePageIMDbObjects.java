package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageIMDbObjects {

    private WebDriver driver ;

    //Objects

    @FindBy(id = "suggestion-search")
    private WebElement searchBox;

    @FindBy(className = "react-autosuggest__suggestions-list")
    private WebElement searchList;

    @FindBy(id = "react-autowhatever-1--item-0")
    private WebElement firstSearchItem ;

    @FindBy(xpath = "//li[@id = 'react-autowhatever-1--item-0']/a/div[2]/div[1]")
    private WebElement firstMovieName;

    @FindBy(xpath = "//li[@id = 'react-autowhatever-1--item-0']/a/div[2]/div[2]")
    private WebElement firstMovieYear;


    //Methods

    public HomePageIMDbObjects(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getSearchBox(){ return searchBox ;}

    public WebElement getSearchList(){ return searchList;}

    public WebElement getFirstSearchItem() {return firstSearchItem;}

    public WebElement getFirstMovieName(){return firstMovieName;}

    public WebElement getFirstMovieYear(){return firstMovieYear;}

    public String[] getMovieText()
    {
        String[] details = new String[2];
        details[0] = getFirstMovieName().getText();
        details[1] = getFirstMovieYear().getText() ;
        return details;
    }


}
