package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExceptionTest
{

    public static void main(String []args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        //driver.get("https://qavbox.github.io/demo/iframes/");
        Thread.sleep(1000);

        //driver.findElement(By.id("username")).sendKeys("QAVBOX");

        /*driver.findElement(By.name("home")).click();
        try{
           driver.switchTo().alert().accept();
        }catch(Exception e){
            System.out.println("No alert");
        }

        driver.findElement(By.linkText("SignUp Form")).click();
        */

        //driver.switchTo().frame("Frame3");

        /*new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username1")));
        driver.findElement(By.id("username")).sendKeys("QAVBOX");
*/
        Thread.sleep(1000);
        driver.quit();
    }

}
