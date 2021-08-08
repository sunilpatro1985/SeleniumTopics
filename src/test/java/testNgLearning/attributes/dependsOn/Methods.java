package testNgLearning.attributes.dependsOn;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Methods {

    @Test
    public void LoginTest() {

        System.out.println("z_login:testcaseloginlogic1");
        throw new SkipException("test");
    }

    @Test
    public void LoginTest_Country() {
        System.out.println("z_login:testcaseloginlogic1");
    }

    @Test(dependsOnMethods = {"LoginTest", "LoginTest_Country"})
    public void ReportTest() {
        System.out.println("d_report:testcasereportlogic");

    }

    @Test(dependsOnMethods = {"LoginTest", "LoginTest_Country"})
    public void AccountTest() {
        System.out.println("a_report:testcasereportlogic");
    }

    @Test(dependsOnMethods = {"LoginTest", "LoginTest_Country"})
    public void AccountTest_UI() {
        System.out.println("AccountUI:testcasereportlogic");
    }
}
