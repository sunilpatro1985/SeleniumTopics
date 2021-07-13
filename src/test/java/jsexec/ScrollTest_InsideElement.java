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

public class ScrollTest_InsideElement {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        //driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

        driver.get("https://qavbox.github.io/demo/webtable/");

        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState")
                .equals("complete"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //site = https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp
        /*WebElement el = driver.findElement(By.cssSelector("[jsname='d9BH4c']"));
        el.click();

        Thread.sleep(1000);

        js.executeScript("document.querySelector('.OA0qNb.ncFHed').scrollTop=200");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('.OA0qNb.ncFHed').scrollBy(0,400)");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('.OA0qNb.ncFHed').scrollBy(0,400)");
        */

        //site = https://qavbox.github.io/demo/webtable/
        js.executeScript("window.scrollBy(0, 300)");
        js.executeScript("document.querySelector('#table02').scrollTop=200");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('#table02').scrollBy(0,400)");

        Thread.sleep(5000);
        driver.quit();
    }
}
