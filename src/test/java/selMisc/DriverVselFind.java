package selMisc;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.List;

public class DriverVselFind {
    @Test
    public void TestDiffFindEl() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/listitems/");
        /*List<WebElement> items =
                driver.findElements(By.tagName("li"));*

         */
        WebElement el =
                driver.findElement(By.id("subgroup"));

        List<WebElement> items =
                el.findElements(By.tagName("li"));

        System.out.println(items.size());
        Thread.sleep(2000);
        driver.quit();

    }
}
