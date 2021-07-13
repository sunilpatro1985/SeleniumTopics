package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxSample {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        String str = "QAVBOX #$%@";
        WebElement el = driver.findElement(By.id("username"));
        el.sendKeys(str);

        String actual = el.getAttribute("value");
        if(actual.equals(str)){
            System.out.println("test case passed");
        }
        Thread.sleep(3000);

        el.clear(); //delete all the text box content
        actual = el.getAttribute("value");
        System.out.println("After clear - " + actual);
        if(actual.equals("")){
            System.out.println("clear() - test case passed ");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
