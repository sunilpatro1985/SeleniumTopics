package testNgLearning.parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base {

    @Parameters({"browser", "url"})
    @BeforeTest
    public void setUp(@Optional("firefox") String browserName, @Optional("https://saucedemo.com") String browserUrl) throws InterruptedException {
        //write the logic to launch browser with url
            WebDriver driver;
            if(browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
                driver = new ChromeDriver();
            }else{
                System.setProperty("webdriver.gecko.driver", "/Users/skpatro/sel/geckodriver");
                driver = new FirefoxDriver();
            }


            driver.get(browserUrl);
            Thread.sleep(2000);
            driver.quit();
    }
}
