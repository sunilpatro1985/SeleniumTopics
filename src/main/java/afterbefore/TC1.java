package afterbefore;
import org.testng.annotations.*;

public class TC1 {
    @BeforeSuite
    public void setup() {
        System.out.println("BeforeSuite:Initiate database connection");
    }

    @BeforeTest
    public void openurl() {
        System.out.println("BeforeTest:Open the AUT URL");
    }

    @Test
    public void tc01() {
        System.out.println("Test:testcase logic");
    }

    @Test
    public void tc_report() {
        System.out.println("Test:testcase report logic");
    }

    @AfterTest
    public void closeurl() {
        System.out.println("AfterTest:close the AUT URL");
    }

    @AfterSuite
    public void closeAll() {
        System.out.println("AfterSuite:close database connection");
    }
}
