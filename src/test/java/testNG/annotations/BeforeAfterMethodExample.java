package testNG.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
         driver=new ChromeDriver();
    }
    @Test
    public void annotationsMethod1(){
         driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
    @Test
    public void annotationsMethod2() {
         driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }
}
