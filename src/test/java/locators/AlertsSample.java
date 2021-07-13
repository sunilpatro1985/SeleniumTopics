package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsSample {

    public static void main(String []args) throws InterruptedException {
        WebDriverWait wait;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/alerts/");
        Thread.sleep(2000);

        //driver.findElement(By.name("commit")).click(); //simple alert

        //Thread.sleep(1000);

        //Alert alert = driver.switchTo().alert();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        /*
        driver.findElement(By.id("confirm")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();
        String text = driver.findElement(By.id("Parademo")).getText();
        Thread.sleep(2000);
        if(text.contains("Cancel")){
            System.out.println("Test case passed");
        }
        */
        driver.findElement(By.id("prompt")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("QAVBOX");
        alert.accept();
        Thread.sleep(2000);
        String text = driver.findElement(By.id("Parademo")).getText();

        if(text.contains("QAVBOX")){
            System.out.println("Test case passed");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
