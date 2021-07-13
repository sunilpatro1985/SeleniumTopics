package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class RightClick {
    public static void main(String []args) throws InterruptedException {

        WebDriverWait wait;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        Thread.sleep(2000);

        WebElement el = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
        Actions action = new Actions(driver);
        action.contextClick(el).sendKeys(Keys.ARROW_DOWN)
                .pause(Duration.ofMillis(2000))
                .sendKeys(Keys.ENTER).build()
                .perform();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.quit();

    }
}
