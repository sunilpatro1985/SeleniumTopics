package testNgLearning.attributes.dependsOn;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Groups {

    @Test(groups="login")
    public void LoginTest() {
        System.out.println("z_login:testcaseloginlogic1");
        //throw new SkipException("test");
    }

    @Test(groups="loginCountry")
    public void LoginTest_Country() {
        System.out.println("z_login:testcaseloginlogic1");
    }

    @Test(dependsOnGroups = {"login.*"}, groups = {"report"})
    public void ReportTest() {
        System.out.println("d_report:testcasereportlogic");
        int a = 2/0;
    }

    @Test(dependsOnGroups = {"login.*", "report"}, groups={"account"})
    public void AccountTest() {
        System.out.println("a_report:testcasereportlogic");
    }

    @Test(dependsOnGroups = {"login.*", "report"},alwaysRun = true, groups={"account"})
    public void AccountTest_UI() {
        System.out.println("AccountUI:testcasereportlogic");
    }
}
