package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxSample {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        List<WebElement> checkBoxes = driver.findElements(By.name("language"));
        System.out.println(checkBoxes.size()); //should be 5


        for(WebElement btn : checkBoxes){
            System.out.println(btn.getAttribute("value"));
            if(btn.getAttribute("value").equals("Selenium")){
                btn.click();
                System.out.println("selected? - " + btn.isSelected());
                System.out.println("Checked? - " + btn.getAttribute("checked"));
                //break;
            }
        }
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Java']")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
