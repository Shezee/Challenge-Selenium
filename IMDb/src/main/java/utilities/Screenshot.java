package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
    {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String failImg = Constants.Path.DEST_FILE + testCaseName+ ".png" ;
        FileUtils.copyFile(src, new File(failImg));
        return failImg;
    }
}
