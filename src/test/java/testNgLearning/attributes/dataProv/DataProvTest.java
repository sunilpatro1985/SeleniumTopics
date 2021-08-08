package testNgLearning.attributes.dataProv;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvTest {

    @DataProvider(name = "data-set")
    public static Object[][] DataSet(){
        //read the jason or excel data
        Object[][] obj = {{1,2,3}, {"qwerty", "qavbox", "qav"}};
        return obj;
    }

    @Test(dataProvider = "data-set")
    public void DataProvSampleTest(Object obj1, Object obj2, Object obj3){
        System.out.println(obj1 + " " + obj2 + " " + obj3);
    }
}
