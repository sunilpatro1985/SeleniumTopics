package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDownSample {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        WebElement el = driver.findElement(By.id("tools"));
        Select select = new Select(el);

        /*select.selectByIndex(0);
        select.selectByValue("selenium");
        select.selectByVisibleText("TestStackWhite");
        List<WebElement> selectedItems = select.getAllSelectedOptions();
        for(WebElement itemSelected: selectedItems){
            System.out.println(itemSelected.getText());
        }*/


        List<WebElement>  options = select.getOptions();
        System.out.println("Dropdiwn items count - " + options.size());
        for(WebElement option: options){
            String name = option.getAttribute("value");
            //System.out.println(option.getAttribute("value"));
            //System.out.println(option.getText());
            if(name.equals("jmeter")){
                option.click();
            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
