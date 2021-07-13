package jsexec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScrollTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavalidation.com/demo/");

        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState")
                .equals("complete"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll top to bottom with specific px
        //js.executeScript("window.scrollBy(0, 550)");

        //scroll till the element
        WebElement el = driver.findElement(By.id("submit"));
        //js.executeScript("arguments[0].scrollIntoView(true);", el);

        //scroll till end of the page
        //js.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");

        Actions action = new Actions(driver);
        action.moveToElement(el).perform();

        Thread.sleep(5000);
        driver.quit();
    }
}
