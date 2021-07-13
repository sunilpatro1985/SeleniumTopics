package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownSample {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        WebElement el = driver.findElement(By.name("sgender"));
        Select select = new Select(el);
        /*
        select.selectByIndex(0);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        select.selectByValue("male");
        System.out.println(select.getFirstSelectedOption().getText());
        //System.out.println(select.getFirstSelectedOption().getAttribute("value"));
        Thread.sleep(2000);
        select.selectByVisibleText("Not Applicable");
        System.out.println(select.getFirstSelectedOption().getText());
        //or
        //select.selectByValue("na");

        //System.out.println(select.getFirstSelectedOption().getText());
        */

        List<WebElement>  options = select.getOptions();
        System.out.println("Dropdiwn items count - " + options.size());
        for(WebElement option: options){
            String name = option.getAttribute("value");
            //System.out.println(option.getAttribute("value"));
            //System.out.println(option.getText());
            if(name.equals("male")){
                option.click();
            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
