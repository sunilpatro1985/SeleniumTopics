package locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDOMTest {
    WebDriver driver;
    JavascriptExecutor js;


    @Test
    public void ShadowTest_Nested() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://shop.polymer-project.org/");
        js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        WebElement parentShadowroot = getShadowRoot("[page='home']", true);
        WebElement childShadowHost = parentShadowroot.findElement(By.cssSelector("[name='home']"));
        WebElement childShadowroot = getShadowRoot(childShadowHost, true);

        System.out.println(childShadowroot.findElement(By.cssSelector("h2")).getText());
        Thread.sleep(2000);
        driver.quit();
    }

        @Test
    public void ShadowTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/shadowDOM/");

        js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //js.executeScript("document.querySelector('my-open-component').shadowRoot.querySelector('input').value=\"qavboxOpen\"");
        WebElement el = getShadowRoot("my-open-component", true);
        //WebElement el = getShadowRoot("my-open-component", true);
        el.findElement(By.cssSelector("input")).sendKeys("qavboxOpen");

        Thread.sleep(2000);
        //js.executeScript("document.querySelector('my-close-component')._root.querySelector('input').value=\"qavboxClose\"");
        WebElement closeEl = getShadowRoot("my-close-component", false);
        //closeEl.findElement(By.cssSelector("input")).sendKeys("qavboxClose");
        WebElement closeChildel = closeEl.findElement(By.cssSelector("input"));
        js.executeScript("arguments[0].value='qavboxClose'",closeChildel );


        Thread.sleep(2000);
        driver.quit();
    }

    public WebElement getShadowRoot(String querySelectorHost, boolean isOpen){
        if(isOpen){
            return (WebElement) (js.executeScript("return document.querySelector(\""+querySelectorHost+"\").shadowRoot"));
        }else
            return (WebElement) (js.executeScript("return document.querySelector('"+querySelectorHost+"')._root"));
    }

    public WebElement getShadowRoot(WebElement shadowHost, boolean isOpen){
        if(isOpen){
            return (WebElement) (js.executeScript("return arguments[0].shadowRoot", shadowHost));
        }else
            return (WebElement) (js.executeScript("return arguments[0].shadowRoot._root", shadowHost));
    }


}










/*

    public WebElement getShadowRoot(String querySelectorHost, boolean isOpen){
        WebElement host = driver.findElement(By.cssSelector(querySelectorHost));
        if(isOpen){
            return (WebElement) (js.executeScript("return arguments[0].shadowRoot", host));
        }else
            return (WebElement) (js.executeScript("return arguments[0]._root", host));
    }

    public WebElement getShadowEl(String selector, boolean isOpen){
        WebElement host = driver.findElement(By.cssSelector(selector));
        if(isOpen) {
            return (WebElement) js.executeScript("return arguments[0].shadowRoot", host);
        }else{
            return (WebElement) js.executeScript("return arguments[0]._root", host);
        }
    }

 */