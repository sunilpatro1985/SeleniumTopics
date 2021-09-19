package testNgLearning.reporterLog;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestNGListenerManager implements ITestListener {

    WebDriver driver;

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case -----" +
                result.getMethod().getMethodName() + " Started");

        System.setProperty("webdriver.chrome.driver","/Users/skpatro/sel/chromedriver");
        driver = new ChromeDriver();

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Test case -----" +
                result.getMethod().getMethodName() + " Passed", true);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        /*System.out.println("Test case -----" +
                result.getMethod().getMethodName() + " failed because of " +
                result.getThrowable());*/
        Reporter.log("Test case -----" +
                result.getMethod().getMethodName() + " failed because of " +
                result.getThrowable(), true);
        //Reporter.setCurrentTestResult(result);

        File img = new File(System.getProperty("user.dir")+"/screen_"+result.getMethod().getMethodName()+".png");

            Reporter.log("This is failed log from reporter.log", true);

        FileOutputStream screenshotStream = null;
        try {
            screenshotStream = new FileOutputStream(img);
            screenshotStream.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            screenshotStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Reporter.log(" <a href='"+img.getAbsolutePath()+"'> <img src='"+ img.getAbsolutePath()+"' height='200' width='200'/> </a>  ");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case -----" +
                result.getMethod().getMethodName() + " skipped because of " +
                result.getThrowable());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        System.out.println("success %");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start -----" + context.getName() + "-----");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Ended -----" + context.getName() + "-----");

    }
}
