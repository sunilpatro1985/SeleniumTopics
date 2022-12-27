package testNgLearning.attributes;

import org.testng.annotations.Test;
import testNgLearning.afterbefore.BaseTest;

public class PriorityTest {

        //priority starts from -n to n
        @Test(priority=-12)
        public void test1()
        {
            System.out.println("test1: priority -12");
        }

        @Test(priority=-2)
        public void test2()
        {
            System.out.println("test2: priority -2");
        }

        @Test(priority=3)
        public void test3()
        {
            System.out.println("test3: priority 3");
        }

        @Test(priority=2)
        public void test4()
        {
            System.out.println("test4: priority 2");
        }

        @Test(priority=0)
        public void test5()
        {
            System.out.println("test5: priority 0");
        }

        @Test
        public void test6()
        {
            System.out.println("test6: test231 no priority");
        }

        @Test
        public void test7()
        {
            System.out.println("test7: test2311 no priority");
        }

   /* @BeforeMethod
    public void OpenAut(){
        System.out.println("BeforeMethod : Open Aut");
    }

    @AfterMethod
    public void CloseAut(){
        System.out.println("AfterMethod : Close Aut");
    }*/

    /*
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
    */

}
