package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Staletest
{

    public static void main(String []args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        /*WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("QAVBOX");*/
        clear(driver, By.id("username"));
        type(driver, By.id("username"), "QAVBOX");

        //to-do
        //app got refreshed
        driver.navigate().refresh();

        /*
        username = driver.findElement(By.id("username"));
        System.out.println(username.getAttribute("value"));*/
        System.out.println(gettext(driver, By.id("username")));

        Thread.sleep(1000);
        driver.quit();
    }

    static void type(WebDriver driver, By by, String value){
        driver.findElement(by).sendKeys(value);
    }

    static void clear(WebDriver driver, By by){
        driver.findElement(by).clear();
    }

    static String gettext(WebDriver driver, By by){
        return driver.findElement(by).getAttribute("value");
    }

}
