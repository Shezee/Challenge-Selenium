package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileManager {

    private Properties prop = new Properties();
    private FileInputStream fis;

    public FileManager() throws IOException {
       fis = new FileInputStream(Constants.Path.FILE_PATH);
       prop.load(fis);
    }

    public String getProperty(String propertyName) {
        return prop.getProperty(propertyName, "");
    }
}
