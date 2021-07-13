package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ButtonsSample {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        WebElement el = driver.findElement(By.name("home"));

        /*List<WebElement> buttons = driver.findElements(By.name("home"));
        System.out.println(buttons.size());*/

        String str = el.getAttribute("value");
        if(str.equals("Home")){
            System.out.println("test case passed");
        }

        el.click();
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.quit();
    }
}
