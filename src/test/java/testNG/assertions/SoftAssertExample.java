package testNG.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssert() {
        SoftAssert softAssert= new SoftAssert();
        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement userNameTextBox=driver.findElement(By.id("login1"));
        //  Assert.assertEquals(title, "Rediffmail", "Rediffmail Title Should be Mathch");
        Assert.assertEquals(title, "rediffmail", "rediffMail Title Should be Match");
        Assert.assertEquals(userNameTextBox.isDisplayed(),"Username textBox Should be displayed");
        System.out.println("Hello Everone..");
        softAssert.assertAll();
        driver.close();
;    }
}
