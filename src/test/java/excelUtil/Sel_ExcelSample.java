package excelUtil;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Sel_ExcelSample {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Test
    public void test_Sel_Excel() throws Exception {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait = new WebDriverWait(driver, 5);

        ExcelReader excel = new ExcelReader();
        excel.setExcelFile("./testData.xlsx", "Sheet1");
        String fullName = excel.getCellData("fullname", 1);
        String email = excel.getCellData("email", 1);
        String telephone = excel.getCellData("telephone", 1);
        String gender = excel.getCellData("gender", 1);

        driver.findElement(By.id("username")).sendKeys(fullName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("tel")).sendKeys(telephone);

        Select select = new Select(driver.findElement(By.name("sgender")));
        select.selectByValue(gender);


        Thread.sleep(3000);
        driver.quit();
    }
}