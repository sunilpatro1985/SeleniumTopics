package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTableSample {

    public static void main(String []args) throws InterruptedException {
        WebDriverWait wait;
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/webtable/");
        Thread.sleep(2000);

        /*
        //reading header text
        List<WebElement> Headers = driver.findElements(By.xpath("//table[@id='table01']/thead//th"));
        for(WebElement el : Headers){
            System.out.println(el.getText());
        }*/

        /*
        //reading the tbody cell data
        List<WebElement> Rows = driver.findElements(By.xpath("//table/tbody/tr"));
        for(WebElement row : Rows){
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for(WebElement cellData : cols){
                System.out.println(cellData.getText());
                if(cellData.getText().equals("QTP")){
                    System.out.println("test case passed!");
                }
            }
        }*/

        List<WebElement> Rows = driver.findElements(By.xpath("//table/tbody/tr"));
        /*System.out.println(Rows.size()); //no of rows
        for(WebElement row : Rows){
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for(WebElement cellData : cols){
                System.out.println(cellData.getText());
                if(cellData.getText().equals("Coded UI")){
                    //System.out.println("test case passed!");
                    cols.get(0).findElement(By.tagName("input")).click(); //checkbox click
                    cols.get(4).findElement(By.tagName("input")).click(); //delete button click
                    System.out.println(cols.get(4).findElement(By.tagName("input")).getAttribute("value"));
                }
            }
        }*/

        for(int i =0; i<Rows.size(); i++){
            List<WebElement> cols = Rows.get(i).findElements(By.tagName("td"));
            for(int j=1; j<=cols.size(); j++){
                String cell = driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[" +j+"]")).getText();
                System.out.println(cell);
            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
