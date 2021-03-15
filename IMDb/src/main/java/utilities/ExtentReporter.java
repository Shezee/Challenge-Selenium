package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

    static ExtentReports extent;

    public static ExtentReports getReportObject()
    {

        ExtentSparkReporter reporter = new ExtentSparkReporter(Constants.Path.REPORT_PATH);
        reporter.config().setReportName("IMDb Search");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Shazeen Mahmood");
        return extent;
    }




}
