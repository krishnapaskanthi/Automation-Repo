package testNG.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test(groups = "smoke")
    public void verifyLoginPage(){
        Assert.assertTrue(true);
        System.out.println("verify Login Page");
    }
    @Test(dependsOnMethods = "verifyLoginPage")
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }
    @Test
    public void verifyFundTransferPage(){
        System.out.println("Verify Fund Transfer Page");
    }
}
