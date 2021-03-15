package utilities;

public class Constants {

    public static class Key {
        public static String MOVIE_NAME = "movieName";
        public static String MOVIE_YEAR = "movieYear";
    }

    public static class Path {
        public static String CHROME_PATH = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver2.exe" ;
        public static String FIREFOX_PATH = System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe" ;
        public static String FILE_PATH = System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties" ;
        public static String REPORT_PATH = System.getProperty("user.dir")+"\\reports\\test.html";
        public static String DEST_FILE = System.getProperty("user.dir") + "\\screenshot\\";
    }
}
