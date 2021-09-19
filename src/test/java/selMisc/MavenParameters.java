package selMisc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenParameters {

    @Test
    public void TestParameter() throws InterruptedException {
        WebDriver driver = null;
        //String browser = "chrome";
        //String browser = System.getProperty("browser", "chrome");
        String browser = AppConfig.browser;

        String url = AppConfig.env+"."+AppConfig.url;
        System.out.println(url);

        if(browser.contains("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/skpatro/sel/chromedriver");
            driver = new ChromeDriver();
        }else
            if(browser.contains("firefox")){
                System.setProperty("webdriver.gecko.driver", "/Users/skpatro/sel/geckodriver");
                driver = new FirefoxDriver();
            }

        if(driver != null){
            driver.get("https://qavbox.github.io/demo/signup/");



            Thread.sleep(2000);
            driver.quit();
        }

    }
}
