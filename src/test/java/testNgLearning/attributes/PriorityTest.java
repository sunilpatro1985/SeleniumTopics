package testNgLearning.attributes;

import org.testng.annotations.Test;
import testNgLearning.afterbefore.BaseTest;

public class PriorityTest {


   /* @BeforeMethod
    public void OpenAut(){
        System.out.println("BeforeMethod : Open Aut");
    }

    @AfterMethod
    public void CloseAut(){
        System.out.println("AfterMethod : Close Aut");
    }*/

    //@Test(description="This login test will validate valid scenario", priority=1)
    public void z_login() {
        System.out.println("z_login:testcase login logic");
    }

    //@Test(description="This test is related report generation", priority=20)
    public void d_report() {
        System.out.println("d_report:testcase report logic");
    }

    //@Test(description="This test is related report generation", priority=30)
    public void a_report() {
        System.out.println("a_report:testcase report logic");
    }
}
