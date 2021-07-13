package jsExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollSample {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);
            //checkBox not like CheckBox
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scroll(0, 150)");

        WebElement el = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].scrollIntoView(true);", el);

        //scrollTo(js, GO);


        Thread.sleep(3000);
        driver.quit();
    }

    /*
    static void scrollTo(JavascriptExecutor js, WebElement el){
        js.executeScript("arguments[0].scrollIntoView(true);", el);
    }*/
}
