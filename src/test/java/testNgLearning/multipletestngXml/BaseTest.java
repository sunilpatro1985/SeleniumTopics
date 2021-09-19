package testNgLearning.multipletestngXml;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    @BeforeSuite
    public void BeforeSuite1(){
        System.out.println("BeforeSuite1: ");
    }

    @AfterSuite
    public void AfterSuite1(){
        System.out.println("AfterSuite1: ");
    }


    @BeforeTest
    public void OpenDB(){
        System.out.println("BeforeTest: Open DB");
    }

    @AfterTest
    public void CloseDB(){
        System.out.println("AfterTest: Close DB");
    }

    /*@BeforeMethod
    public void OpenAut(){
        System.out.println("BeforeMethod : Open Aut");
    }

    @AfterMethod
    public void CloseAut(){
        System.out.println("AfterMethod : Close Aut");
    }

    @BeforeClass
    public void OpenExcel(){
        System.out.println("BeforeClass : Opened excel sheet");
    }

    @AfterClass
    public void CloseExcel(){
        System.out.println("AfterClass : closed excel sheet");
    }*/
}
