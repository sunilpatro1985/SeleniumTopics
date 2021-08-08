package testNgLearning.assertSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest_hard {

    @Test
    public void TestSample() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("qavbox");
        Assert.assertEquals(driver.findElement(By.id("username")).getAttribute("value")
                , "qavbox"); //step passed
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("qavbox@gmail.com");
        try {
            Assert.assertEquals(driver.findElement(By.id("email")).getAttribute("value")
                    , "qavbox"); //step failing
        }catch(AssertionError ae){
            System.out.println("email not entered correctly" + ae.getMessage());
        }
        Thread.sleep(1000);
        driver.findElement(By.id("tel")).sendKeys("16545135");

        /*softAssert.assertEquals(2, 3);

        softAssert.assertTrue(false);
        String str = null;
        softAssert.assertNull(str);

        System.out.println("DONE");

        softAssert.assertAll();

        System.out.println("DONE AGAIn");*/
        Thread.sleep(3000);
        driver.quit();
    }
}
