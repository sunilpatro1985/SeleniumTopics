package testNgLearning.invocCount;

import org.testng.annotations.Test;

public class InvocTest {

    @Test(invocationCount = 3, threadPoolSize = 2, timeOut = 2000)
    public void TestSample1() throws InterruptedException {
        Thread.sleep(1200);
        System.out.println("my first testng test");
        System.out.println("Thread: " + Thread.currentThread().getId());
    }
}
