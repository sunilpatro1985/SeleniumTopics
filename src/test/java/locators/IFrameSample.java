package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IFrameSample {

    public static void main(String []args) throws InterruptedException {

        WebDriverWait wait;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/iframes/");
        Thread.sleep(2000);

        //print total no, of parent iframes on your screen
        //System.out.println(driver.findElements(By.tagName("iframe")).size());

        WebElement frame1 = driver.findElement(By.xpath("//iframe[1]"));
        driver.switchTo().frame(frame1); //by using webelement as parameter
        /*
        driver.switchTo().frame(0); //index
        driver.switchTo().frame("framename1");//parameter as name attribute
        driver.switchTo().frame("Frame1"); //parameter as id attribute
        */
        System.out.println(driver.findElement(By.id("frametext")).getText());
        System.out.println(driver.findElements(By.tagName("a")).size());
        Thread.sleep(3000);

        driver.switchTo().defaultContent(); //come out of iframe2

        driver.switchTo().frame("Frame2");
        driver.findElement(By.id("frameinput")).sendKeys("QAVBOX");
        driver.switchTo().defaultContent(); //come out of iframe2
        Thread.sleep(2000);
        driver.findElement(By.linkText("Pavilion")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
