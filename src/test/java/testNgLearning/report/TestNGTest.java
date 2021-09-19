package testNgLearning.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testNgLearning.afterbefore.BaseTest;

@Listeners(ReporterManager.class)
public class TestNGTest {

    @Test
    public void tc02() {
        int i = 2/0;
        System.out.println("Test:testcase TC2 logic1");
    }

    @Test
    public void tc02_fail() {
        System.out.println("Test:testcase TC2 logic1");
        Assert.assertEquals(2, 3);
    }

    @Test
    public void tc03() {
        System.out.println("Test:testcase TC2 logic2");
        throw new SkipException("skipped test");
    }

    @Test
    public void tc04() {
        System.out.println("Test:testcase TC2 logic3");
    }

    @Test
    public void tc05() {
        System.out.println("Test:testcase TC2 logic4");
    }

}
