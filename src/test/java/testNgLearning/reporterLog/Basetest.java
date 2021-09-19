package testNgLearning.reporterLog;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Basetest {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        //Reporter.setCurrentTestResult(result);
        System.setProperty("webdriver.chrome.driver","/Users/skpatro/sel/chromedriver");
        driver = new ChromeDriver();
        Reporter.log("empty browser launched");
    }

    @AfterMethod
    public void failureSetup(ITestResult result) throws IOException {
        Reporter.setCurrentTestResult(result);
        File img = new File(System.getProperty("user.dir")+"/screen_"+result.getMethod().getMethodName()+".png");

        if(result.getStatus() == 2){ //failed scenaario
            Reporter.log("This is failed log from reporter.log", true);

            FileOutputStream screenshotStream = new FileOutputStream(img);
            screenshotStream.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            screenshotStream.close();

            Reporter.log(" <a href='"+img.getAbsolutePath()+"'> <img src='"+ img.getAbsolutePath()+"' height='200' width='200'/> </a>  ");

        }
    }
}
