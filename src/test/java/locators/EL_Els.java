package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EL_Els {

    public static void main(String []args) throws InterruptedException {
        //WebDriverWait wait;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(2000);

        //wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //wait.until(ExpectedConditions.textToBePresentInElement(By.name("commit"))).click();


        /*WebElement el = driver.findElement(By.id("username"));
        el.click();
        el.sendKeys("QAVBOX");
        */

        //WebElement el = driver.findElement(By.cssSelector("input[type='text']"));
        //el.sendKeys("qavbox"); //index 0

         /*List<WebElement> textBoxes = driver.findElements(By.cssSelector("input[type='text']"));
        if(textBoxes.size() == 4){
            System.out.println("test case passed");
        }

        textBoxes.get(1).sendKeys("qavbox@gmail.com");

       for(WebElement textBox : textBoxes){
            System.out.println(textBox.getAttribute("value"));
        }*/

        List<WebElement> listItems = driver.findElements(By.className("ui-widget-content"));
        System.out.println(listItems.size());
        for(WebElement item : listItems){
            System.out.println(item.getText());
            if(item.getText().equals("JMeter")){
                System.out.println("testcase passed");
            }
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
