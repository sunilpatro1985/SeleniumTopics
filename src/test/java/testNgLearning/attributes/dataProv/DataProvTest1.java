package testNgLearning.attributes.dataProv;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvTest1 {


    @Test(dataProvider = "data-set", dataProviderClass = DataProvTest.class)
    public void DataProvSampleTest1(Object obj1, Object obj2, Object obj3){
        System.out.println(obj1 + " " + obj2 + " " + obj3);
    }
}
