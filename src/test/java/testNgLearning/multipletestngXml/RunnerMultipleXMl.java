package testNgLearning.multipletestngXml;

import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RunnerMultipleXMl {

    public static void main(String []args){
        List<String> xmlfiles = new ArrayList<String>();
        xmlfiles.add("./testng_multipleTC1.xml");
        xmlfiles.add("./testng_multipleTC2.xml");

        TestNG testNG = new TestNG();
        testNG.setTestSuites(xmlfiles);
        testNG.run();
    }

}
