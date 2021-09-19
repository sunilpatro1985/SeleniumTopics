package testNgLearning.reporterLog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGListenerManager.class)
//public class SeleniumTest{

public class SeleniumTest extends Basetest{
        @Test
        public void MavenParamTest() throws InterruptedException {
                driver.get("https://qavbox.github.io/demo/links/");
                Reporter.log(driver.getTitle(), true);
                Thread.sleep(2000);
        }

        @Test
        public void MavenParamTest_fail() throws InterruptedException {
                driver.get("https://qavbox.github.io/demo");
                Reporter.log(driver.getTitle(), true);
                Assert.fail();
                Thread.sleep(2000);
        }
}