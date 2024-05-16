package testNG.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameter {
    public static String courseName= "Java";

    public static String cityName= "Mumbai";

    @Test
    public void verifyParameter() throws InterruptedException {

        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\abhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys(courseName +" "+ cityName);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();

    }
}
