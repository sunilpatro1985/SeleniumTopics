package testNgLearning.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGListenerManager.class)
public class TC1{


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

    @Test(successPercentage = 50)
    public void tc_report1() {
        Assert.assertEquals(2, 4);
        Assert.assertEquals(1,1);
        //Assert.assertEquals(3,6);
    }
    int count = 0;
    @Test(invocationCount = 30, successPercentage = 50)
    public void successRate() {
        System.out.println("repeat..." + (++count));
        if (count > 15) {
            Assert.fail("fail with count > 15");
        }
    }


}
