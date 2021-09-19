package testNgLearning.report;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ReporterManager implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        for(ISuite suite : suites){
            System.out.println("Suite name - " + suite.getName());

            Map<String, ISuiteResult> results = suite.getResults();

            for(ISuiteResult sr: results.values()){
               ITestContext tc =  sr.getTestContext();

                System.out.println( "Test tag Name - " + tc.getName() + " "
                        + "Test start time " + tc.getStartDate()  + " "
                        + "Test start time " + tc.getEndDate() + " "
                        + "Test report output dir " + tc.getOutputDirectory());


                Collection<ITestNGMethod> failedMethods =
                        tc.getFailedTests().getAllMethods();

                System.out.println(("Total failed methods count - " +
                        failedMethods.size()));
                System.out.println("Test methods are - ");
                for(ITestNGMethod tm : failedMethods){
                    System.out.println(tm.getMethodName() + " "
                            + tm.getDescription());
                }

                System.out.println("passed test count - " +
                        tc.getPassedTests().getAllResults().size());

                System.out.println("Skipped test count - " +
                        tc.getSkippedTests().getAllResults().size());
            }
        }

        System.out.println("Outpur html report path - " +
                outputDirectory);
    }
}
