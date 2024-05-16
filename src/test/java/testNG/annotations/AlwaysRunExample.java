package testNG.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {
    @Test
    public void verifyLoginPage(){
        Assert.assertTrue(false);
        System.out.println("verify Login Page");
    }
    @Test(dependsOnMethods = "verifyLoginPage",alwaysRun = true)
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }
    @Test
    public void verifyFundTransferPage(){
        System.out.println("Verify Fund Transfer Page");
    }
}
