package testNgLearning.multipletestngXml;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC1 extends BaseTest {


    @Test(description="This login test will validate valid scenario")
    public void tc_login() {

        System.out.println("Test:testcase login logic");
        int i = 1/0;
    }

    @Test(description="This test is related report generation")
    public void tc_report() {
        System.out.println("Test:testcase report logic");
        throw new SkipException("testing");
    }


}
