package testNgLearning.attributes.dataProv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProv_Selenium {
    WebDriver driver;

    @DataProvider(name = "data-set")
    public static Object[][] DataSet(){
        //read the jason or excel data

        /*Object obj1 = "QAVBOX";
        obj1 = 123;
        obj1 = 2.3;

        String str = "QAVBOX";
        str = 123;*/

        Object[][] obj = {
                {"valid", "standard_user", "secret_sauce"},
                {"invalid", "standard_user", "123"}
                };
        return obj;
    }

    @Test(dataProvider = "data-set")
    public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        System.out.println(type + " " + username + " " + password);
        driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if(type.equals("valid")){
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[class='title']")));
        }else
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[data-test='error']")));

        Thread.sleep(2000);
        driver.quit();
    }
}
