package testNG.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestExample {
    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before Test Demo For BeforeAfterTestExample ");
    }
    @AfterTest
    public void afterTestDemo(){
        System.out.println("After Test Demo For BeforeAfterTestExample ");
    }
    @Test
    public void verifyTestCase_1(){
        System.out.println("Verify Test Case 1");
    }
    @Test
    public void verifyTestCase_2(){
        System.out.println("Verify Test Case 2");
    }
}
