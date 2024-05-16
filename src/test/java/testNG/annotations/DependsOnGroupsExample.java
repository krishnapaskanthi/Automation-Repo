package testNG.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {
    @Test(groups = "smoke")
    public void verifyUsernameTextBox(){
        Assert.assertTrue(false);
        System.out.println("Verify Username TextBox");
    }
    @Test(dependsOnGroups = "smoke")
    public void verifyPasswordTextBox(){
        System.out.println("Verify Password TextBox");
    }
    @Test
    public void verifyLoginButton(){
        System.out.println("Verify Login Button");
    }
}
