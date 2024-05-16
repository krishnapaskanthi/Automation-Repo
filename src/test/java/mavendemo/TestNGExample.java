package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test(groups = "sanity")

    public void basicOfTestNG(){

        System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        driver.close();
    }
    @Test(groups = "sanity")
    public void basicOfTestNG1(){

        System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();

        driver.close();


    }

}
