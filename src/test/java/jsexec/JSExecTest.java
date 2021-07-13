package jsexec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExecTest {
    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://qavbox.github.io/demo/signup/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        /*System.out.println(js.executeScript("return document.readyState"));
        System.out.println(js.executeScript("return document.URL"));
        System.out.println(js.executeScript("return document.title"));
        */

        //System.out.println(js.executeScript("return document.getElementsByName(\"home\")[0].value;"));

        //to enter some value to textbox
        //js.executeScript("return document.getElementById(\"username\").value = \"QAVBOX\";");

        /*WebElement el = (WebElement) (js.executeScript("return document.getElementById(\"username\");"));
        el.sendKeys("QAVBOX");
        */
        Thread.sleep(2000);
        //js.executeScript("return document.getElementsByName(\"home\")[0].click();");
        //WebElement el = (WebElement) (js.executeScript("return document.getElementsByName(\"home\")[0];"));
        //el.click();
        //or
        //js.executeScript("arguments[0].click();", el);

        //to fetch display text
        //System.out.println(js.executeScript("return document.getElementById(\"lblname\").innerText;"));

        //css selector to identify username field and enter vallue
        //js.executeScript("document.querySelector('input[id=\"username\"]').value=\"QAVBOX\" ;");
        //js.executeScript("document.querySelector('input[name=\"experience\"][value=\"three\"]').click() ;");

        //WebElement el = (WebElement) js.executeScript("return document.querySelector('input[id=\"username\"]');");
        WebElement el = driver.findElement(By.id("username"));
        js.executeScript("arguments[0].setAttribute('style','border: 2px solid red;background: bisque');", el);

        Thread.sleep(2000);
        driver.quit();
    }
}
