package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static Driver sharedInstance = new Driver();
    public  WebDriver driver;
    private FileManager fileManager;

    private Driver()  {
        if (driver == null) {
            try {
                fileManager = new FileManager();
                driver = driverInitialize(fileManager);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // returns a driver instance
    private  WebDriver driverInitialize(FileManager fileManager) throws IOException
    {
        //reading browser and website value from external file (.properties)
        String browser = fileManager.getProperty("browser");
        String website = fileManager.getProperty("website");

        //based on the value of browser in the external file, the relative browser driver is invoked

        //if browser = chrome
        if(browser.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver",Constants.Path.CHROME_PATH);
            driver = new ChromeDriver();
        }

        //if browser = firefox
        else if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.chrome.driver",Constants.Path.FIREFOX_PATH);
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(website);
        return driver;

    }

}
