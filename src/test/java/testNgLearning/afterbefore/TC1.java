package testNgLearning.afterbefore;
import org.testng.annotations.*;

public class TC1 extends BaseTest{


   /* @BeforeMethod
    public void OpenAut(){
        System.out.println("BeforeMethod : Open Aut");
    }

    @AfterMethod
    public void CloseAut(){
        System.out.println("AfterMethod : Close Aut");
    }*/

    @Test(description="This login test will validate valid scenario")
    public void tc_login() {
        System.out.println("Test:testcase login logic");
    }

    @Test(description="This test is related report generation")
    public void tc_report() {
        System.out.println("Test:testcase report logic");
    }


}
