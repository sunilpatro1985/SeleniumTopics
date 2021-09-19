package testNgLearning.listeners;

import org.testng.*;

public class TestNGListenerManager implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case -----" +
                result.getMethod().getMethodName() + " Started");
        Reporter.log("Test case -----" +
                result.getMethod().getMethodName() + " Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case -----" +
                result.getMethod().getMethodName() + " Passed");
        Reporter.log("Test case -----" +
                result.getMethod().getMethodName() + " Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case -----" +
                result.getMethod().getMethodName() + " failed because of " +
                result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case -----" +
                result.getMethod().getMethodName() + " skipped because of " +
                result.getThrowable());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        System.out.println("success %");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start -----" + context.getName() + "-----");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Ended -----" + context.getName() + "-----");

    }
}
