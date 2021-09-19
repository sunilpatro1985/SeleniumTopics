package testNgLearning.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//public class SampleParameterTest extends Base {
public class SampleParameterTest extends Base {

    //@Parameters({"browser", "url"})
    //@Test()
    public void z_login(@Optional("firefox") String browserName, @Optional("https://saucedemo.com") String browserUrl) {
        System.out.println(browserName + " " + browserUrl);
    }

    //@Parameters({"browser", "url"})
    @Test()
    public void d_report() {
        System.out.println("Test case excuted");
    }

    //@Test(description="This test is related report generation", priority=30)
    public void a_report() {
        System.out.println("a_report:testcase report logic");
    }
}
