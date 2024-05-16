package testNG.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void annotationsMethod1() {
        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
      //  Assert.assertEquals(title, "Rediffmail", "Rediffmail Title Should be Mathch");
        Assert.assertEquals(title, "rediffmail", "rediffmail Title Should be Mathch");
       

        
    }
}
