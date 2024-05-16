package testNG.annotations;

import org.testng.annotations.*;

public class BeforeAfterClassExample {

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassDemo(){
        System.out.println("After Class");
    }
    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Before Method");
    }
    @Test
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
