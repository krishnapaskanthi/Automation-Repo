package testNG.annotations;

import org.testng.annotations.Test;

import java.lang.annotation.Target;

public class InvocationCountExample {

    @Test(invocationCount = 1000,invocationTimeOut = 1)
    public void invocationCountExample(){
        System.out.println("Invocation Count Example");
    }
}
