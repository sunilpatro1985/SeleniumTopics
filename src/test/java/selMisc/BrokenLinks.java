package selMisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/skpatro/sel/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/links/");


        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement el: links){
            String url = el.getAttribute("href");
            verifyLinks(url);
        }

    }

    private static void verifyLinks(String url) throws IOException {
        try{
            HttpsURLConnection conn =
                    (HttpsURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(5000);
            conn.connect();

            int status = conn.getResponseCode();
            String message = conn.getResponseMessage();

            if(status >= 400){
                System.out.println(url + " - broken " + " " + status + " " + message);
            }else{
                System.out.println(url + " - working " + " " + status + " " + message);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
