package testNgLearning.listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGListenerManager.class)
public class TC2 extends BaseTest {

    @Test
    public void tc02() {
        System.out.println("Test:testcase TC2 logic1");
        throw new SkipException("testing skip");
    }

    @Test
    public void tc03() {
        System.out.println("Test:testcase TC2 logic2");
        int i = 2/0;
    }

    @Test
    public void tc04() {
        System.out.println("Test:testcase TC2 logic3");
    }

}
