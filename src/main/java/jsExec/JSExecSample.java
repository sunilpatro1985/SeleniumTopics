package jsExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JSExecSample {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return document.getElementById('username').value='JTC INDIA';");
        System.out.println(js.executeScript("return document.getElementById('username').value;"));
        System.out.println(js.executeScript("return document.getElementById('lblname').innerText;"));
        //String BrowserTitle = (String) js.executeScript("return document.title");
        //System.out.println(BrowserTitle);

        //System.out.println((String)js.executeScript("return document.readyState"));

        //js.executeScript("return document.getElementById('username').value='JTC INDIA';");
        //el.sendKeys("JTC");
        //OR
        //js.executeScript("return document.getElementById('username').value='JTC INDIA';");

        //js.executeScript("return document.getElementByName('uname').value='JTC INDIA';");

        //WebElement el = (WebElement) js.executeScript("return document.getElementsByName('home')[0];");
        //el.click();
        //js.executeScript("arguments[0].click();", el);
        //or
        //js.executeScript("return document.getElementsByName('home')[0].click();");

        //CSSSelector
        //js.executeScript("return document.querySelector(\"input[name='experience'][value=four]\").click()");

        //xpath
        //document.evaluate()

        //highlight
        //js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);


        Thread.sleep(3000);
        driver.quit();
    }
}
