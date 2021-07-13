package locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class NewTab {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");

        WebDriver driver =  new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('[href=\\'/demo\\']').setAttribute('target', '_blank')");
        driver.findElement(By.cssSelector("[href='/demo']")).click();
        Thread.sleep(2000);*/

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('','_blank');");

        //WebElement el = driver.findElement(By.tagName("body"));
        //el.sendKeys(Keys.chord(Keys.COMMAND + "t"));


        //Actions action = new Actions(driver);
        //action.sendKeys(Keys.COMMAND).sendKeys(Keys.chord("t")).build().perform();


        String parentWindow = driver.getWindowHandle();
        Set<String> tabs = (Set<String>)driver.getWindowHandles();
        System.out.println(tabs.size());
        for(String tab : tabs)
        {
            if(!tab.equals(parentWindow)) //switch only if it's not parent window
            driver.switchTo().window(tab);
            driver.get("http://www.google.com/");
            System.out.println(driver.getTitle());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
