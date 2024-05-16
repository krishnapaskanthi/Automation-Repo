package testNG.annotations;

import org.testng.annotations.*;

import javax.annotation.Tainted;

public class BeforeAfterMethodAnotherExample {
    @BeforeSuite
    public void beforeSuitDemo(){
        System.out.println("Before Suite");}
    @AfterSuite
    public void afterSuitDemo(){
        System.out.println("After Suite");
    }
    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTestDemo(){
        System.out.println("After Test");
    }
    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Before Method");
    }
    @Test(groups = "smoke")
    public void testCase1(){
        System.out.println("Test Case 1 ");
    }
    @Test
    public void testCase2(){
        System.out.println("Test Case 2 ");
    }
    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("After Method");
    }
}
