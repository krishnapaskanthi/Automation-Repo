package testNG.priority;

import org.testng.Assert;
import org.testng.annotations.Test;
import testNG.failtestscriptexecution.RetryFailTestScripts;

public class PriorityExample {
    @Test(priority = 4)
    public void priorityDemo_F(){
        System.out.println("priorityDemo_F");}
    @Test(priority = 'C')
    public void priorityDemo_M(){
        System.out.println("priorityDemo_M");}
    @Test(priority = 2)
    public void priorityDemo_H(){
        Assert.assertTrue(false);
        System.out.println("priorityDemo_H");}
    @Test(priority = 5)
    public void priorityDemo_A(){
        System.out.println("priorityDemo_A");}
    @Test(priority = 'M')
    public void priorityDemo_Z(){
        Assert.assertTrue(false);
        System.out.println("priorityDemo_Z");
    }
}
