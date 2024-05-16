package testNG.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableTestExample {
    @Test(groups = "smoke")
    public void verifyUsernameTextBox(){
        Assert.assertTrue(false);
        System.out.println("Verify Username TextBox");
    }
    @Test(dependsOnGroups = "smoke")
    public void verifyPasswordTextBox(){
        System.out.println("Verify Password TextBox");
    }
    @Test(enabled = false)
    public void verifyLoginButton(){
        System.out.println("Verify Login Button");
    }
    @Test(enabled = true ,groups = "smoke")
    public void verifyLoginButton1(){
        System.out.println("Verify Login Button");
    }

}
