package afterbefore;
import org.testng.annotations.*;


public class TC2 {
    @BeforeMethod
    public void openurl() {
        System.out.println("BeforeMethod:Open the AUT URL");
    }

    @Test
    public void tc02() {
        System.out.println("Test:testcase logic");
    }

    @Test
    public void tc03() {
        System.out.println("Test:testcase logic");
    }

    @AfterMethod
    public void closeurl() {
        System.out.println("AfterMethod:close the AUT URL");
    }

}
