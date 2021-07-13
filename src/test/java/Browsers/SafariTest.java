package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

    public static void main(String []args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new SafariDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        /*driver.findElement(By.className("EnterText")).sendKeys("QAVBOX");
        driver.findElement(By.id("email")).sendKeys("qavbox@gmail.com");
        driver.findElement(By.id("tel")).sendKeys("1684651");*/
        Thread.sleep(2000);
        //driver.findElement(By.name("home")).click();

        //driver.findElement(By.linkText("Tutorials!")).click();
        //driver.findElement(By.partialLinkText("Tuto")).click();

        //driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("QAVBOX");

        driver.findElement(By.cssSelector("input[name='uname']")).sendKeys("QAVBOX");
        Thread.sleep(2000);

        /*id -
        name or className
        linktext partiallink - links
        xpath & cssSelector

                <input type="text" data-id="username"></input>
        */
        driver.quit();
    }
}
