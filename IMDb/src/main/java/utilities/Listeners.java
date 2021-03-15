package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends Screenshot implements ITestListener {

    ExtentReports extent = ExtentReporter.getReportObject();
    ExtentTest test;


    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        extent.flush();
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult result) {

        WebDriver driver = null;
        String testName = result.getMethod().getMethodName();
        test.fail(result.getThrowable());

        try
        {
            driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
            test.addScreenCaptureFromPath(getScreenshot(testName,driver),result.getMethod().getMethodName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        test.log(Status.PASS,"Test Passed");
    }
}
