package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class ExpliWait {

    public static void main(String []args) throws InterruptedException {
        WebDriverWait wait;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://qavbox.github.io/demo/delay/");
        Thread.sleep(2000);

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        /*driver.findElement(By.cssSelector("input[value='Click me!']")).click();
        System.out.println("Start - " + new Date());
        try{
            wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("two")), "I am"));
            System.out.println("Text - " + driver.findElement(By.id("two")).getText());

            System.out.println("End - " + new Date());
        }catch(Exception e ){
            System.out.println("End - " + new Date());
        }*/

        WebElement button = driver.findElement(By.id("delay"));
        button.click();
        wait.until(ExpectedConditions.elementToBeClickable(button)).getText();

        //TimeOutExpectation


        /*Title = "abc"
        Next.click()
        wait.until(ExpectedConditions.titleIs("xyz")) //till title = xyz, selenium pauses the execution
        //to-do

        wait.until(ExpectedConditions.urlContains()*/

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        wait.until(ExpectedConditions.visibilityOfAllElements(inputs));
        //to-do

        WebElement busyLoader = driver.findElement(By.id("spinner"));
        wait.until(ExpectedConditions.invisibilityOf(busyLoader)); //wait till the spinner goes away
        //to-do

        Thread.sleep(3000);
        driver.quit();
    }
}
